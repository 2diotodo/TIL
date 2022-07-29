package pairproject;

public class Exercise {
	private String name;
	private int kcal;
	private int time;
	private String target;
	private int set;
	
	public Exercise() {
	}
	
	
	public Exercise(String name, int kcal, int time, String target, int set) {
		super();
		this.name = name;
		this.kcal = kcal;
		this.time = time;
		this.target = target;
		this.set = set;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return String.format("%s : [ kcal=%d  | time=%d  | target=%s  | set=%d ]\n", name, kcal, time, target, set);
//		return "Excercise [kcal=" + kcal + ", time=" + time + ", target=" + target + ", set=" + set + "]";
	}
	
	
	
}
