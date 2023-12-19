import java.util.Scanner;

/**
 * 가위,바위,보 게임을 하는 클래스
 */
public class Java01_ws_3_3 {

	public static void main(String[] args) {
		//안태윤님 :) 코드
		Scanner sc = new Scanner(System.in);

		System.out.println("가위 바위 보 게임을 시작합니다. 아래 보기중 하나를 고르세요");
		System.out.println("1.5판3승");
		System.out.println("2.3판2승");
		System.out.println("3.1판1승");
		
		int rule = 0; 
		
		while(rule!=1&&rule!=2&&rule!=3) {
			System.out.printf("1,2,3 중 숫자 하나 입력 >>");
			rule = sc.nextInt();
		}
		rule = 4-rule; //승리수를 이렇게 한듯? 아마도? ㅋ
		
		int comWin = 0;
		int userWin = 0;
		
		
		//비기는 경우도 한판으로 인정한다 (라는 부분을 추가 작성해볼것)
		while(comWin!=rule && userWin!=rule) {
			int com = (int)(Math.random()*3)+1;
			System.out.print("가위 바위 보 중 하나 입력 >>");
			String userInput = sc.next();
			int user =3;
			switch(userInput){
				case "가위":
					user =1;
					break;
				case "주먹":
					user =2;
					break;
			}
			
			
			
			if(user == com) {				
				System.out.println("비겼다!");
			}else if((user==3&&com==2)||(user==2&&com==1) ||(user==1&&com==3)) {
				System.out.println("이겼다!");
				userWin++;
			}else {				
				System.out.println("졌다!");
				comWin++;
			}
		}
		String winner = comWin > userWin ? "컴퓨터" : "유저";
		
		System.out.printf("###%s가 이겼다!",winner);
	}
}
