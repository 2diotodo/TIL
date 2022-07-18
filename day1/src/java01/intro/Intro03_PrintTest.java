package java01.intro;

public class Intro03_PrintTest {
	public static void main(String[] args) {
		//한 줄 출력을 해보자.
		System.out.print("Hello World\n");
		// \n 이라는 것을 사용하면 줄이 바뀐다.
		//println을 써보자.
		System.out.println("Hello World!!!");
		System.out.println("Hello World!!!");
		
		System.out.println("\"");
		
		System.out.printf("%d \n", 10);
		System.out.printf("%o \n", 10); //정수(8진수)
		System.out.printf("%X \n", 10); //정수(16진수)
		System.out.printf("%x \n", 10); //정수(16진수)
		
		System.out.printf("%4d \n", 10); //4칸을 확보한 뒤 오른쪽부터 차지
		System.out.printf("%-4d\n", 10); //4칸을 확보한 뒤 왼쪽부터 차지
		System.out.printf("%04d\n", 10); //4칸을 확보한 뒤 오른쪽부터 차지(빈칸 0을 채운다.)
		
		System.out.printf("%f\n", 10.1); //실수
		System.out.printf("%.2f\n", 10.1); //실수(소수점 둘째자리까지)
		
		System.out.printf("%s\n", "SSAFY"); //문자열
		System.out.printf("%c\n", 'o'); //문자하나
		
		System.out.printf("안녕하세요. 저는 %s입니다. 제 혈액형은 %c일껄요?\n", "김싸피", 'O'); //실수



	}
}
