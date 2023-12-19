package com.ssafy.ploymorphism2;

class SuperClass {
	String x = "super";

	public void method() {
		System.out.println("super class method");
	}
}

class SubClass extends SuperClass {
	String x = "sub";

	@Override
	public void method() {
		System.out.println("sub class method");
	}
}

public class MemberBindingTest {
	public static void main(String[] args) {
		//서울 7반 안태윤님 가장 답이 빨랐음.
		SubClass subClass = new SubClass();
//		System.out.println(subClass.x);
//		subClass.method();
		
		//대전 4반 임영묵 가장 답이 빨랐음.
		SuperClass superClass = subClass;
		System.out.println(superClass.x);
		superClass.method();
	}
}















