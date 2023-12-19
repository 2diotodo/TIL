package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SevenDwarf2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			arr.add(sc.nextInt());
		}

		for (int i = 0; i < 9; i++) {
			sum += arr.get(i);
		}

		outer: for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				int fake = arr.get(i) + arr.get(j); // 두 수 뽑아내기
				if ((sum - fake) == 100) { // 전체합에서 두 수 뽑아서 낸 합과 비교
					arr.remove(j); // 100이면 그 두 수 삭제
					arr.remove(i); // arraylist라 뒤에서부터 삭제
					break outer; // 100되는거 찾으면 바로 반복문 나가기
				}
			}
		}
		// 오름차순 정렬
		Collections.sort(arr);
		// 출력
		for (int i = 0; i < 7; i++) {
			System.out.println(arr.get(i));
		}

	}// end main()
}// end class
