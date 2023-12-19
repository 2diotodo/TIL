package com.ssafy.ws.step3;

import java.util.Scanner;

public class DigitTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 1;
		
		for(int i=0; i<n ;i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("%3s", " ");
			}
			
			for(int j=0; j<n-i; j++) {
				System.out.printf("%3d",cnt++);
			}
			System.out.println();
		}
		

		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("    ");
			}

			
			for(int j=1; j<=5-i; j++) {
				System.out.printf("%3d ",n);
				n++;
			}
			System.out.println();
		}
		System.out.println(Math.round((double)5/2));
	}//end main()
}//end class
