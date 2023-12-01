package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


// Boj_1715_카드정렬하기
public class Boj_1715_카드정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            pq.offer(tmp);
        }

        int a,b = 0;
        int sum = 0;
        while (pq.size() != 1) {
            a = pq.poll();
            b = pq.poll();
            sum += a + b;
            pq.offer(a + b);
        }
        System.out.println(sum);
    } // end main
} // end class
