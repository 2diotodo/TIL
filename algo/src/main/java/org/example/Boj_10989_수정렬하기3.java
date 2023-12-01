package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Boj_10989_수정렬하기3
public class Boj_10989_수정렬하기3 {
    static int N;
    static int[] arr;
    static long res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        radixSort(arr, 5);
        for(int i=0; i<N; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);

    } // end main
    static void radixSort(int[] arr, int maxSize){
        int[] output = new int[N];
        int letter = 1;
        int cnt = 0;
        while (cnt != maxSize) {
            int[] bucket = new int[10];
            for(int i=0; i<N; i++){
                bucket[arr[i]/letter %10]++;
            }
            for(int i=1; i<10; i++){
                bucket[i] += bucket[i-1];
            }
            for(int i=N-1; i>=0; i--){
                output[bucket[arr[i]/letter % 10] - 1] = arr[i];
                bucket[arr[i]/letter % 10]--;
            }
            for(int i=0; i<N; i++){
                arr[i] = output[i];
            }
            letter = letter*10;
            cnt++;
        }
    } // end radixSort
} // end class
