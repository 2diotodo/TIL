package basic;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Hello";	//리터럴	//1000 Hello
		String s2 = "Hello";	//1000재사용
		
		String s3 = new String("Hello");	//항상 새로운 객체 2000
		String s4 = new String("Hello");	//3000
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//== 연산자 ; 참조되는 주소값을 비교
		//equals() : 두 객체의 내용을 비교하기 위해 사용
		if(s1==s2) System.out.println("1");
		if(s3==s4) System.out.println("2");
		if(s1.equals(s2)) System.out.println("3");
		if(s3.equals(s4)) System.out.println("4");
		
		MyClass2 mc1 = new MyClass2();
		MyClass2 mc2 = new MyClass2();
		
		if(mc1 == mc2) System.out.println("5");
		if(mc1.equals(mc2)) System.out.println("6");
	}
}

class MyClass2{
	int n = 10;
	
}