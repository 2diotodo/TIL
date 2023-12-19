import java.util.Scanner;

public class Java01_ws_3_2 {
	public static void main(String[] args) {
		int target = 5 / 2; //2일때 모양의 반전이 발생한다.ㄴ
		int blank = 0 ; // 공백은 0개부터시작해서 쭉 증가해 가다가 중앙을 넘어가는 순간 다시 감소하기 시작한다.
		boolean flag = true; //공백이 증가하고 있으면 true / 감소하기 시작하면 false;
		int no = 1; //1번 부터 찍을 꺼야 
		
		while(no <= 17)	{
			//공백을 출력을 하겠다.
			for(int i = 0 ; i < blank; i++) {
				System.out.printf("%3s", " ");
			}
			//숫자를 출력을 하겠따.
			for(int i = 0; i< 5 - 2*blank ; i++) {
				System.out.printf("%3d", no++);
			}
			System.out.println();
			
			//공백이 증가모드라면
			if(flag) blank++;
			else blank--;
			
			//중앙지점에 도착했다면 flag를 반전 시키겠다.
			if(blank == target) flag = false;
		}
		
		
	}
}
