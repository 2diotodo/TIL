package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_1012_유기농배추
public class Boj_1012_유기농배추 {
    static int N;
    static int M;
    static int K;
    static int[][] square;
    static boolean[][] v;
    static int cnt;
    static int[] di = {0,1,0,-1}; // 우하좌상
    static int[] dj = {1,0,-1,0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        // input
        for(int T=0; T<tc; T++){
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            square = new int[N][M];
            v = new boolean[N][M];
            cnt = 0;

            for(int k=0; k<K; k++){
                st = new StringTokenizer(br.readLine(), " ");
                int i = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());
                square[i][j] = 1;
            }

            // output
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(!v[i][j] && square[i][j]==1) {
                        bfs(i,j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        } // end tc
        System.out.print(sb);
    } // end main

    public static void bfs(int i, int j){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        v[i][j] = true;
        q.offer(new int[] {i,j});

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int y = temp[0];
            int x = temp[1];

            for(int d=0; d<4; d++){
                int ni = y + di[d];
                int nj = x + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M){
                    if(!v[ni][nj] && square[ni][nj]==1){
                        v[ni][nj] = true;
                        q.offer(new int[] {ni, nj});
                    }
                }
            }
        } // end while
    } // end bfs
} // end class