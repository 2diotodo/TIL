package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_7569_토마토
public class Boj_7569_토마토 {
    static int M, N, H, ans;
    static int[][][] box;
    static boolean[][][] v;
    static int[] dk = {-1,1,0,0,0,0}; // 위,아래,왼,오,앞,뒤
    static int[] di = {0,0,0,0,1,-1};
    static int[] dj = {0,0,-1,1,0,0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];
        v = new boolean[H][N][M];
        ans = -1;

        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine(), " ");
                for(int j=0; j<M; j++){
                    box[k][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        // output
        bfs();

        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(box[k][i][j]==0){
                        System.out.println(-1);
                        return;
                    }
                    ans = Math.max(ans, box[k][i][j]);
                }
            }
        }
        System.out.println(ans-1);
    } // end main

    public static void bfs(){
        ArrayDeque<Tomato> q = new ArrayDeque<>();
        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(box[k][i][j]==1 && !v[k][i][j]){
                        v[k][i][j]=true;
                        q.offer(new Tomato(k,i,j));
                    }
                }
            }
        }

        while(!q.isEmpty()){
            Tomato now = q.poll();

            for(int d=0; d<6; d++){
                int nk = now.z + dk[d];
                int ni = now.y + di[d];
                int nj = now.x + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M && nk>=0 && nk<H){
                    if(!v[nk][ni][nj] && box[nk][ni][nj]==0){
                        v[nk][ni][nj]=true;
                        box[nk][ni][nj] = box[now.z][now.y][now.x]+1;
                        q.offer(new Tomato(nk,ni,nj));
                    }

                }
            }
        }// end while
    } // end bfs
    static public class Tomato{
        int z, y, x;
        public Tomato(int z, int y, int x){
            this.z = z;
            this.y = y;
            this.x = x;
        }
    }
} // end class