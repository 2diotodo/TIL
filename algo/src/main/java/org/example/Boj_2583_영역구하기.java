package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Boj_2583_영역구하기
public class Boj_2583_영역구하기 {
    static int N,M,K,split,cnt;
    static List<Integer> list;
    static int[][] map;
    static boolean[][] v;
    static int[] di = {0,1,0,-1};
    static int[] dj = {1,0,-1,0};


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        split = 0;
        map = new int[N][M];
        v = new boolean[N][M];

        for(int k=0; k<K; k++){
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int i=y1; i<y2; i++){
                for(int j=x1; j<x2; j++){
                    map[i][j]=-1;
                }
            }
        }

        list = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                cnt=0;
                if(map[i][j]==0 && !v[i][j]){
                    bfs(i,j);
                    split++;
                    list.add(cnt+1);
                }
            }
        }
        Collections.sort(list);
        sb.append(split).append("\n");
        for(int i=0; i<split; i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.print(sb);

    } // end main
    static public void bfs(int i, int j){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        v[i][j]=true;
        q.offer(new int[] {i,j});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            i = cur[0];
            j = cur[1];

            for(int d=0; d<4; d++){
                int ni = i + di[d];
                int nj = j + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M){
                    if(!v[ni][nj] && map[ni][nj]==0){
                        v[ni][nj]=true;
                        map[ni][nj] = map[i][j]+1;
                        cnt++;
                        q.offer(new int[] {ni,nj});
                    }
                }
            }
        }
    } // end bfs
} // end class