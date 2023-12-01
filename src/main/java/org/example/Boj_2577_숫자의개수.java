package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_2577_숫자의개수
public class Boj_2577_숫자의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int N = A*B*C;
        int[] nums = new int[10];
        String str1=Integer.toString(N);

        char[] let = new char[str1.length()];
        let = str1.toCharArray();

        for(int i=0; i<let.length; i++){
            nums[let[i]-'0']++;
        }

        for(int i=0; i<10; i++){
            sb.append(nums[i]).append("\n");
        }

        System.out.println(sb);

    } // end main
} // end class
