package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieManagerImpl implements IMovieManager {
	private final int MAX_SIZE = 100;

	private Movie[] movieList = new Movie[MAX_SIZE];

	private int size = 0;

	// 싱글톤 패턴을 위한 객체생성
	private static MovieManagerImpl mm = new MovieManagerImpl();

	// 싱글톤패턴 기본생성자
	private MovieManagerImpl() {
	}
	
	public static MovieManagerImpl getInstance() {
		return mm;
		
	}

	@Override
	public void add(Movie movie) {
		if (size < MAX_SIZE) {
			movieList[size++] = movie;
		} else {
			System.out.println("등록된 영화수가 너무 많습니다.");
		}
	}

	@Override
	public Movie[] getList() {

		return Arrays.copyOfRange(movieList, 0, size);
	}

	@Override
	public Movie[] searchBytitle(String title) {
		int cnt = 0;
		
		for(int i=0; i <this.size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				cnt++;
			}
		}
		
		if(cnt==0)
			return null;
		
		Movie[] res = new Movie[cnt];
		
		for(int i=0, index=0; i<this.size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				res[index++] = movieList[i];
			}
		}
		
		return res;
	}

	@Override
	public Movie[] getMovies() {
		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)) {
				cnt++;
			}
		}

		if (cnt == 0) {
			return null;
		}

		Movie[] res = new Movie[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			if (!(movieList[i] instanceof SeriesMovie)) {
				res[index++] = movieList[i];
			}
		}
		return res;
	}

	@Override
	public SeriesMovie[] getSeriesMovies() {
		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				cnt++;
			}
		}

		if (cnt == 0) {
			return null;
		}

		SeriesMovie[] res = new SeriesMovie[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			if (movieList[i] instanceof SeriesMovie) {
				res[index++] = (SeriesMovie)movieList[i];
			}
		}
		return res;
	}

	@Override
	public double getRunningTimeAvg() {
		int sum = 0;
		
		for(int i=0; i<this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum / this.size;
	}
}
