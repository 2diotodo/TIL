package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// Boj_2644_촌수계산
public class Boj_2644_촌수계산 {
    static List<Integer>[] relation;
    static boolean[] v;
    static int ans = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 전체 사람 수
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());    // 부모자식관계 개수

        relation = new ArrayList[N+1];
        v = new boolean[N+1];
        for(int i=1; i<=N; i++){
            relation[i] = new ArrayList<>();
        }


        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            relation[x].add(y);
            relation[y].add(x);
        }

        dfs(a,b,0);
        System.out.println(ans);

    } // end main
    static void dfs(int start, int end, int cnt){
        if (start == end) {
            ans = cnt;
            return;
        }

        v[start] = true;
        for(int i=0; i<relation[start].size(); i++){
            int next = relation[start].get(i);
            if(!v[next]){
                dfs(next, end, cnt+1);
            }
        }
    } // end dfs
} // end class