package com.ssafy.ploymorphism1;

public class TypeCastingTest {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; //문제없음.
		
		Person person = new Person();
		Object obj = person;
		//자손타입 객체를 조상타입으로 형변환할 수 있음 이때 생략 가능
		
		int i2 = 10;
		//명시적으로 작성한다는것은 내가 허락했다. 이후에 나올 에러는 내잘못이야.
		byte b2 = (byte)i2;
		
		
		Person p = new Student();
		//조상타입을 자손으로 참조 : 형변환 생략 불가능
		
		if(p instanceof Student) {
			Student st = (Student)p;
			st.study();
		}
		
		Person p2 = new Person();
		if(p2 instanceof Student) {
			Student st2 = (Student)p2;
			st2.study();
		}
		
		
		
		
		
		
		
	}	
}