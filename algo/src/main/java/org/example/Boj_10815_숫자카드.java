package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// Boj_10815_숫자카드
public class Boj_10815_숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int t = 0; t < M; t++) {
            int T = Integer.parseInt(st.nextToken());
            sb.append(binary(cards, N, T)).append(" ");
        }
        System.out.println(sb);
    } // end main

    static int binary(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (cards[mid] == search) {
                return 1;
            }
            if (cards[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    } // end binary
} // end class
