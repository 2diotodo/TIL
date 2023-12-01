package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_12891_DNA비밀번호
public class Boj_12891_DNA비밀번호 {
    static int[] ACGT;  // 조건
    static int[] checkNow;  // 현재상태
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] arr = new char[S];
        ACGT = new int[4];
        checkNow = new int[4];
        int res = 0;

        arr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            ACGT[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<P; i++){
            if(arr[i]=='A') checkNow[0]++;
            if(arr[i]=='C') checkNow[1]++;
            if(arr[i]=='G') checkNow[2]++;
            if(arr[i]=='T') checkNow[3]++;
        }

        if(check()){
            res++;
        }
        int i = -1;
        for(int j=P; j<S; j++){
            i = j - P;
            // remove
            if(arr[i]=='A') checkNow[0]--;
            if(arr[i]=='C') checkNow[1]--;
            if(arr[i]=='G') checkNow[2]--;
            if(arr[i]=='T') checkNow[3]--;
            // add
            if(arr[j]=='A') checkNow[0]++;
            if(arr[j]=='C') checkNow[1]++;
            if(arr[j]=='G') checkNow[2]++;
            if(arr[j]=='T') checkNow[3]++;

            if(check()) res++;
        }

        System.out.println(res);
    } // end main
    static boolean check(){
        for(int i=0; i<4; i++){
            if(checkNow[i] < ACGT[i]){
                return false;
            }
        }
        return true;
    }
} // end class
