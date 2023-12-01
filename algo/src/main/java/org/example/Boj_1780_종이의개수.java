package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj1780_종이의 개수
public class Boj_1780_종이의개수 {
    static int minus = 0;
    static int zero = 0;
    static int plus = 0;
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


        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    } // end main

    public static void division(int row, int col, int size){
        if(check(row, col, size)){
            if(square[row][col]==-1){
                minus++;
            }else if(square[row][col]==0){
                zero++;
            }else{
                plus++;
            }
            return;
        }

        int newSize = size/3;

        // 재귀
        division(row, col, newSize);
        division(row, col+newSize, newSize);
        division(row, col+newSize*2, newSize);
        division(row+newSize, col, newSize);
        division(row+newSize, col+newSize, newSize);
        division(row+newSize, col+newSize*2, newSize);
        division(row+newSize*2, col, newSize);
        division(row+newSize*2, col+newSize, newSize);
        division(row+newSize*2, col+newSize*2, newSize);

    } // end division

    public static boolean check(int row, int col, int size){
        int number = square[row][col];

        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(square[i][j] != number){
                    // 중간에 숫자가 달라지면 false
                    return false;
                }
            }
        }
        // 모두 통과하면
        return true;
    } // end check
} // end class