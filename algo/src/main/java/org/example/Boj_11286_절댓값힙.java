package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// Boj_11286_절댓값힙
public class Boj_11286_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
           int first_abs = Math.abs(o1);
           int second_abs = Math.abs(o2);
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;        // 절댓값 같을시 음수우선정렬
            }else {
                return first_abs - second_abs;  // 절댓값기준정렬
            }
        });

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){   // 0인경우
                if (pq.isEmpty()) {  // 큐가 빈 경우 0출력
                    sb.append(0).append("\n");
                }else{              // 비어있지 않으면 절댓값 가장 작은값 출력(작은값우선)
                    sb.append(pq.poll()).append("\n");
                }
            }else {         // 0이 아닌 경우
                pq.offer(num);
            }
        }
        System.out.println(sb);
    } // end main
} // end class
