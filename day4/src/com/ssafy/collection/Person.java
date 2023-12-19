package com.ssafy.collection;

import java.util.Objects;

public class Person implements Comparable<Person>{
	String name;
	String pNum;
	int age;
	
	public Person() {
	}
	
	public Person(String name, String pNum, int age) {
		this.name = name;
		this.pNum = pNum;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", pNum=" + pNum;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(pNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		Person other = (Person) obj;
		return pNum.equals(other.pNum);
	}

	//주민등록번호
//	@Override
//	public int compareTo(Person o) {
//		return this.pNum.compareTo(o.pNum);
//	}
	//나이순으로 정렬
	@Override
	public int compareTo(Person o) {
		return o.age-this.age ;
	}
	
}
