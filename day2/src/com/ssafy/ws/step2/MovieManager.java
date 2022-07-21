package com.ssafy.ws.step2;

import java.util.Arrays;

public class MovieManager {
	Movie[] movies = new Movie[100];
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
