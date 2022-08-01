package basic;
// Encapsulation 은 구조를 의미

// 대상이 되는 Object 중 관리하고 싶은 특성, 기능

public class MyClass {

	public MyClass() {
	}

	// 생성자
	public MyClass(int num) {
		this.num = num;
	}

	// 생성자
	public MyClass(int num, String str) {
		this(num);
		this.str = str;
	}

	// 특성, 상태
	// 값을 주지 않으면 default value 를 가진다.
//	int num;	//primitive type : 0 또는 false에 준하는 값
//	String str;	//reference type : null

	// private : 오직 동일 클래스 내에서만 접근 가능
	private int num = 20;
	private String str = "Hello";
	
	private YourClass yc;
	

	public YourClass getYc() {
		return yc;
	}

	public void setYc(YourClass yc) {
		this.yc = yc;
	}

	// public : 아무런 제약조건없이 외부에서 접근 가능
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num /* * 20 */;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	// 가능
	void m1() {
		System.out.println(num);
	}

	int m2() {
		return 1;
	}

	String m3() {
		return "";
	}

}
