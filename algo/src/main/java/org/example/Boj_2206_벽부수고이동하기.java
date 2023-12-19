package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_2206_벽부수고이동하기
public class Boj_2206_벽부수고이동하기 {
    static int N,M,ans;
    static int[][] map;
    static boolean[][][] v;
    static int[] di = {0,1,0,-1};
    static int[] dj = {1,0,-1,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        v = new boolean[N][M][2];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

        ans=-1;
        bfs();

        System.out.print(ans);
    } // end main

    static public void bfs(){
        ArrayDeque<Node> q = new ArrayDeque<>();
        v[0][0][0]=true;
        q.offer(new Node(0,0,1,false));

        while(!q.isEmpty()){
            Node cur = q.poll();
            int i = cur.y;
            int j = cur.x;

            if(i==N-1 && j==M-1){
                ans = cur.d;
                break;
            }

            for(int d=0; d<4; d++){
                int ni = i + di[d];
                int nj = j + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M){
                    if(map[ni][nj]==0){     // not wall
                      if(cur.broke && !v[ni][nj][1]){
                          v[ni][nj][1]=true;
                          q.offer(new Node(ni,nj,cur.d+1,true));
                      }else if(!cur.broke && !v[ni][nj][0]){
                          v[ni][nj][0]=true;
                          q.offer(new Node(ni,nj,cur.d+1, false));
                      }
                    }else{                  // wall
                        if(!cur.broke && !v[ni][nj][0]){
                            v[ni][nj][0]=true;
                            q.offer(new Node(ni,nj,cur.d+1,true));
                        }
                    }
                }
            }
        } // end while
    } // end bfs

    public static class Node{
        int y,x,d;
        boolean broke;
        Node(int y, int x, int d, boolean broke){
            this.y = y;
            this.x = x;
            this.d = d;
            this.broke = broke;
        }
    } // end Node
} // end class