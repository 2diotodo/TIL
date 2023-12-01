package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// Boj2178_미로탐색
public class Boj_2178_미로탐색 {
    static int N,M;
    static char[][] arr;
    static int[][] ans;
    static boolean[][] v;
    static int[] dy = {0,1,0,-1}; // 우하좌상
    static int[] dx = {1,0,-1,0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        v = new boolean[N][M];
        ans = new int[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        // output
        ans[0][0]=1;
        bfs(0,0);
//        dfs(0,0);

        System.out.println(ans[N-1][M-1]);
    } // end main

    public static void bfs(int i, int j){
        Queue<int[]> q = new ArrayDeque<>();
        v[i][j] = true;
        q.offer(new int[] {i,j});
        while (!q.isEmpty()){
            int [] ij = q.poll();
            i = ij[0];
            j = ij[1];

            // break condition
            if(i==N-1 && j==M-1){
                break;
            }
            for(int d=0; d<4; d++){
                int ni = i + dy[d];
                int nj = j + dx[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M && !v[ni][nj] && arr[ni][nj]=='1'){
                    v[ni][nj] = true;
                    ans[ni][nj] = ans[i][j]+1;
                    q.offer(new int[] {ni, nj});
                }
            }
        }
    } // end bfs

    public static void dfs(int i, int j){
        v[i][j]=true;

        // 기저조건
        if(i==N-1 && j==M-1){
            return;
        }

        for(int d=0; d<4; d++){
            int ni = i+dy[d];
            int nj = j+dx[d];
            if(ni>=0 && ni<N && nj>=0 && nj<M && !v[ni][nj] && arr[ni][nj]=='1'){
                ans[ni][nj] = ans[i][j]+1;
                dfs(ni, nj);
            }
        }

    } // end dfs
} // end class