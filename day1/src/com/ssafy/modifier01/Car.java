package com.ssafy.modifier01;

public class Car {
	String color;
	//아래의 스피드를 외부에서 접근할 수 없게 만들고 싶어요..
	private int speed; //속도는 최소 0, 최대 250 까지를 가질수있다.
	
	public void setSpeed(int speed) {
		//int speed = ?
		if(speed <= 250 && speed >=0)
			this.speed = speed;
		else
			System.out.println("이상한 속도는 넣지 마세요~~~");
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
}