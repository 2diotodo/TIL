package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoomSelect13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생수, 방 인원한도 입력받기
		int N = sc.nextInt();
		int K = sc.nextInt();
		// 남여 학년별 인원수 저장
		int[] girlGradeNum = new int[6];
		int[] boyGradeNum = new int[6];
		// 남여 필요 방 개수
		int girlRoom = 0;
		int boyRoom = 0;

		List<Integer> girl = new ArrayList<>();
		List<Integer> boy = new ArrayList<>();
		// 학생정보 입력받기
		for (int i = 0; i < N; i++) {
			int gender = sc.nextInt();
			int grade = sc.nextInt();

			if (gender == 0) {
				girl.add(grade); // 여학생이면 여학생 배열에
			} else if (gender == 1) {
				boy.add(grade); // 남학생이면 남학생 배열에 담기
			}
		}
		System.out.println(girl);
		System.out.println(boy);
		// 여학생 필요한 방 개수구하기
		// 여학생 학년별 인원 저장
		for (int i = 0; i < girl.size(); i++) {
			for (int j = 0; j < 6; j++) {

				if (girl.get(i) == j + 1) {
					girlGradeNum[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(girlGradeNum));

		// 학년별 명수가 제한인원인지 따져서 최소 방 개수 구하기
		for (int i = 0; i < girlGradeNum.length; i++) {
			if (girlGradeNum[i] > K) {
				int n = (girlGradeNum[i] / K) + 1;
				girlRoom = girlRoom + n;
			} else if (girlGradeNum[i] > 0) {
				girlRoom++;
			}
		}
		// 남학생 필요한 방 개수구하기
		// 남학생 학년별 인원 저장
		for (int i = 0; i < boy.size(); i++) {
			for (int j = 0; j < 6; j++) {

				if (boy.get(i) == j + 1) {
					boyGradeNum[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(boyGradeNum));
		// 학년별 인원이 제한인원 안쪽인지 따져서 최소 방 개수 구하기
		for (int i = 0; i < boyGradeNum.length; i++) {
			if (boyGradeNum[i] > K) {
				int n = (boyGradeNum[i] / K) + 1;
				boyRoom = boyRoom + n;
			} else if (boyGradeNum[i] > 0) {
				boyRoom++;
			}
		}
		// 여학생 필요 방 + 남학생 필요 방 출력
		System.out.println(girlRoom + boyRoom);
	}// end main()
}// end class
