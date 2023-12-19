package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Boj_16236_아기상어
public class Boj_16236_아기상어 {
    static int N;
    static int[][] map;
    static int[] di = {-1,0,1,0}; // 상좌하우
    static int[] dj = {0,-1,0,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        ArrayDeque<Shark> q = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==9){
                    q.offer(new Shark(i,j,0));
                    map[i][j]=0;
                }
            }
        }
        int cnt = 0;
        int time = 0;
        int size = 2;
        while(true){
            ArrayList<Shark> fish = new ArrayList<>();
            int[][] dist = new int[N][N];

            while (!q.isEmpty()) {
                Shark cur = q.poll();

                for(int d=0; d<4; d++){
                    int ni = cur.y + di[d];
                    int nj = cur.x + dj[d];

                    if(ni>=0 && ni<N && nj>=0 && nj<N && dist[ni][nj]==0 && map[ni][nj]<=size){
                        dist[ni][nj] = dist[cur.y][cur.x] + 1;
                        q.offer(new Shark(ni,nj,dist[ni][nj]));
                        if(map[ni][nj]>=1 && map[ni][nj]<=6 && map[ni][nj]<size){
                            fish.add(new Shark(ni,nj,dist[ni][nj]));
                        }
                    }
                }
            }

            if (fish.size() == 0) {
                System.out.print(time);
                return;
            }

            Shark curFish = fish.get(0);
            // 우선순위정렬
            for(int i=1; i<fish.size(); i++){
                if(curFish.dist > fish.get(i).dist){
                    curFish = fish.get(i);
                }else if(curFish.dist == fish.get(i).dist){
                    if(curFish.y > fish.get(i).y) curFish = fish.get(i);
                    else if(curFish.y == fish.get(i).y){
                        if(curFish.x > fish.get(i).x) curFish = fish.get(i);
                    }
                }
            }

            time += curFish.dist;
            cnt++;
            map[curFish.y][curFish.x] = 0;
            if (cnt == size) {
                size++;
                cnt = 0;
            }
            q.offer(new Shark(curFish.y, curFish.x, 0));
        }

    } // end main
    static class Shark{
        // 좌표 및 현재위치에서 물고기까지 거리
        int y,x,dist;
        Shark(int y, int x, int dist){
            this.y = y;
            this.x = x;
            this.dist = dist;
        }
    }
} // end class