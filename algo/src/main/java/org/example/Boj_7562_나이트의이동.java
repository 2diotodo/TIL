package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// Boj_7562_나이트의 이동
public class Boj_7562_나이트의이동 {

    static int I;
    static Node cur, des;
    static int[][] map;
    static boolean[][] v;
    static int[] di={-2,-1,1,2,2,1,-1,-2};
    static int[] dj={1,2,2,1,-1,-2,-2,-1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=0; tc<T; tc++){
            // input
            I = Integer.parseInt(br.readLine());
            map = new int[I][I];
            v = new boolean[I][I];
            cur = new Node(0,0);
            des = new Node(0,0);

            st = new StringTokenizer(br.readLine(), " ");
            cur.i = Integer.parseInt(st.nextToken());
            cur.j = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            des.i = Integer.parseInt(st.nextToken());
            des.j = Integer.parseInt(st.nextToken());

            // output
            bfs();

            sb.append(map[des.i][des.j]).append("\n");
        }//end tc
        System.out.print(sb);
        br.close();

    } // end main

    public static void bfs(){
        ArrayDeque<Node> q = new ArrayDeque<>();
        v[cur.i][cur.j]=true;
        q.offer(new Node(cur.i, cur.j));

        while (!q.isEmpty()){
            Node temp = q.poll();
            int i = temp.i;
            int j = temp.j;
            // break condition
            if(i==des.i && j==des.j){
                break;
            }

            for(int d=0; d<8; d++){
                int ni = i + di[d];
                int nj = j + dj[d];
                if(ni>=0 && ni<I && nj>=0 && nj<I){
                    if(!v[ni][nj]){
                        v[ni][nj]=true;
                        // res 변수로 따로 빼는게 아니라 map에 직접 해당 위치에 몇 번째에 도달했는지 표시하는 방식
                        // res는 움직일 때마다 추가되어 최소거리 측정 불가
                        map[ni][nj] = map[i][j] + 1;
                        q.offer(new Node(ni, nj));
                    }
                }
            }
        } // end while

    } // end bfs
    public static class Node{
        int i;
        int j;
        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    } // end Node
} // end class