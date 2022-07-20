package com.ssafy.ws.step3;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.\n\n1.5판 3승\n2.3판 2승\n3.1판 1승\n");
		System.out.print("번호를 입력하세요.");
		int n = sc.nextInt();
		int ai=0;
		int man=0;
		
		if(n==1) {
			while(Math.max(ai, man)!=3) {
				int comp = (int)(Math.random()*3)+1;
				
				System.out.print("가위바위보 중 하나 입력: ");
				String human = sc.next();
				switch(human) {
				case "가위" : if(comp==1) {
						System.out.println("비겼습니다!!!");
					}else if(comp==2) {
						System.out.println("졌습니다!!!");
						ai++;
					}else {
						System.out.println("이겼습니다!!!");
						man++;
					}
					break;
				case "바위" : if(comp==1) {
						System.out.println("이겼습니다!!!");
						man++;
					}else if(comp==2) {
						System.out.println("비겼습니다!!!");
					}else {
						System.out.println("졌습니다!!!");
						ai++;
					}
					break;
				case "보" : if(comp==1) {
						System.out.println("졌습니다!!!");
						ai++;
					}else if(comp==2) {
						System.out.println("이겼습니다!!!");
						man++;
					}else {
						System.out.println("졌습니다!!!");
					}
					break;
				}
				
				if(ai==3) {
					System.out.println("###컴퓨터 승!!!");
				}else if(man==3) {
					System.out.println("###인간 승!!!");
				}
			}
		}
		
		if(n==2) {
			while(Math.max(ai, man)!=2) {
				int comp = (int)(Math.random()*3)+1;
				
				System.out.print("가위바위보 중 하나 입력: ");
				String human = sc.next();
				switch(human) {
				case "가위" : if(comp==1) {
						System.out.println("비겼습니다!!!");
					}else if(comp==2) {
						System.out.println("졌습니다!!!");
						ai++;
					}else {
						System.out.println("이겼습니다!!!");
						man++;
					}
					break;
				case "바위" : if(comp==1) {
						System.out.println("이겼습니다!!!");
						man++;
					}else if(comp==2) {
						System.out.println("비겼습니다!!!");
					}else {
						System.out.println("졌습니다!!!");
						ai++;
					}
					break;
				case "보" : if(comp==1) {
						System.out.println("졌습니다!!!");
						ai++;
					}else if(comp==2) {
						System.out.println("이겼습니다!!!");
						man++;
					}else {
						System.out.println("졌습니다!!!");
					}
					break;
				}
				
				if(ai==2) {
					System.out.println("###컴퓨터 승!!!");
				}else if(man==2) {
					System.out.println("###인간 승!!!");
				}
			}
		}
		
		if(n==3) {
			while(Math.max(ai, man)!=1) {
				int comp = (int)(Math.random()*3)+1;
				
				System.out.print("가위바위보 중 하나 입력: ");
				String human = sc.next();
				switch(human) {
				case "가위" : if(comp==1) {
						System.out.println("비겼습니다!!!");
					}else if(comp==2) {
						System.out.println("졌습니다!!!");
						ai++;
					}else {
						System.out.println("이겼습니다!!!");
						man++;
					}
					break;
				case "바위" : if(comp==1) {
						System.out.println("이겼습니다!!!");
						man++;
					}else if(comp==2) {
						System.out.println("비겼습니다!!!");
					}else {
						System.out.println("졌습니다!!!");
						ai++;
					}
					break;
				case "보" : if(comp==1) {
						System.out.println("졌습니다!!!");
						ai++;
					}else if(comp==2) {
						System.out.println("이겼습니다!!!");
						man++;
					}else {
						System.out.println("졌습니다!!!");
					}
					break;
				}
				
				if(ai==1) {
					System.out.println("###컴퓨터 승!!!");
				}else if(man==1) {
					System.out.println("###인간 승!!!");
				}
			}
		}
		
	}//end main()
}//end class
