package com.ssafy.ws.step2;

import java.util.ArrayList;
import java.util.List;


public class MovieManagerImpl implements IMovieManager {
	private final int MAX_SIZE = 100;

	private List<Movie> movieList = new ArrayList<Movie>();

	// 싱글톤 패턴을 위한 객체생성
	private static IMovieManager instance = new MovieManagerImpl();

	// 싱글톤패턴 기본생성자
	private MovieManagerImpl() {
	}
	
	public static IMovieManager getInstance() {
		return instance;
		
	}

	@Override
	public void add(Movie m) {
		if (movieList.size() < MAX_SIZE) {
			movieList.add(m);
		} else {
			System.out.println("등록된 영화수가 너무 많습니다.");
		}
	}

	@Override
	public Movie[] getList() {

		Movie[] res = new Movie[movieList.size()];
		return this.movieList.toArray(res);
	}

	@Override
	public Movie[] searchBytitle(String title) {
		List<Movie> list = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getTitle().contains(title)) {
				list.add(movieList.get(i));
			}
		}
		
		// 주어진 단어를 포함하는 사용자가 없으면 null을 반환한다.
		if(list.size() == 0)
			return null;
		
		Movie[] res = new Movie[list.size()];

		return list.toArray(res);
	}

	//일반영화 가져오기
	@Override
	public Movie[] getMovies() {
		List<Movie> list = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {
			if (!(movieList.get(i) instanceof SeriesMovie)) {
				
				list.add(movieList.get(i));
			}
		}

		Movie[] res = new Movie[list.size()];

		return list.toArray(res);
	}

	//시리즈영화 가져오기
	@Override
	public SeriesMovie[] getSeriesMovies() {
		List<Movie> list = new ArrayList<>();

		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i) instanceof SeriesMovie) {
				list.add(movieList.get(i));
			}
		}
		SeriesMovie[] res = new SeriesMovie[list.size()];

		return list.toArray(res);
	}

	@Override
	public double getRunningTimeAvg() {
		int sum = 0;
		
		for(int i=0; i<movieList.size(); i++) {
			sum += movieList.get(i).getRunningTime();
		}
		return sum / movieList.size();
	}
}
