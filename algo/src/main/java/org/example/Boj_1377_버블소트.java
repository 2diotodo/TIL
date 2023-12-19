package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Boj_1377_버블소트
public class Boj_1377_버블소트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Index[] arr = new Index[N+1];

        for(int i=1; i<=N; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = new Index(tmp, i);
        }
        Arrays.sort(arr, 1, N+1);
        int max = 0;
        for(int i=1; i<=N; i++){
            max = Math.max(max, arr[i].idx - i);
        }

        System.out.println(max+1);
        br.close();
    } // end main
    static class Index implements Comparable<Index>{
        int num, idx;

        Index(int num, int idx){
            this.num = num;
            this.idx = idx;
        }
        @Override
        public int compareTo(Index o){  // 오름차순 정렬
            return num - o.num;
        }
    }
} // end class
