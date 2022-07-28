package com.ssafy.exception1;

public class ExceptionTest5 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("ssafy");
		try {
			int i = 0;
		}finally {
			//어떠한 상황에서도 수행해야하는 것
			System.out.println("얘는 무조건 수행");
		}
	}
}
