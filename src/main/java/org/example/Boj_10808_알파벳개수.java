package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Boj_10808_알파벳개수
public class Boj_10808_알파벳개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        String str = br.readLine();
        char[] len = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            len[i] = str.charAt(i);
            arr[len[i]-'a']++;
        }

        for(int i=0; i<26; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    } // end main
} // end class
