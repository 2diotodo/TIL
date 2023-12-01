package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Boj_13023_ABCDE
public class Boj_13023_ABCDE {
    static int N,M;
    static ArrayList<Integer>[] rel;
    static boolean[] v;
    static boolean arrive;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        rel = new ArrayList[N];
        v = new boolean[N];
        for(int i=0; i<N; i++){
            rel[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int str = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            rel[str].add(end);
            rel[end].add(str);
        }
        for(int i=0; i<N; i++){
            dfs(i,1);
            if (arrive) {
                break;
            }
        }
        if (arrive) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    } // end main
    static void dfs(int now, int depth){
        if (depth == 5 || arrive) {
            arrive=true;
            return;
        }
        v[now] = true;
        for (int i : rel[now]) {
            if (!v[i]) {
                dfs(i, depth+1);
            }
        }
        v[now] = false;
    } // end dfs
} // end class
