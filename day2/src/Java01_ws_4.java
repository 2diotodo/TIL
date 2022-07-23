import java.util.Scanner;

public class Java01_ws_4 {
	public static void main(String[] args) {
		char[] 간 = { '갑', '을', '병', '정', '무', '기', '경', '신', '임', '계' };
		char[] 지 = { '자', '축', '인', '묘', '진', '사', '오', '미', '신', '유', '술', '해' };

		Scanner sc = new Scanner(System.in);

		String input;
		do {
			System.out.println("60갑자를 입력하세요.");
			input = sc.next();
			if (input.equals("종료"))
				break;

			char gan = input.charAt(0); // 간
			char ji = input.charAt(1); // 지

			// gan, ji 유효 할떄만 검사.
			boolean flag1 = false;
			for (int i = 0; i < 간.length; i++) {
				if (gan == 간[i]) {
					flag1 = true;
					break;
				}
			}
			boolean flag2 = false;
			for (int i = 0; i < 지.length; i++) {
				if (ji == 지[i]) {
					flag2 = true;
					break;
				}
			}

			if (flag1 && flag2) {
				for (int year = 1800; year <= 2100; year++) {
					int y = year - 1444;
					int g = y % 10;
					int j = y % 12;
					if(간[g] == gan && 지[j] == ji)
						System.out.println(year);
				}
			} else {
				System.out.println("잘못된 입력");
			}

		} while (!input.equals("종료"));
	}
}
