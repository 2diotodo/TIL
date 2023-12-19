package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

// Boj_2164_카드게임
public class Boj_2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            q.offer(i);
        }

        while(q.size()>1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    } // end main
} // end class
