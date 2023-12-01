package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Boj_1037_약수
public class Boj_1037_약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int ans;
        int num = Integer.parseInt(br.readLine());
        int[] div = new int[num];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<num; i++){
            div[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(div);
        ans = div[0]*div[num-1];

        System.out.println(ans);

    } // end main
} // end class
