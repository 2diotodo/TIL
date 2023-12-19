package boj;

import java.util.Scanner;

public class Confetti10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 색종이 개수
		int N = sc.nextInt();
		// 전체 평면
		int[][] axis = new int[1001][1001];
		// 입력받을 색종이 좌표및 크기 저장할 배열
		int[][] square = new int[N][4];
		// 카운트용
		int[] flagArr = new int[N];

		// 입력받기
		for (int i = 0; i < N; i++) {
			square[i][0] = sc.nextInt();
			square[i][1] = sc.nextInt();
			square[i][2] = sc.nextInt();
			square[i][3] = sc.nextInt();
		}

		// N개 사각형에 대해 i+1번째 사각형 면적에 해당하는 좌표에 i+1저장
		for (int i = 0; i < N; i++) {
			for (int n = square[i][0]; n < square[i][0] + square[i][2]; n++) {
				for (int m = square[i][1]; m < square[i][1] + square[i][3]; m++) {
					axis[n][m] = i + 1;

				}
			}
		} // end for(i)

		// 전체 범위 탐색하면서 k번째 색종이 보이는 영역을 출력하기
		for (int k = 1; k <= N; k++) {
			int flag = 0;							//카운트 초기화
			for (int i = 0; i < 1001; i++) {		//전체범위 탐색
				for (int j = 0; j < 1001; j++) {
					if (axis[i][j] == k) {			//k번째 색종이가 보이는 영역탐색
						flag++;
					}
				}
			}
			System.out.println(flag);				//출력
		}
	}// end main()
}// end class
