package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_2343_기타레슨
public class Boj_2343_기타레슨 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int start = 0;
        int end = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            // 총 블루레이 길이는 가장 긴 강의길이부터 모든 강의길이의 합 이내
            if(start < arr[i]) start = arr[i];
            end = end + arr[i];
        }

        while (start <= end) {
            // 중간값부터 조건 충족하는지 검사
            int mid = (start+end) / 2;
            int sum = 0;    // 검사할 강의길이 합
            int cnt = 0;    // 블루레이 개수
            for (int i = 0; i < N; i++) {
                if (sum + arr[i] > mid) {
                    cnt++;
                    sum = 0;
                }
                sum += arr[i];
            }
            if (sum != 0) {
                cnt++;
            }
            if (cnt > M) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        System.out.println(start);
    } // end main
} // end class
