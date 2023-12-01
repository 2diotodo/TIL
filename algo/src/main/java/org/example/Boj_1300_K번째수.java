package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Boj_1300_K번째수
public class Boj_1300_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        long start = 1;
        long end = k;
        long ans = 0;

        while (start <= end) {
            long mid = (start+end) / 2;
            long cnt = 0;

            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }
            if (cnt < k) {
                start = mid +1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }
        System.out.println(ans);

    } // end main
} // end class
