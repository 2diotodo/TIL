package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Boj_11724_연결요소의개수
public class Boj_11724_연결요소의개수 {
    static int N,M,ans;
    static int[][] graph;
    static boolean[] v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        v = new boolean[N+1];

        // graph input
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            graph[from][to] = graph[to][from] = 1;
        }

        for(int i=1; i<=N; i++){
            if(!v[i]){
                dfs(i);
                ans++;
            }
        }
        System.out.print(ans);
        br.close();
    } // end main
    static void dfs(int n){
        v[n]=true;
        for(int i=1; i<=N; i++){
            // 미방문 && 연결점 조건충족시 dfs 지속
            if(!v[i] && graph[n][i]==1){
                dfs(i);
            }
        }
    } // end dfs
} // end class