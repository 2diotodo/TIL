package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Boj_17086_아기상어2
public class Boj_17086_아기상어2 {
    static int N,M,ans;
    static int[][] map;
    static boolean[][] v;
    static ArrayList<Shark> sharks;
    static int[] di = {-1,-1,-1,0,1,1,1,0}; // \|/-/|\-
    static int[] dj = {1,0,-1,-1,-1,0,1,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        sharks = new ArrayList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    sharks.add(new Shark(i,j));
                    map[i][j]=0;
                }else{
                    map[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for(Shark list : sharks){
            bfs(list.r, list.c);
        }
//        for(int i=0; i<N; i++){
//            System.out.println(Arrays.toString(map[i]));
//        }

        ans = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]!=0){
                    ans = Math.max(ans,map[i][j]);
                }
            }
        }

        System.out.print(ans);
    } // end main

    static void bfs(int r, int c){
        ArrayDeque<Shark> q = new ArrayDeque<>();
        v = new boolean[N][M];
        q.offer(new Shark(r,c));

        while (!q.isEmpty()) {
            Shark now = q.poll();
            r = now.r;
            c = now.c;

            for(int d=0; d<8; d++){
                int nr = r + di[d];
                int nc = c + dj[d];
                if(nr>=0 && nr<N && nc>=0 && nc<M){
                    if(!v[nr][nc] && map[nr][nc]!=-1){
                        map[nr][nc] = Math.min(map[nr][nc], map[r][c]+1);
                        v[nr][nc] = true;
                        q.offer(new Shark(nr,nc));
                    }
                }
            }
        }
    }

  static class Shark{
        int r,c;
        Shark(int r, int c){
            this.r = r;
            this.c = c;
        }
  }
} // end class