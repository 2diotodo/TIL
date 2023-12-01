package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_14502_연구소
public class Boj_14502_연구소 {
    static int N, M;
    static int ans = -1;
    static int[][] square;
    static int[] di = {0,1,0,-1}; // 우하좌상
    static int[] dj = {1,0,-1,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        square = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // output
        dfs(0);

        System.out.print(ans);
    } // end main

    public static void dfs(int cnt){
        if(cnt==3){
            bfs();
            return;
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(square[i][j]==0){
                    square[i][j]=1;
                    dfs(cnt+1);
                    square[i][j]=0;

                }
            }
        }
    }// end dfs
    public static void bfs(){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(square[i][j]==2){
                    q.offer(new int[] {i,j});
                }
            }
        }

        // deep copy
        int[][] copyMap = new int[N][M];
//        for(int i=0; i<N; i++){
//            copyMap[i] = square[i].clone();
//        }
        for(int i=0; i<N; i++){
            System.arraycopy(square[i], 0, copyMap[i], 0, M);
        }

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int y = temp[0];
            int x = temp[1];

            for(int d=0; d<4; d++){
                int ni = y + di[d];
                int nj = x + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M){
                    if(copyMap[ni][nj]==0){
                        copyMap[ni][nj]=2;
                        q.offer(new int[] {ni, nj});
                    }
                }
            }
        } // end while
        safeZone(copyMap);
    } // end bfs

    public static void safeZone(int[][] map){
        // safezone size
        int area=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0) {
                    area++;
                }
            }
        }
        ans = Math.max(ans, area);
    }
} // end class