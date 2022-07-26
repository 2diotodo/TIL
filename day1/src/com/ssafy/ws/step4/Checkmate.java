package com.ssafy.ws.step4;

import java.util.Scanner;

public class Checkmate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[][] chess;
		for (int test = 1; test <= T; test++) {
			int N = sc.nextInt();
			chess = new int[N][N];

			int kingi = sc.nextInt();
			int kingj = sc.nextInt();
			int queeni = sc.nextInt();
			int queenj = sc.nextInt();

			int[] ds = { -1, -1, 1, 1 };
			int[] dt = { -1, 1, -1, 1 };

			if (kingi == queeni || kingj == queenj) { // 1.같은 행 또는 같은 열이라서 잡는 경우
				System.out.println("#" + T + " " + 1);
			} else {
			jLoop :	for (int j = 1; j <= N; j++) {	//2. 대각선에서 잡는 경우
					for (int i = 0; i < 4; i++) { // 대각선탐색
						int catchi = queeni + j * ds[i];
						int catchj = queenj + j * dt[i];
						
						if (catchi >= 0 && catchi < N && catchj >= 0 && catchj < N) { 	// 탐색결과가 체스판 내부인지 검증
							if(catchi==kingi && catchj==kingj) {						// 내부라면 킹잡는 위치인지 검증
								System.out.println("#" + test + " " + 1);
								break jLoop;	
							}
							
						} else {
							System.out.println("#" + test + " " + 0);			//1,2 어느경우도 아니라면 못잡는 경우임.
							break jLoop;
						}

					} // end for(i)
				} // end for(j)
			}
		} // end for(test)
	}// end main()
}// end class
