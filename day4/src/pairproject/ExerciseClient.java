package pairproject;

import java.util.List;

public class ExerciseClient implements IExerciseUser {

	ExerciseManager manager = ExerciseManager.getInstance();

	@Override
	public List<Exercise> getList() {

		return manager.getList();
	}

	@Override
	public List<Exercise> searchByName(String name) throws NotFoundExceptions {
		return manager.searchByName(name);
	}

	@Override
	public List<Exercise> searchByTarget(String target) throws NotFoundExceptions {
		return manager.searchByTarget(target);
	}

	
}
