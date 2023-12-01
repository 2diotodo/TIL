package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Boj_1253_좋다
public class Boj_1253_좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int cnt=0;
        for(int k=0; k<N; k++){
            long find=arr[k];
            int i=0;
            int j=N-1;
            while (i < j) {
                if(arr[i] + arr[j] == find){
                    // 서로다른 두 수 조건
                    if(i!=k && j!=k){
                        cnt++;
                        break;
                    } else if (i == k) {
                        i++;
                    }else if(j==k){
                        j--;
                    }
                } else if (arr[i] + arr[j] < find) {
                    i++;
                }else{
                    j--;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    } // end main
} // end class
