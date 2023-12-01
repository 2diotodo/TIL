package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj2447_별찍기10
public class Boj_2447_별찍기10 {
    static char[][] square;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        square = new char[N][N];

        division(0, 0, N, false);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(square[i][j]);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    } // end main

    public static void division(int row, int col, int size, boolean blank){
        // 공백
        if(blank){
            for(int i=row; i<row+size; i++){
                for(int j=col; j<col+size; j++){
                    square[i][j]=' ';
                }
            }
            return;
        }
        // *찍기
        if(size==1){
            square[row][col]='*';
            return;
        }

        int newSize = size/3;
        int cnt = 0;
        for(int i=row; i<row+size; i += newSize){
            for(int j=col; j<col+size; j += newSize){
                cnt++;
                if(cnt == 5){
                    division(i, j, newSize, true);
                }else{
                    division(i, j, newSize, false);
                }
            }
        }
    } // end division
} // end class