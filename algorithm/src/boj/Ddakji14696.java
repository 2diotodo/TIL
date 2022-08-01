package boj;

import java.util.Scanner;

public class Ddakji14696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int round = sc.nextInt();

		for (int t = 1; t <= round; t++) {
			int[] pointA = new int[4];
			int[] pointB = new int[4];

			// A가 낼 딱지 개수종류 입력받기
			int a = sc.nextInt();
			int[] cardsA = new int[a];
			for (int i = 0; i < a; i++) {
				cardsA[i] = sc.nextInt();
			}
			// B가 낼 딱지 개수종류 입력받기
			int b = sc.nextInt();
			int[] cardsB = new int[b];
			for (int i = 0; i < b; i++) {
				cardsB[i] = sc.nextInt();
			}

			for (int i = 0; i < a; i++) {
				switch (cardsA[i]) {
				case 1:
					pointA[0]++;
					break;
				case 2:
					pointA[1]++;
					break;
				case 3:
					pointA[2]++;
					break;
				case 4:
					pointA[3]++;
					break;
				}
			}
			for (int i = 0; i < b; i++) {
				switch (cardsB[i]) {
				case 1:
					pointB[0]++;
					break;
				case 2:
					pointB[1]++;
					break;
				case 3:
					pointB[2]++;
					break;
				case 4:
					pointB[3]++;
					break;
				}
			}

			// 비교
			for (int i = 3; i >= 0; i--) {
				if (pointA[i] > pointB[i]) {
					System.out.println("A");
					break;
				} else if (pointA[i] < pointB[i]) {
					System.out.println("B");
					break;
				}else {
					continue;
				}

			}
			if (pointA[3] == pointB[3] && pointA[2] == pointB[2] && pointA[1] == pointB[1] && pointA[0] == pointB[0]) {
				System.out.println("D");
			}

		} // end for(t)
	}// end main()
}// end class
