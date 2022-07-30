import java.util.Comparator;

public class AscDescending implements Comparator<Integer>{
	@Override		//{1, 3, 5, 2, 4, 1}
	public int compare(Integer o1, Integer o2) {
		System.out.printf("%d  %d :%d\n", o1, o2, o1.compareTo(o2));
		//오름차순
		return o1.compareTo(o2);
	}
}