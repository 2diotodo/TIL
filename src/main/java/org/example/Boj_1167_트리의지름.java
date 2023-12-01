package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// Boj_1167_트리의지름
public class Boj_1167_트리의지름 {
    static int V;
    static boolean[] visited;
    static int[] dist;
    static ArrayList<Node>[] rel;
    static boolean arrive;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        V = Integer.parseInt(br.readLine());
        visited = new boolean[V+1];
        dist = new int[V+1];
        rel = new ArrayList[V+1];
        for(int i=1; i<=V; i++){
            rel[i] = new ArrayList<Node>();
        }

        for(int i=0; i<V; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1) {
                    break;
                }
                int v = Integer.parseInt(st.nextToken());
                rel[n].add(new Node(e,v));
            }
        }
        bfs(1);
        int max = 1;
        for(int i=2; i<=V; i++){
            if (dist[max] < dist[i]) {
                max = i;
            }
        }
        dist = new int[V+1];
        visited = new boolean[V+1];
        bfs(max);
        Arrays.sort(dist);
        System.out.println(dist[V]);
    } // end main
    static void bfs(int index){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(index);
        visited[index] = true;
        while (!q.isEmpty()) {
            int now = q.poll();
            for (Node i : rel[now]) {
                int e = i.edge;
                int v = i.value;
                if (!visited[e]) {
                    visited[e] = true;
                    q.offer(e);
                    dist[e] = dist[now] + v;
                }
            }
        }
    }
    static class Node{
        int edge, value;
        Node(int edge, int value){
            this.edge = edge;
            this.value = value;
        }
    }
} // end class
