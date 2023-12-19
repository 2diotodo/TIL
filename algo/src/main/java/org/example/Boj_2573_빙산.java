package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_2573_빙산
public class Boj_2573_빙산 {
    static int N,M,year;
    static int[][] map;
    static boolean[][] v;
    static int[] di = {-1,0,1,0}; // 상좌하우
    static int[] dj = {0,-1,0,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while(true){
            v = new boolean[N][M];
            int cnt = 0;
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(!v[i][j] && map[i][j]!=0){
                        bfs(i,j,v);
                        cnt++;
                    }
                }
            }

            if (cnt == 0) {
                year=0;
                break;
            }else if(cnt>=2){
                break;
            }
            year++;
            melt();
        }

        System.out.println(year);

    } // end main
    // 빙산덩어리 개수 check
    static void bfs(int r, int c, boolean[][] visited){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        visited[r][c] = true;
        q.offer(new int[] {r,c});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            r = now[0];
            c = now[1];

            for(int d=0; d<4; d++){
                int nr = r + di[d];
                int nc = c + dj[d];
                if(nr>=0 && nr<N && nc>=0 && nc<M){
                    if(map[nr][nc]>0 && !visited[nr][nc]){
                        q.offer(new int[]{nr,nc});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
    } // bfs
    // 빙산 녹이기
    static void melt(){
        ArrayDeque<int[]> q = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]>0){
                    q.offer(new int[] {i,j});
                    v[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int i = now[0];
            int j = now[1];
            int sea = 0;

            for(int d=0; d<4; d++){
                int ni = i + di[d];
                int nj = j + dj[d];
                if(ni>=0 && ni<N && nj>=0 && nj<M){
                    if(!v[ni][nj] && map[ni][nj]==0){
                        sea++;
                    }
                }
            }

            if(map[i][j] - sea < 0){
                map[i][j] = 0;
            }else{
                map[i][j] -= sea;
            }
        }
    } // melt
} // end class