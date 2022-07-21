package com.ssafy.ws.step3;

public class DigitTest2 {
	public static void main(String[] args) {
		int n=1;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<i;j++) {
				System.out.print("   ");
			}
			
			for(int j=0; j<5-2*i; j++) {
				System.out.printf("%3d",n);
				n++;
			}
			
			for(int j=0; j<i; j++) {
				System.out.print("   ");
			}
			System.out.println();
		}
		
		for(int i=3; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print("   ");
			}
			
			for(int j=0; j<2*i-3; j++) {
				System.out.printf("%3d", n);
				n++;
			}
			
			for(int j=0; j<4-i; j++) {
				System.out.print("   ");
			}
			System.out.println();
		}
	}//end main()
}//end class
