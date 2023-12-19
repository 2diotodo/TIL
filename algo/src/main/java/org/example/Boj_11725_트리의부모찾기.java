package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Boj_11725_트리의부모찾기
public class Boj_11725_트리의부모찾기 {
    static int N;
    static ArrayList<Integer> list[];
    static int[] parents;
    static boolean[] v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        parents = new int[N+1];
        list = new ArrayList[N+1];
        v = new boolean[N+1];

        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        bfs(1);

        //output
        for(int i=2; i<=N; i++){
            sb.append(parents[i]).append("\n");
        }
        System.out.print(sb);
    } // end main
    public static void bfs(int i){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        v[i] = true;
        q.offer(i);

        while(!q.isEmpty()){
            int num = q.poll();
            for(int d : list[num]){
                if(!v[d]){
                    v[d]=true;
                    parents[d]=num;
                    q.offer(d);
                }
            }
        }
    }// end bfs
} // end class