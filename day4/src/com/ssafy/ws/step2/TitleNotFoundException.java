package com.ssafy.ws.step2;

public class TitleNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	
	public TitleNotFoundException(String title) {
		super(title + "을(를) 포함하는 영화는 존재하지 않습니다.");
		this.title = title;
		
	}
	
	String getTitle() {
		return this.title;
	}
}
