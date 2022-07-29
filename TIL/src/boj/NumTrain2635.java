package boj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumTrain2635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		List<Integer> arr = new ArrayList<>();
		int d = 0;

		for (int j = 1; j < N; j++) {
			arr.add(N);
			d=N-j;
			arr.add(d);
			d=N-d;
			arr.add(d);
			

			
		}
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			
		}
	}// end main()

}// end class
