package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// Boj_1456_거의소수
public class Boj_1456_거의소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long[] arr = new long[10000001];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        // 10^7까지 전체 소수 판별
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j < arr.length; j = j + i) {
                arr[j] = 0;
            }
        }
        int cnt = 0;
        for (int i = 2; i < 10000001; i++) {
            if (arr[i] != 0) {
                long tmp = arr[i];
                while ((double) arr[i] <= (double) B / (double) tmp) {
                    if ((double) arr[i] >= (double) A / (double) tmp) {
                        cnt++;
                    }
                    tmp = tmp * arr[i];
                }
            }
        }
        System.out.println(cnt);

    } // end main
} // end class
