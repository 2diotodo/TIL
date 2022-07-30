package com.ssafy.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListArrayTest {
	public static void main(String[] args) {
		//리스트 배열 이구여 이렇게만 놔두면 사실 쓸수는 없음
		List<String>[] list = new ArrayList[3];
		
		
		//각각의 요소에 접근해서 생성을 해주어야 사용이 가능하다.
		for(int i =  0 ; i<list.length; i++) {
			list[i] = new ArrayList<String>();
		}
		
		
		
	}
}
