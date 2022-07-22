package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieManager {
	
	private static final int MAX_SIZE = 100;
	Movie[] movies = new Movie[MAX_SIZE];
	int size = 0;

	public MovieManager() {

	}
	
	public void add(Movie mov) {
		movies[size++] = mov;
		
	}
	
//	List<Movie> getList() {
//		List<Movie> mov = new ArrayList<Movie>();
//		
//		for(int i=0; i<size; i++) {
//			mov.add(movies[i]); 
//			System.out.println(movies[i]);
//			
//		}
//			return mov;
//	}
	//방법 1. for문 이용
	public Movie[] getList2() {
		Movie[] mov = new Movie[size];
		for(int i=0; i<size; i++) {
			mov[i] = movies[i];
		}
		return movies;
	}
	
	//방법 2. Arrays.copyOfRange 이용
	public Movie[] getList(){
		return Arrays.copyOfRange(movies,0,size);
	}
	
	
//	void getList() {
//		for(int i=0; i<size; i++) {
//			System.out.printf("%d %s\n",movies[i].getId(), movies[i].getTitle());
//			
//		}
//	}
	
	Movie searchByTitle(String title) {
		for(int i=0; i<size; i++) {
			if(title.equals(movies[i].getTitle())) {
				//찾으면 리턴
				return movies[i];
			}
		}
		return null;
	}
}
