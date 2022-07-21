package com.ssafy.ws.step3;

public class DigitTest1 {
	public static void main(String[] args) {
		int n = 1;
		
		int line = 1;
		
		for(int i=1; line>=n ;i++) {
			line += i;
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
		
	}//end main()
}//end class
