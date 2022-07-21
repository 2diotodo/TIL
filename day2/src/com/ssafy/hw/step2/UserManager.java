package com.ssafy.hw.step2;

public class UserManager {
	User[] users = new User[100];
	int size = 0;
	
	void add(User u) {
		users[size++] = u;
	}
	
	void getList() {
		
	}
}
