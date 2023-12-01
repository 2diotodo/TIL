package org.example;

import java.io.IOException;
import java.util.ArrayDeque;

// Pro_kit_아이템줍기
public class Programmers_아이템줍기 {

    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY){
        int answer = 0;
        int[][] map = new int[102][102];
        boolean[][] v = new boolean[102][102];
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};

        characterX *=2;
        characterY *=2;
        itemX *=2;
        itemY *=2;

        for(int i=0; i< rectangle.length; i++){
            int[] square = rectangle[i];

//            for(int j=0; j<4; j++){
//                square[j] *=2;
//            }

            for(int r=square[0]*2; r<=square[2]*2; r++){
                for(int c=square[1]*2; c<=square[3]*2; c++){
//                    if(r==square[0] || r==square[2] || c==square[1] || c==square[3]){
                        map[r][c] = 1;
//                    }
                }
            }
        }

        for(int i=0; i< rectangle.length; i++){
            int[] square = rectangle[i];

//            for(int j=0; j<4; j++){
//                square[j] *=2;
//            }

            for(int r=square[0]*2+1; r<square[2]*2; r++){
                for(int c=square[1]*2+1; c<square[3]*2; c++){
                    map[r][c] = 2;
                }
            }
        }

//        for(int i=0; i<102; i++){
//            for(int j=0; j<102; j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println("\n");
//        }

        ArrayDeque<Node> q = new ArrayDeque<>();
        v[characterX][characterY]=true;
        q.offer(new Node(characterX, characterY,0));

        while(!q.isEmpty()){
            Node node = q.poll();

            if(node.r==itemX && node.c==itemY){
                answer = Math.min(answer, node.cnt/2);
                break;
            }

            for(int d=0; d<4; d++){
                int nx = node.r + dr[d];
                int ny = node.c + dc[d];
                if(nx>=2 && nx<=100 && ny>=2 && ny<=100){
                    if(map[nx][ny]==1 && !v[nx][ny]){
                        v[nx][ny]=true;
                        q.offer(new Node(nx, ny, node.cnt+1));
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[][] rectangle = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
        int characterX = 1;
        int characterY = 3;
        int itemX = 7;
        int itemY = 8;

        System.out.println(solution(rectangle, characterX, characterY, itemX, itemY));

    } // end main

    static class Node{
        int r,c,cnt;

        public Node(int r, int c, int cnt){
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }
} // end class
