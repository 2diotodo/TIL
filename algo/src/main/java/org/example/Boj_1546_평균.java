package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_1546_평균
public class Boj_1546_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int M = 0;
        double sum = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            M = Math.max(M, arr[i]);
        }

        for(int i=0; i<N; i++){
            sum += arr[i];
        }

        double ans = sum*100/M/N;
        System.out.print(ans);

    } // end main
} // end class
