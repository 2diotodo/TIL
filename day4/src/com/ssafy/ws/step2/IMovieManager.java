package com.ssafy.ws.step2;

public interface IMovieManager {
	void add(Movie movie);
	Movie[] getList();
	Movie[] searchBytitle(String title);
	Movie[] getMovies();
	SeriesMovie[] getSeriesMovies();
	double getRunningTimeAvg();
}
