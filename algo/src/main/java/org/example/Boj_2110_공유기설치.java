package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Boj_2110_공유기설치
public class Boj_2110_공유기설치 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] line = new int[N];
        for(int i=0; i<N; i++){
            line[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(line);

        int left = 1; // 최소거리 최소값
        int right = line[N-1] - line[0]; // 최소거리 최대값
        int dis = 0;
        int ans = 0;

        while(left <= right){
            int mid = (left + right) / 2; // 기준
            int start = line[0];
            int cnt = 1;
            // 간격(dis)기준으로 공유기 설치
            for(int i=0; i<N; i++){
                dis = line[i] - start;
                if(dis>=mid){
                    cnt++;
                    start = line[i];
                }
            }

            if(cnt>=C){
                // 공유기 줄이기 -> 간격넓히기
                ans = mid;
                left = mid + 1;
            }else{
                // 공유기 늘리기 -> 간격좁히기
                right = mid - 1;
            }
        }
        System.out.println(ans);


    } // end main

} // end class