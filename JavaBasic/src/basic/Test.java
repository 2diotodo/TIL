package basic;

public class Test {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
//		System.out.println(mc.num);
//		System.out.println(mc.str);
		
		System.out.println(mc.getNum());
		System.out.println(mc.getStr());
		
		//Test 클래스가 MyClass의 멤버를 마음대로 바꾼다?? OOP위반
//		mc.num = 30;
//		System.out.println(mc.num);
		
		mc.setNum(30);
		
		MyClass mc2 = new MyClass(10, "World");
		
		MyClass mc3 = new MyClass(30);
		
//		System.out.println(mc3.getYc().getScore()); //yc가 null 생성자 선언만
		System.out.println(mc3);
		System.out.println(mc3.getYc());
	}

}
