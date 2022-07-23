import java.util.Scanner;

public class Java01_ws_3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N * N 크기를 위해서...

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(j < i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int cnt = 0; //출력할 숫자.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(j < i) {
					System.out.printf("%3s", " ");
				}else {
					System.out.printf("%3d", ++cnt);
				}
			}
			System.out.println();
		}
	}
}
