package com.ssafy.hw.step2;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager userm = new UserManager();
		int sel;
		do {
			System.out.println("원하는 활동?");
			System.out.println("1. 사용자등록\n2. 사용자 검색\n3. 사용자 수\n0. 종료");
			sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("사용자를 등록합니다.");
				System.out.print("아이디 입력: ");
				String id = sc.next();
				System.out.print("비밀번호 입력: ");
				String password = sc.next();
				System.out.print("이름 입력: ");
				String name = sc.next();
				System.out.print("이메일 입력: ");
				String email = sc.next();
				System.out.print("나이 입력: ");
				int age = sc.nextInt();

				User user = new User(id, password, name, email, age);
				userm.add(user);
				//이름만 반환하는 메소드
				userm.getList();

			} else if (sel == 2) {
				//사용자 이름 검색 구현
				System.out.print("사용자를 검색합니다.\n이름입력: ");
				String name = sc.next();
				User user = userm.searchByName(name);
				if(user==null) {
					//미등록 사용자일 경우
					System.out.println("등록되지 않는 사용자입니다.");
				}else {
					//등록된 이름일 경우
					System.out.printf("이름: %s\n나이: %d\n", user.getName(), user.getAge());
				}

			} else if(sel == 3) {
				//UserManager객체 size를 이용해 사용자수 출력
				System.out.println("등록된 사용자 수를 출력합니다.\n"+userm.size);
				System.out.println(userm.list);
			}
		} while (sel != 0);
	}//end main()
}//end class
