package com.ssafy.ws.step1;

import java.util.Scanner;

public class EvenSum {
	public static void main(String[] args) {
		System.out.println("코드를 작성하세요.");
		// 짝수의 합을 위해 반복문과 조건문 이용
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자 입력 >>");
		int n = sc.nextInt();
		int ans = 0;
		for(int i=1; i<=n; i++){
			if(i%2 ==0){
				ans += i;
			}
		}

		System.out.printf("1부터 %d까지 수 중 짝수의 합 %d\n", n, ans);

	}
}
