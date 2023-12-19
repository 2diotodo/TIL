package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// Boj_1966_프린터큐
public class Boj_1966_프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for(int i=0; i<N; i++){
                q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                for(int i=0; i<q.size(); i++){
                    if(front[1]<q.get(i)[1]){
                        q.offer(front);
                        for(int j=0; j<i; j++){
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                cnt++;
                if (front[0] == M) {
                    break;
                }
            }

            sb.append(cnt).append("\n");

        }
        System.out.print(sb);
    } // end main

} // end class
