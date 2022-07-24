package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieManager {

	private static final int MAX_SIZE = 100;
	Movie[] movieList = new Movie[MAX_SIZE];
	int size = 0;

	public void add(Movie mov) {
		if (size < MAX_SIZE) {
			movieList[size++] = mov;
		} else {
			System.out.println("영화의 수가 100을 넘었습니다. 등록 불가.");

		}

	}

//	List<Movie> getList() {
//		List<Movie> mov = new ArrayList<Movie>();
//		
//		for(int i=0; i<size; i++) {
//			mov.add(movieList[i]); 
//			System.out.println(movieList[i]);
//			
//		}
//			return mov;
//	}
	// 방법 1. for문 이용
	public Movie[] getList2() {
		Movie[] mov = new Movie[size];
		for (int i = 0; i < size; i++) {
			mov[i] = movieList[i];
		}
		return movieList;
	}

	// 방법 2. Arrays.copyOfRange 이용
	public Movie[] getList() {
		return Arrays.copyOfRange(movieList, 0, size);
	}

//	void getList() {
//		for(int i=0; i<size; i++) {
//			System.out.printf("%d %s\n",movieList[i].getId(), movieList[i].getTitle());
//			
//		}
//	}

	// 일반영화를 반환
	public Movie[] getMovie() {
		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			// 리스트안의 객체가 SeriesMovie 클래스의 인스턴스인지 검사
			if (!(movieList[i] instanceof SeriesMovie)) {
				cnt++;
			}
		}

		if (cnt == 0)
			return null;

		Movie[] res = new Movie[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			// 리스트안의 객체가 SeriesMovie 클래스의 인스턴스인지 검사
			if (!(movieList[i] instanceof SeriesMovie)) {
				res[index++] = movieList[i];
			}
		}

		return res;

	}

	// 시리즈 영화를 반환
	public Movie[] getSeriesMovie() {
		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			// 리스트안의 객체가 SeriesMovie 클래스의 인스턴스인지 검사
			if (movieList[i] instanceof SeriesMovie) {
				cnt++;
			}
		}

		if (cnt == 0)
			return null;

		SeriesMovie[] res = new SeriesMovie[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if (movieList[i] instanceof SeriesMovie) {
				res[index++] = (SeriesMovie) movieList[i];
			}
		}

		return res;
	}

	// 영화를 제목으로 찾는 메소드 완전일치사용
	public Movie searchByTitle(String title) {
		for (int i = 0; i < size; i++) {
			if (title.equals(movieList[i].getTitle())) {
				// 찾으면 리턴
				return movieList[i];
			}
		}
		return null;
	}

	// 영화를 제목 일부 또는 전체로 찾는 영화리스트 반환
	public Movie[] searchByTitles(String title) {
		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			// 제목이 들어가 있는지 탐색
			if (movieList[i].getTitle().contains(title)) {
				cnt++;
			}
		}

		if (cnt == 0) {
			return null;
		}

		Movie[] res = new Movie[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			if (movieList[i].getTitle().contains(title)) {
				res[index++] = movieList[i];
			}
		}
		return res;
	}

	// 영화 평균상영시간 반환
	public double getRunningTimeAvg() {
		int sum = 0;

		for (int i = 0; i < this.size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum / this.size;
	}

}
