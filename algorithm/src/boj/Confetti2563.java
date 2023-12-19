package boj;

import java.util.Scanner;

public class Confetti2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 색종이 개수
		int N = sc.nextInt();
		// 전체 평면
		int[][] axis = new int[100][100];
		// 입력받을 사각형 좌표저장
		int[][] square = new int[N][4];
		// 카운트용
		int flag = 0;

		// 입력받기
		for (int i = 0; i < N; i++) {
			square[i][0] = sc.nextInt();
			square[i][1] = sc.nextInt();
			square[i][2] = 10;
			square[i][3] = 10;
		}

		// N개 색종이에 대해 각 색종이의 넓이만큼 좌표를 지정하여 1값을 부여
		for (int i = 0; i < N; i++) {
			for (int n = square[i][0]; n < square[i][0] + 10; n++) {
				for (int m = square[i][1]; m < square[i][1] + 10; m++) {
					if (square[i][0] <= 90 && square[i][1] <= 90) {
						if (axis[n][m] == 0) {
							axis[n][m] = 1;
						} // end if
					}
				}
			}
		} // end for(i)

		// 전체 범위 탐색, 0이 아닌 영역이면 카운트
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (axis[i][j] != 0) {
					flag++;
				}
			}
		}
		// 카운트 출력
		System.out.println(flag);
	}// end main()
}// end class
