package pairproject;

import java.util.List;

public interface IExerciseUser {
	List<Exercise> getList();
	List<Exercise> searchByName(String name) throws NotFoundExceptions;
	List<Exercise> searchByTarget(String target) throws NotFoundExceptions;
	
}
