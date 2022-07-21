package com.ssafy.class02;

import java.util.Random;

public class FuntionTest4 {
	public static void main(String[] args) {
		boolean homework; 
		
		System.out.println("아침에 일어난다.");
		이동("교육장", "대중교통");
		homework = 교육();
		이동("집", "대중교통");
		
		if(homework)
			System.out.println("과제를 해결한다.");
		
		System.out.println("잔다.");
		
		System.out.println("==========================");
		
		System.out.println("아침에 일어난다.");
		System.out.println("아침밥을 먹는다.");
		이동("제주도", "비행기");
		homework = 교육();
		이동("집", "배");
		
		if(homework)
			System.out.println("과제를 해결한다.");
		
		System.out.println("잔다.");
	}
	
	public static boolean 교육() {
		System.out.println("오전 수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업을 듣는다.");
		//과제 랜덤 발생기.
		Random random = new Random();
		return random.nextBoolean();
	}
	
	public static void 이동(String 장소, String 탈것) {
		System.out.println(장소+"(으)로" +탈것 +"(을)를 이용하여 이동한다.");
	}
	
}
