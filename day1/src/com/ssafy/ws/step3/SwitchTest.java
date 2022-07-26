package com.ssafy.ws.step3;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//객체 입력받기
		int N = sc.nextInt();
		int M = sc.nextInt();

		//초기 스위치 배열선언
		int[] toggleArr = new int[N];
		//배수 M개 저장할 배열선언
		int[] toggleSwitch = new int[M];

		//배수 M개 입력받기
		for (int i = 0; i < M; i++) {
			toggleSwitch[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(toggleSwitch));
		for (int i = 0; i < M; i++) {						// 배수별로 탐색하는데
			for (int j = 0; j < toggleArr.length; j++) {	// 전체 스위치 배열에서 
				if (((j + 1) % toggleSwitch[i]) == 0) {		// 해당 인덱스 스위치가 배수에 해당하면
					toggleArr[j] = 1 - toggleArr[j];		// 1, 0전환
				}
			}
		}
		
		System.out.println(Arrays.toString(toggleArr));

	}// end main()
}// end class
