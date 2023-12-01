package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_10986_나머지합
public class Boj_10986_나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sum = new long[N];
        long[] cnt = new long[M]; // 나머지 개수 담을 배열
        long ans = 0;

        st = new StringTokenizer(br.readLine());
        sum[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++){
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            int remain = (int) (sum[i] % M);
            if(remain==0) ans++;
            cnt[remain]++; // 나머지 개수 카운팅
        }

        for(int i=0; i<M; i++){
            if(cnt[i] > 1){
                ans = ans + (cnt[i] * (cnt[i]-1))/2;
            }
        }

        System.out.println(ans);

    } // end main
} // end class
