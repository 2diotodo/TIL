package com.ssafy.hw.step2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	User[] users = new User[100];
	int size = 0;
	List<String> list = new ArrayList<String>();
	
	
	//시도 1.
	//이 방법은 사용자 리스트 전체가 반환되어 전체 사용자 리스트를 반환하면 안된다는 조건에 위배됨.
	//User[] users object배열 내의 각 칸에 존재하는 특정 변수(name같은) 를 새로운 배열 정의를 통해 반환할 방법 찾고 있습니다.
	String[] nameList = new String[100];

	public void add(User u) {
		users[size++] = u;

	}

	// 시도 1.
	// 이 방법은 사용자 리스트 전체가 반환되어 전체 사용자 리스트를 반환하면 안된다는 조건에 위배됨.
	// User[] users object배열 내의 각 칸에 존재하는 특정 변수(name같은) 를 새로운 배열 정의를 통해 반환할 방법 찾고
	// 있습니다.
//	public User[] getList() {
//		
//				return Arrays.copyOfRange(users, 0, size);
//	}
	

	// 시도 2. 이렇게 하면 이름만 sorting 하여 반환하게 된 것으로 보이는데 맞나요?
	// 사용자리스트 반환할거야 이름만!
	// User[] users에서 name만 뽑아다 list에 넣자.
	// 그리고 그 list를 반환하기!
	public List<String> getList() {
		// list clear를 통해 여러번 등록해도 이름이 쌓이지 않도록 함.
		list.clear();
		for (int i = 0; i < size; i++) {
			list.add(users[i].getName());
		}
		return list;

	}

	// 시도 3. 일반배열에 name담아 출력하기
	// 배열은 관리가 힘들어보인다. 초기 할당크기만큼 배열이 출력되어버린다. list collection 이 쉬워보인다. 땅땅
	public String[] getList3() {

		for (int i = 0; i < size; i++) {
			nameList[i] = users[i].getName();
		}
		return nameList;
	}

	//이름검색 완전일치
//	User searchByName(String name) {
//		for (int i = 0; i < size; i++) {
//			// 이름이 같니?
//			if (name.equals(users[i].getName())) {
//				// 같은이름이면 리턴해
//				return users[i];
//			}
//		}
//		// 다르면 암것도 리턴하지마
//		return null;
//
//	}
	//이름검색 부분반환
	User searchByName(String name) {
		for (int i = 0; i < size; i++) {
			String pattern = "*"+name+"*";
			// 이름에 입력한 패턴이 존재하니?
			if ((users[i].getName()).matches(pattern)) {
				// 같은이름이면 리턴해
				return users[i];
			}
		}
		// 다르면 암것도 리턴하지마
		return null;

	}
}
