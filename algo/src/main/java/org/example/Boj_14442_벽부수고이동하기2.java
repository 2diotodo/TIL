package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_14442_벽부수고이동하기2
public class Boj_14442_벽부수고이동하기2 {
    static int N,M,K,ans;
    static int[][] map;
    static boolean[][][] v;
    static int[] di = {0,1,0,-1}; // 좌하우상
    static int[] dj = {1,0,-1,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        v = new boolean[N][M][K+1];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }
        ans = -1;
        bfs();

        System.out.println(ans);
    } // end main
    static void bfs(){
        ArrayDeque<Node> q = new ArrayDeque<>();
        v[0][0][0] = true;
        q.offer(new Node(0,0,1,0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            int i = node.y;
            int j = node.x;

            if(i==N-1 && j==M-1){
                ans = node.d;
                break;
            }

            for(int d=0; d<4; d++){
                int ni = i + di[d];
                int nj = j + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M){
                    if(map[ni][nj]==0 && !v[ni][nj][node.broke]){ // not wall
                        v[ni][nj][node.broke] = true;
                        q.offer(new Node(ni,nj,node.d+1,node.broke));
                    }else{                                        // wall
                        if(node.broke<K && !v[ni][nj][node.broke+1]){
                            v[ni][nj][node.broke+1] = true;
                            q.offer(new Node(ni,nj,node.d+1,node.broke+1));
                        }
                    }
                }
            }
        }
    } // end bfs
    static class Node{
        int y,x,d,broke;
        Node(int y, int x, int d, int broke){
            this.y = y;
            this.x = x;
            this.d = d;
            this.broke = broke;
        }
    }
} // end class