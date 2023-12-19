package com.ssafy.ws.step2;

import java.util.Scanner;

public class AppleTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int max=0;
		int n = sc.nextInt();
		//크기가 n*n인 2차원 배열 생성
		int[][] iArr = new int[n][n];
		
		//2차원 배열 입력
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				iArr[i][j] = sc.nextInt();
				
			}//end for(j)
			System.out.println();
		}//end for(i)
		
		//delta row
		int[] dr = new int[] {-1,1,0,0}; //dr 먼저 선언 후에도 쓸 수있는 초기화형식
		int[] dc = {0,0,-1,1}; //처음선언할때만 가능한 초기화형식
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//현재자리도 영양분 포함
				int nutrition = iArr[i][j];
				
				//4방향을 파악하는 것
				for(int d=0;d<4; i++) {
					int nr = i+dr[d];
					int nc = j+dc[d];
					
					if(nr >= 0 && nr<n && nc>=0 && nc<n) {
						nutrition += iArr[nr][nc];
					}
				}
				if(max>=nutrition) {
					System.out.println(max);
				}
				
			}
		}
		
		//배열 탐색
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//꼭지점 케이스 탐색
				if(i==0 && j==0) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j+1] + iArr[i+1][j];
					if(max < sum) {
						max = sum;
					}
				}else if(i==0 && j==n-1) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j-1] + iArr[i+1][j];
					if(max < sum) {
						max = sum;
					}
				}else if(i==n-1 && j==0) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j+1] + iArr[i-1][j];
					if(max < sum) {
						max = sum;
					}
				}else if(i==n-1 && j==n-1) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j-1] + iArr[i-1][j];
					if(max < sum) {
						max = sum;
					}
				}
				//사이드 케이스 탐색
				else if(i==0 && (j>0 || j<n)) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j+1] + iArr[i][j-1] + iArr[i+1][j];
					if(max < sum) {
						max = sum;
					}
				}else if(i==n-1 &&(j>0 || j<n)) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j+1] + iArr[i][j-1] + iArr[i-1][j];
					if(max < sum) {
						max = sum;
					}
				}else if((i>0 || i<n) && j==0) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j+1] + iArr[i+1][j] + iArr[i-1][j];
					if(max < sum) {
						max = sum;
					}
				}else if((i>0 || i<n) && j==n-1) {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i][j-1] + iArr[i+1][j] + iArr[i-1][j];	
					if(max < sum) {
						max = sum;
					}
				}

				//내부 케이스 탐색
				else {
					sum = 0;
					sum = sum + iArr[i][j] + iArr[i-1][j] + iArr[i+1][j] + iArr[i][j-1] + iArr[i][j+1];
					if(max < sum) {
						max = sum;
					}
				}//end if

			}//end for(j)
		}//end for(i)
		System.out.println(max);
		
	}// end main()
}// end class
