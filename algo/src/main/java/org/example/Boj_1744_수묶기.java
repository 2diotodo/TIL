package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


// Boj_1744_수묶기
public class Boj_1744_수묶기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 1) {
                plusPq.offer(num);
            } else if (num == 1) {
                one++;
            } else if (num == 0) {
                zero++;
            }else{
                minusPq.offer(num);
            }
        }
        int sum = 0;
        while (plusPq.size() > 1) {
            int first = plusPq.poll();
            int second = plusPq.poll();
            sum = sum + first * second;
        }
        if (!plusPq.isEmpty()) {
            sum += plusPq.poll();
        }

        while (minusPq.size() > 1) {
            int first = minusPq.poll();
            int second = minusPq.poll();
            sum = sum + first * second;
        }
        if (!minusPq.isEmpty()) {
            if (zero == 0) {
                sum += minusPq.poll();
            }
        }

        sum += one;
        System.out.println(sum);
    } // end main
} // end class
