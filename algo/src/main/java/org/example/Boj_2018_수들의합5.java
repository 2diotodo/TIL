package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_2018_수들의합5
public class Boj_2018_수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        int N = Integer.parseInt(br.readLine());

        while (end_index != N) {
            if (sum == N) {
                cnt++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            }else{
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(cnt);
    } // end main
} // end class
