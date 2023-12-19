package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// Boj_2169_로봇조종하기
public class Boj_2169_로봇조종하기 {
    static int N,M;
    static int[][] map;
    static int[][] dp;
    static int[][] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N+1][M+1];
        dp = new int[N+1][M+1];
        tmp = new int[2][M+2];

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1] = map[1][1];

        // 첫 째줄 단방향 결정
        for(int j=2; j<=M; j++){
            // 다음 dp값은 현재위치 map값과 이전까지의 dp값 합한 것
            dp[1][j] = map[1][j] + dp[1][j-1];
        }
        for(int i=2; i<=N; i++){
            // 우향, 하향 비교
            tmp[0][0] = dp[i-1][1];
            for(int j=1; j<=M; j++){
                tmp[0][j] = Math.max(tmp[0][j-1], dp[i-1][j]) + map[i][j];
            }

            // 좌향, 하향 비교
            tmp[1][M+1] = dp[i-1][M];
            for(int j=M; j>=1; j--){
                tmp[1][j] = Math.max(tmp[1][j+1], dp[i-1][j]) + map[i][j];
            }
            // tmp[0][] tmp[1][] 비교(좌우향비교)
            for(int j=1; j<=M; j++){
                dp[i][j] = Math.max(tmp[0][j], tmp[1][j]);
            }
        }

        System.out.println(dp[N][M]);
        br.close();
    } // end main
} // end class
