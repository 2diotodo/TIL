package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_11404_플로이드
public class Boj_11404_플로이드 {
    static int N,M;
    static int INF = 987654321;
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

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
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());
                map[from][to] = Math.min(map[from][to], cost);
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

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(map[i][j]==INF){
                    map[i][j]=0;
                }
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    } // end main
} // end class