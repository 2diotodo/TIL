package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Boj_1747_소수&펠린드롬
public class Boj_1747_소수펠린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10000001];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if(arr[i]==0) continue;

            for (int j = i + i; j < arr.length; j = j + i) {
                arr[j]=0;
            }
        }

        int i=N;
        while (true) {
            if (arr[i] != 0) {
                int res = arr[i];
                if (isPalindrome(res)) {
                    System.out.println(res);
                    break;
                }
            }
            i++;
        }
    } // end main

    static boolean isPalindrome(int n) {
        char[] tmp = String.valueOf(n).toCharArray();
        int s = 0;
        int e = tmp.length -1;
        while (s < e) {
            if (tmp[s] != tmp[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
} // end class
