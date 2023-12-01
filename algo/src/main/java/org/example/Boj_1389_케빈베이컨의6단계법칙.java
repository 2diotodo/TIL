package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_1389_케빈베이컨의6단계법칙
public class Boj_1389_케빈베이컨의6단계법칙 {
    static int N,M,ans;
    static int INF = 987654321;
    static int[][] map;
    static int[] res;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        res = new int[N+1];
        map = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                map[i][j]=INF;
                if(i==j){
                    map[i][j]=0;
                }
            }
        }

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                map[a][b] = 1;
                map[b][a] = 1;
        }

        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    if(map[i][j] > map[i][k] + map[k][j]){
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        int temp = INF;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                res[i] += map[i][j];
            }
            if(temp > res[i]){
                temp = res[i];
                ans = i;
            }
        }
        System.out.print(ans);

        br.close();
    } // end main
} // end class