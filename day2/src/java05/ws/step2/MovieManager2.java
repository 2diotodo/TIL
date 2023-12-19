package java05.ws.step2;

import java.util.Arrays;

import com.ssafy.ws.step2.Movie;
import com.ssafy.ws.step2.MovieManager;

public class MovieManager2 {
	
	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE]; //최대로 관리하는 영화배열
	private int size = 0;
	private static MovieManager2 instance = new MovieManager2();
	
	//싱글턴으로 이 매니저의 생성을 제한할거야
	private MovieManager2() {
	}
	
	public static MovieManager2 getInstance() {
		return instance;
	}
	
	public void add(Movie movie) {
		//영화를 추가하겠다. 
		//최대사이즈를 우리가 제한이 있으니 
		if(size < MAX_SIZE)
			movieList[size++] = movie;
		else {
			System.out.println("더이상 영화를 추가할 수 없어요 ㅠ^ㅠ");
		}
	}
	
	public Movie searchByTitle(String title) {
//		int idx = -1;
		for(int i = 0 ; i<size; i++) {
			if(movieList[i].getTitle().equals(title)) {
//				idx = i;
//				break;
				return movieList[i];
			}
		}
//		if(idx != -1) {
//			return movieList[idx];
//		}
		return null;
	}
	
	public Movie[] getList() {
		Movie[] movies = new Movie[size];
		for(int i = 0 ; i<size; i++) {
			movies[i] = movieList[i];
		}
		return movies;
	}
	
	public Movie[] getList2() {
		return Arrays.copyOfRange(movieList, 0, size);
	}
	
}
