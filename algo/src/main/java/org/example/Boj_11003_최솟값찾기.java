package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_11003_최솟값찾기
public class Boj_11003_최솟값찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 전체길이
        int L = Integer.parseInt(st.nextToken());   // 슬라이딩윈도우길이

        ArrayDeque<Node> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            int now = Integer.parseInt(st.nextToken());

            // 새로 들어오는 값이 덱에 저장된 값보다 크면 제거
            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, now));

            // 슬라이딩 윈도우 범위에서 벗어난 값 덱에서 제거
            if (deque.getFirst().index <= i-L) {
                deque.removeFirst();
            }
            sb.append(deque.getFirst().value + " ");
        }
        System.out.print(sb);

        br.close();
    } // end main
    static class Node{
        int index, value;

        Node(int index, int value){
            this.index = index;
            this.value = value;
        }
    } // end Node
} // end class
