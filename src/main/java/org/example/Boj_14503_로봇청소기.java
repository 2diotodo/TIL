package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_14503_로봇청소기
public class Boj_14503_로봇청소기 {
    static int N,M, cnt;
    static int r,c,d;
    static int[][] room;
    static int[] di = {-1,0,1,0}; // 북동남서
    static int[] dj = {0,1,0,-1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        room = new int[N][M];

        st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        cnt = 1;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<M; j++){
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cleaning(r,c,d);

        System.out.print(cnt);

    } // end main
    public static void cleaning(int r, int c, int dir){
        // 조건1. 현재칸청소
        room[r][c]=-1;
        // 조건2. 사방탐색
        for(int k=0; k<4; k++){
            // 회전
            dir = (dir+3)%4;
            int nr = r + di[dir];
            int nc = c + dj[dir];
            // 청소된 빈칸 있는 경우
            if(nr>=0 && nr<N && nc>=0 && nc<M){
                if(room[nr][nc]==0){
                    cnt++;
                    cleaning(nr,nc,dir);

                    return;
                }
            }
        }
        // 청소된 빈칸 없는 경우
        int nd = (dir+2) % 4;
        int nr = r + di[nd];
        int nc = c + dj[nd];
        if(nr>=0 && nr<N && nc>=0 && nc<M && room[nr][nc]!=1){
            cleaning(nr,nc,dir);
        }

    } // end cleaning
} // end class