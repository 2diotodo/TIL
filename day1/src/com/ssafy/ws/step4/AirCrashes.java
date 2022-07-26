package com.ssafy.ws.step4;

import java.util.Scanner;

public class AirCrashes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] crashes = new int[N];
		int max = 0;
		int less = 0;
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			crashes[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (crashes[i] > max) {				//최대 사상자수 구하기
				max = crashes[i];
			}

			if (crashes[i] < crashes[N - 1]) {	//마지막 사고보다 작은 사상자수 구하기
				less = crashes[i];
			}
			if (crashes[i] > crashes[N - 1]) {	//최근사고가 가장 작은 사상자인지 판별하기위한 카운트
				cnt++;
			}
		}

		if (cnt == (N - 1)) {				//최근사고가 가장 적은 사상자라면
			System.out.println(-1);
		} else {
			System.out.println(max - less);
		}
	}// end main()
}// end class
