package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_11403_경로찾기
public class Boj_11403_경로찾기 {
    static int N;
    static int[][] adj;
    static boolean[][][] v;
    static int[] di = {0,1,0,-1};
    static int[] dj = {1,0,-1,0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        // input
        N = Integer.parseInt(br.readLine());
        adj = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                adj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(adj[i][k]==1 && adj[k][j]==1){
                        adj[i][j]=1;
                    }
                }
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(adj[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    } // end main
} // end class