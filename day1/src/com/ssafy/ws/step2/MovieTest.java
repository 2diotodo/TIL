package com.ssafy.ws.step2;

public class MovieTest {
	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		//하나씩 넣기
		movie1.id = 001;
		movie1.title = "다크나이트";
		movie1.director = "크리스토퍼 놀란";
		movie1.genre = "액션";
		movie1.runningTime = 152;
		
		//생성자 이용해서 넣기
		Movie movie2 = new Movie(002, "광해", "추창민", "역사", 131);
		
		
		System.out.println("관리번호 : " + movie1.id);
		System.out.println("영화제목 : " + movie1.title);
		System.out.println("감독 : " + movie1.director);
		System.out.println("상영시간 : " + movie1.runningTime + "분");
		System.out.println("-------------------------------");
		System.out.println("관리번호 : " + movie2.id);
		System.out.println("영화제목 : " + movie2.title);
		System.out.println("감독 : " + movie2.director);
		System.out.println("상영시간 : " + movie2.runningTime + "분");
	}//end main()
}//end class
