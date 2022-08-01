package basic.accessmodifier.sub;

import basic.accessmodifier.A;

public class B extends A{
	private int b;
	
	public void mb() {
		System.out.println(a);
	}
}


//private >> default(keyword가 아니라 생략했을 때 의미) >> protected >> public

//default : 자기 자신 클래스 + 같은 패키지

//protected : default + 상속관계