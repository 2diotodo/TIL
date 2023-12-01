package org.example;

import java.io.*;
import java.util.*;
public class Boj_2630_색종이만들기 {
    static int white = 0;
    static int blue = 0;
    static int[][] square;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        square = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        } // end for

        division(0, 0, N);


        System.out.println(white);
        System.out.println(blue);
    } // end main

    public static void division(int row, int col, int size){
        if(check(row, col, size)){
            if(square[row][col]==0){
                white++;
            }else{
                blue++;
            }
            return;
        }

        int half = size/2;
        // 재귀
        division(row, col, half);
        division(row, col+half, half);
        division(row+half, col, half);
        division(row+half, col+half, half);

    } // end division

    public static boolean check(int row, int col, int size){
        int color = square[row][col];

        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(square[i][j] != color){
                    // 중간에 숫자가 달라지면 false
                    return false;
                }
            }
        }
        // 모두 통과하면
        return true;
    } // end check
} // end class