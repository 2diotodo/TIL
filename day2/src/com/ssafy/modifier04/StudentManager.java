package com.ssafy.modifier04;

public class StudentManager {
	private Student[] students = new Student[100];
	private int size = 0;

	private static StudentManager manager = new StudentManager();
	
	private StudentManager() {
	}
	
	public static StudentManager getManger() {
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
