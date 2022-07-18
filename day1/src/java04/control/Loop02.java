package java04.control;

public class Loop02 {
	public static void main(String[] args) {
		// while(조건식) {반복내용}

		int n = 0;

		while (n < 5) {
//			System.out.println("이것은 실행이 되나?");
			//조건식을 false로 만드는 노력을 해야함. 안그러면 끝나지 않아용~~
			System.out.println(n);
			n++;
		}
	}
}
