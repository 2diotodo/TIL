package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// Boj_1753_최단경로
public class Boj_1753_최단경로 {
    static int V,E,K;
    static int[] dist;
    static ArrayList<Node>[] list;
    static boolean[] v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        dist = new int[V+1];
        list = new ArrayList[V+1];
        v = new boolean[V+1];

        for(int i=1; i<=V; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<=V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Node(v,w));
        }

        dijkstra(K);

        for(int i=1; i<=V; i++){
            if(v[i]) System.out.println(dist[i]);
            else System.out.println("INF");
        }

        br.close();
    } // end main
    public static class Node implements Comparable<Node>{
        int v,w;
        Node(int v, int w){
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    } // class Node

    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        dist[start] = 0;

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int curV = node.v;
            if(v[curV]) continue;
            v[curV] = true;

            for(int i=0; i<list[curV].size(); i++){
                Node tmp = list[curV].get(i);
                int next = tmp.v;
                int value = tmp.w;
                if(dist[next] > dist[curV] + value){
                    dist[next]= dist[curV] + value;
                    pq.offer(new Node(next, dist[next]));
                }
            }
        }
    } // end dijkstra
} // end class