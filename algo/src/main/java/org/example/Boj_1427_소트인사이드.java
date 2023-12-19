package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// Boj_1427_소트인사이드
public class Boj_1427_소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Integer[] arr = new Integer[str.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }

        System.out.println(sb);
    } // end main
} // end class
