package com.ssafy.ws.step2;

import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		MovieManager mv = new MovieManager();
		/*
		int sel;
		do {
			System.out.println("원하는 번호 입력");
			System.out.println("1. 영화등록");
			System.out.println("2. 영화 리스트");
			System.out.println("3. 영화 검색");
			System.out.println("0. 종료");
			sel = sc.nextInt();
			if(sel == 1) {
				//영화등록
				System.out.println("영화를 새로 등록합니다.");
				System.out.print("관리번호: ");
				int id = sc.nextInt();
				System.out.print("영화제목: ");
				String title = sc.next();
				System.out.print("감독: ");
				String director = sc.next();
				System.out.print("장르: ");
				String genre = sc.next();
				System.out.print("상영시간: ");
				int runningTime = sc.nextInt();
				Movie mov = new Movie(id, title, director, genre, runningTime);
				mv.add(mov);
			}else if(sel == 2) {
				//영화리스트 출력
				System.out.println("영화 리스트를 출력합니다.");
				mv.getList();
				for(int i=0; i<mv.size; i++) {
					System.out.println(mv.getList());
				}
			}else if(sel == 3) {
				System.out.println("영화를 검색합니다.");
				System.out.print("영화제목 입력: ");
				String title = sc.next();
				Movie mov = mv.searchByTitle(title);
				if(mov == null) {
					System.out.println("목록에 없는 영화입니다.");
				}else {
					System.out.printf("영화제목: %s\n감독: %s\n장르: %s\n상영시간: %d\n", mov.getTitle(), mov.getDirector(), mov.getGenre(), mov.getRunningTime());
				}
			}
		}while(sel!=0);
		*/

		Movie movie1 = new Movie();
		// 하나씩 넣기
		movie1.setId(001);
		movie1.setTitle("다크나이트");
		movie1.setDirector("크리스토퍼 놀란");
		movie1.setGenre("액션");
		movie1.setRunningTime(152);

		// 생성자 이용해서 넣기
		Movie movie2 = new Movie(002, "광해", "추창민", "역사", 131);
		SeriesMovie smovie1 = new SeriesMovie(003, "반지의 제왕", "피터 잭슨", "판타지", 178, 1, "반지 원정대");
		SeriesMovie smovie2 = new SeriesMovie(004, "반지의 제왕", "피터 잭슨", "판타지", 179, 2, "두개의 탑");
		SeriesMovie smovie3 = new SeriesMovie(005, "반지의 제왕", "피터 잭슨", "판타지", 199, 3, "왕의 귀환");

		mv.add(movie1);
		mv.add(movie2);
		mv.add(smovie1);
		mv.add(smovie2);
		mv.add(smovie3);
		
		System.out.println(Arrays.toString(mv.searchByTitles("다크")));

		System.out.println(Arrays.toString(mv.getSeriesMovie()));
		System.out.println("============================");
		System.out.println(Arrays.toString(mv.getMovie()));
		System.out.println("============================");
		System.out.println(mv.getRunningTimeAvg());

//		System.out.println("관리번호 : " + movie1.id);
//		System.out.println("영화제목 : " + movie1.title);
//		System.out.println("감독 : " + movie1.director);
//		System.out.println("상영시간 : " + movie1.runningTime + "분");
//		System.out.println("-------------------------------");
//		System.out.println("관리번호 : " + movie2.id);
//		System.out.println("영화제목 : " + movie2.title);
//		System.out.println("감독 : " + movie2.director);
//		System.out.println("상영시간 : " + movie2.runningTime + "분");
	}// end main()
}// end class
