package java05.array;

import java.util.Arrays;

public class Prob02_Frequency {
	public static void main(String[] args) {
		//빈도수 구하기
		//와 이건 좀 감탄스러운데...
		int[] intArray = {3,7,2,5,7,7,9,2,8,1,1,5,3};
		
		int[] used = new int[10];
		
		for(int num : intArray) {
			used[num]++;
		}
		
		System.out.println(Arrays.toString(used));
		
	}//end main()
}//end class
