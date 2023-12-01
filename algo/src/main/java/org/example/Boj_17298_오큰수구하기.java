package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// Boj_17298_오큰수구하기
public class Boj_17298_오큰수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 주어진 수열
        int[] ans = new int[N]; // 정답 수열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();   // index 담을 stack
        stack.push(0);
        for(int i=1; i<N; i++){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){    // 오큰수 조건
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }

        for(int i=0; i<N; i++){
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);
        br.close();
    } // end main
} // end class
