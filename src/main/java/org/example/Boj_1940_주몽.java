package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Boj_1940_주몽
public class Boj_1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int i = 0;
        int j = N-1;
        while (i < j) {
            if (arr[i] + arr[j] < M) {
                i++;
            } else if (arr[i] + arr[j] > M) {
                j--;
            }else{
                cnt++;
                i++;
                j--;
            }
        }

        System.out.print(cnt);
        br.close();
    } // end main
} // end class
