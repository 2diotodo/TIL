package pairproject;

public class NotFoundExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public NotFoundExceptions(String name) {
		super(name + "을(를) 포함하는 운동은 존재하지 않아요~");
		this.name = name;
	}
	
	
}
