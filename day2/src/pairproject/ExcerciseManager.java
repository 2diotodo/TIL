package pairproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ssafy.ws.step2.Movie;

public class ExcerciseManager {
	
	private Excercise[] excerciseList = new Excercise[100];
	int size = 0;
	private static ExcerciseManager instance = new ExcerciseManager();
	List<String> list = new ArrayList<String>();

	//운동 등록 singleton
	private ExcerciseManager() {

	}
	
	public static ExcerciseManager getInstance() {
		return instance;
	}

	public void add(Excercise excercise) {
		//운동을 추가하겠다. 
		//최대사이즈를 우리가 제한이 있으니 
		if(size < 100) {
			excerciseList[size++] = excercise;
			
		}
		else {
			System.out.println("더이상 온동을 추가할 수 없어요 ㅠ^ㅠ");
		}
	}//end add
	
	public List<String> getList() {
		// list clear를 통해 여러번 등록해도 이름이 쌓이지 않도록 함.
		list.clear();
		for (int i = 0; i < size; i++) {
			list.add(excerciseList[i].getName());
		}
//		System.out.println(list);
		return list;

	}
	//부위검색메소드
	public List<String> searchByTarget(String target) {
//		List<String> list = new ArrayList<String>();
		list.clear();
		for(int i = 0 ; i<size; i++) {
			if(excerciseList[i].getTarget().equals(target)) {
				list.add(excerciseList[i].getName()); 
			}
		}
//		System.out.println(list); 

		return list;
	}
	//이름검색 메소드
	public void searchByName(String name) {
		for(int i = 0 ; i<size; i++) {
			if(excerciseList[i].getName().equals(name)) {
				//같은 이름인 아이
				System.out.println(excerciseList[i].toString());
			}
		}

	}
	
}
