package com.ssafy.hw.step4;

import java.util.Scanner;

public class DayCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dayInput = new int[12];
		int sum=0;
		
		for(int i=0; i<dayInput.length; i++) {
			switch(i) {
			case 0 :
			case 2 :
			case 4 :
			case 6 :
			case 7 :
			case 9 :
			case 11 : dayInput[i] = 31; break;
			case 3 :
			case 5 :
			case 8 :
			case 10 : dayInput[i] = 30; break;
			case 1 : dayInput[i] = 28; break;
			}
		}
		
		System.out.print("월일 입력하기:");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		for(int i=0; i<month-1; i++) {
			sum += dayInput[i];
		}
		sum += day;
		
		System.out.printf("%d월 %d일은 %d번째 날입니다.",month, day, sum);
		
	}
}
