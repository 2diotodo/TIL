package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) throws TitleNotFoundException {
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

		IMovieManager mv = MovieManagerImpl.getInstance();
		mv.add(movie1);
		mv.add(movie2);
		mv.add(smovie1);
		mv.add(smovie2);
		mv.add(smovie3);
		
		System.out.println(Arrays.toString(mv.searchBytitle("황")));
		System.out.println("============================");
		System.out.println(Arrays.toString(mv.getSeriesMovies()));
		System.out.println("============================");
		System.out.println(Arrays.toString(mv.getMovies()));
		System.out.println("============================");
		System.out.println(mv.getRunningTimeAvg());
	}//end main()
}//end class
