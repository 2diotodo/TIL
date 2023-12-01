package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_11720_숫자의합
public class Boj_11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            arr[i] = str.charAt(i)-'0';
            sum += arr[i];
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(sum);

    } // end main
} // end class
