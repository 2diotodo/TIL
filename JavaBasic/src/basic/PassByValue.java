package basic;

//다형성
// 타입 다형성 - 상속과 함께
//메소드 다형성 - overloading(이름같은데 파라미터 다른거), overriding(상속)
public class PassByValue {
	// static : 객체 생성 없이 바로 호출, 접근가능한 modifier
	public static void main(String[] args) {
		int i=10;
		setVal(i);
		System.out.println(i);
		
		Pass p = new Pass();		//p -->heap 에 만들어진 Pass() 객체를 reference 한다. 만약 Pass() 의 heap주소가 1000이면 p=1000
		setVal(p);		//1000이 전달 p.val이면 뭐가 나올까? -->
		System.out.println(p.val);
	}

	public static void setVal(int x) {	//primitive
		x = 5;
	}
	
	public static void setVal(Pass p) {	//reference // p에 1000이 복사
		p.val = 5;
	}
}
//String 이라면?
class Pass{
	public int val = 10;
}
