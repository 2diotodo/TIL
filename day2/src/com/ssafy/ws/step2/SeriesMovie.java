package com.ssafy.ws.step2;

public class SeriesMovie extends Movie{

	private int seriesNum;
	private String episode;
	
	public SeriesMovie() {
		super();
	}
	
	public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episode) {
		super(id, title, director, genre, runningTime);
		this.seriesNum = seriesNum;
		this.episode = episode;
	}

	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
		return String.format("[관리번호: %d | 영화제목: %s | 감독: %s | 장르: %s | 상영시간: %d | 시리즈순서: %d | 에피소드명: %s\n",
				this.getId(), this.getTitle(), this.getDirector(), this.getGenre(), this.getRunningTime(), seriesNum, episode );
	}
	
	
}
