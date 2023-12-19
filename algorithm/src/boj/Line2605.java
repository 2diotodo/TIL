package boj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Line2605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생 수 입력받기
		int N = sc.nextInt();
		int[] sel = new int[N];
		List<Integer> list = new ArrayList<>();
		//뽑은 번호 입력받기
		for(int i=0; i<N; i++) {
			sel[i] = sc.nextInt();
		}
		//뽑은 번호적용해 배정
		for(int i=0; i<N; i++) {
			list.add(i-sel[i], i+1);
			
		}
		
		//출력
//		for(int i=0; i<list.size();i++) {
//			System.out.print(list.get(i));
//		}
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}//end main()
}//end class
