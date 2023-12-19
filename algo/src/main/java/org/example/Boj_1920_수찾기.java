package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Boj_1920_수찾기
public class Boj_1920_수찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        int[] target = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<M; i++) {
            boolean find = false;
            // 이진탐색
            int start = 0;
            int end = N-1;
            while (start <= end) {
                int mid = (start+end) / 2;
                int midV = arr[mid];
                if (midV > target[i]) {
                    end = mid - 1;
                } else if (midV < target[i]) {
                    start = mid +1;
                }else{
                    find = true;
                    break;
                }
            }
            if (find) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.print(sb);
    } // end main
} // end class
