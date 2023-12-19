package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Boj_1874_스택수열
public class Boj_1874_스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;        // 오름차순 스택
        boolean possible = true;    // 수열생성가능여부
        for(int i=0; i<N; i++){
            int now = arr[i];   // 현재 목표값
            if (now >= num) {           // 목표값이 들어갈 스택보다 크면
                while (now >= num) {    // 목표값까지 스택쌓고(push) 마지막 목표값 꺼내기(pop)
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{                      // 목표값이 들어갈 스택보다 작으면
                int n = stack.pop();    // 일단 pop
                if (n > now) {          // 꺼낸 숫자가 목표값보다 크면 수열생성불가
                    System.out.println("NO");
                    possible =  false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if(possible) System.out.println(sb);
    } // end main
} // end class
