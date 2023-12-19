package com.ssafy.modifier01;

public class CarTest {
	public static void main(String[] args) {
		//자동차 하나 생성.
		Car c = new Car(); //서울 7반 임혜진(가장빠름)
		//이런식으로 작성이 가능하다.
		c.color = "Red";
//		c.speed = 100; 
		
//		c.speed = 300; //이렇게 작성한 것을 막을 수 있나?
//		//읽을 수도 없엉 ㅠ^ㅠ
//		System.out.println(c.speed);
		
		c.setSpeed(300);
		System.out.println(c.getSpeed());
	}
}