package com.ssafy.hw.step4;

import java.util.Scanner;

public class ProductValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] iArr = new int[n];
		int[] result = new int[n];
		
		//상품갯수 입력받기
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = sc.nextInt();
		}
		
		//상품 등수 비교
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr.length; j++) {
				
				if(iArr[i] < iArr[j]) {
					result[i]++;
				}
				
			}
	
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.printf("%d ", result[i] +1);
		}
	}//end main()
}//end class
