package com.ssafy.modifier01;

//import java.lang.*; 자동으로 들어있어서 System.out.println();

import java.util.Arrays;
//스캐너를 사용하기 위해서 import 해서 가져온다.
import java.util.Scanner;
//import java.util.*; 요거 안에 모든것을 넣을래.
import java.util.function.Function;

import com.ssafy.class03.Person;
import com.ssafy.class04.DogTest;

public class PackageTest {
	public static void main(String[] args) {
		Scanner sc;
		
		Arrays arr;
		
		Function f;
		
		Person p; //class03에 있는 Person 이라는 것을 가지고 왔어요.
		
		com.ssafy.class02.Person p2; //import를 하지 않고 요기다가 풀패키지명을 작성할수 도 있음.
		
		DogTest dt;
		
	}
}
