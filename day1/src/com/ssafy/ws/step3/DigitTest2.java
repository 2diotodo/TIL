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
		
		//한방에 해결하기
		int target = 5/2; //반전이 발생하는 지점
		int blank = 0; // 공백은 0개부터 시작해서 증가해가다 반전지점 넘어가는 순간 다시 감소
		boolean flag = true; //공백이 증가하고 있으면  true, 감소하기 시작하면 false
		int no = 1; //1번부터 찍는다.
		
		while(no <=17) {
			//공백을 출력
			for(int i=0; i<blank; i++) {
				System.out.printf("%3s", " ");
			}
			//숫자를 출력
			for(int i=0; i<5-2*blank;i++) {
				System.out.printf("%3d", no++);
			}
			System.out.println();
			
			//공백이 증가모드라면
			if(flag) blank++;
			else blank--;
			
			//중앙지점에 도착했다면  flag를 반전시킴
			if(blank == target) flag = false;
		}
	}//end main()
}//end class
