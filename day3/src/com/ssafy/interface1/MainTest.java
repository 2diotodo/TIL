package com.ssafy.interface1;

interface MyInterface3 {
	
}

//인터페이스는 메소드들이 구현부가 없어서 헷갈릴 메소드가 없다. 
//다중 상속이 가능한다. 
interface MyInterface4 extends MyInterface2, MyInterface3 {
	
}


public class MainTest {
	public static void main(String[] args) {
//		MyInterface3 m = new MyInterface3(); //인터페이스는 인스턴스를 생성할수 없다.
	}
}
