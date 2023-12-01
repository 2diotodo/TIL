package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// Boj_1916_최소비용구하기
public class Boj_1916_최소비용구하기 {
    static int N,M;
    static int[] dist;
    static ArrayList<ArrayList<Node>> list;
    static boolean[] v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        dist = new int[N+1];
        v = new boolean[N+1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.get(u).add(new Node(v,w));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        System.out.print(dijkstra(start, end));

        br.close();
    } // end main
    static class Node implements Comparable<Node>{
        int v,w;
        Node(int v, int w){
            this.v = v;
            this.w = w;
        }
        @Override
        public int compareTo(Node o){
            return this.w - o.w;
        }
    }

    public static int dijkstra(int start, int end){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        dist[start] = 0;

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int curV = node.v;
            int curW = node.w;

            if(!v[curV]){
                v[curV] = true;

                for(Node next : list.get(curV)){
                    if(!v[next.v] && dist[next.v] > dist[curV] + next.w){
                        dist[next.v] = dist[curV] + next.w;
                        pq.add(new Node(next.v,dist[next.v]));
                    }
                }
            }
        }
        return dist[end];
    }
} // end class