package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소동전개수
public class Dp_최소동전개수_hynauto {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        char[] types = new char[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            types[i] = st.nextToken().charAt(0);
            coins[i] = Integer.parseInt(st.nextToken());
        }

        int res = minCoins(coins, types, N, M);
        System.out.println(res);


    } // end main

    static int minCoins(int[] coins, char[] types, int n, int m){
        int[] dp = new int[m+1];
        dp[0] = 0;

        for(int i=1; i<=m; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(types[j]=='A' && i>=coins[j]){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }else if(types[j]=='B' && i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }

        // 추가: A코인을 한 번만 사용할 수 있도록 조건 추가
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < n; j++) {
                if (types[j] == 'A' && i >= coins[j]) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[m] == Integer.MAX_VALUE ? -1 : dp[m];
    }// end minCoins
} // end class
