package com.ssafy.modifier04;

public class StudentManager {
	private Student[] students = new Student[100];
	private int size = 0;

	// 2. 외부에서 생성하지 못하니 내가 인스턴스를 가지고 있어야겠다.
	// 외부에서 접근하지 못하게 private으로 만들어 놓는다.
	// 5. 이 친구도 미리 메모리에 올려서 써야겠다.
	private static StudentManager manager = new StudentManager();

	// 1. 외부에서 접근하지 못하게 막는다. 기본생성자를
	private StudentManager() {

	}

	// 3. 외부에서 매니저를 가져다가 써야되니까 public한 접근자를 생성한다.
	// 4. 결국에는 인스턴스를 생성해야만 게터에 접근할 수 있었으니까 그걸 제한해놓아버렸으니
	// static 키워드를 붙여서 미리 메모리에 올려놓자.
	public static StudentManager getManager() {
		return manager;
	}

	public void addStudent(Student s) {
		students[size++] = s;
	}

	void changeMajor(String name, String major) {
		Student s = getStudent(name);
		if (s != null) {
			s.setMajor(major);
		}
	}

	Student getStudent(String name) {
		for (int i = 0; i < size; i++) {
			if (name.equals(students[i].getName())) {
				// 찾았어? 그러면 바로 리턴
				return students[i];
			}
		}
		// 서울 8반 오윤식님 아이디어~~
		return null;
	}
}
