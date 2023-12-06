package main.java.org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_3273_두수의합
public class Boj_3273_두수의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());
        boolean[] sum = new boolean[2000001];
        int cnt = 0;

        for(int i=0; i<N; i++){
            // X가 더 작은경우 생각
            if(X-arr[i]>0 && sum[X-arr[i]]) cnt++;
            sum[arr[i]]=true;
        }

        System.out.println(cnt);

    } // end main
} // end class
