package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 인접리스트 최대거리의 최소값
public class Main {

    public static class Node{
        int vertex;

        public Node(int vertex){
            this.vertex = vertex;
        }
    }
        static final int INF = Integer.MAX_VALUE;

        public static int findMinMaxDistance(int n, int m, int k, List<List<Node>> graph) {
            int[] distances = new int[n + 1];
            Arrays.fill(distances, INF);

            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> distances[node.vertex]));
            for (int i = 0; i < k; i++) {
                int startNode = i + 1;
                distances[startNode] = 0;
                pq.offer(new Node(startNode));
            }

            while (!pq.isEmpty()) {
                Node current = pq.poll();

                for (Node neighbor : graph.get(current.vertex)) {
                    int newDistance = distances[current.vertex] + 1;

                    if (newDistance < distances[neighbor.vertex]) {
                        distances[neighbor.vertex] = newDistance;
                        pq.offer(new Node(neighbor.vertex));
                    }
                }
            }

            int maxDistance = Arrays.stream(distances).max().orElse(-1);

            return maxDistance == INF ? -1 : maxDistance;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<List<Node>> graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(new Node(v));
            graph.get(v).add(new Node(u));
        }

        int res = findMinMaxDistance(N,M,K,graph);
        System.out.println(res);


    } // end main


} // end class
