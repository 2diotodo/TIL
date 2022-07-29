package pairproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ssafy.ws.step2.Movie;

public class ExerciseManager implements IExerciseUser {

	private Exercise[] exerciseList = new Exercise[100];
	int size = 0;
	private static ExerciseManager instance = new ExerciseManager();
	List<Exercise> list = new ArrayList<>();

	// 운동 등록 singleton
	private ExerciseManager() {

	}

	public static ExerciseManager getInstance() {
		return instance;
	}

	public void add(Exercise excercise) {
		// 운동을 추가하겠다.
		// 최대사이즈를 우리가 제한이 있으니
		if (size < 100) {
			exerciseList[size++] = excercise;

		} else {
			System.out.println("더이상 온동을 추가할 수 없어요 ㅠ^ㅠ");
		}
	}// end add

	public List<Exercise> getList() {
		// list clear를 통해 여러번 등록해도 이름이 쌓이지 않도록 함.
		list.clear();
		for (int i = 0; i < size; i++) {
			list.add(exerciseList[i]);
		}
//		System.out.println(list);
		return list;

	}

	// 부위검색메소드
	public List<Exercise> searchByTarget(String target) {
		list.clear();
		for (int i = 0; i < size; i++) {
			if (exerciseList[i].getTarget().equals(target)) {
				list.add(exerciseList[i]);
			}
		}
		try {
			if (list.size() == 0) {
				throw new NotFoundExceptions(target);
			}
		} catch (NotFoundExceptions e) {
			e.printStackTrace();
		}

		return list;
	}

	// 이름검색 메소드
	public List<Exercise> searchByName(String name) {
		list.clear();
		for (int i = 0; i < size; i++) {
			if (exerciseList[i].getName().equals(name)) {
				// 같은 이름인 아이
				list.add(exerciseList[i]);
			}
		}

		try {
			if (list.size() == 0) {
				throw new NotFoundExceptions(name);
			}
		} catch (NotFoundExceptions e) {
			e.printStackTrace();
		}

		return list;

	}

}
