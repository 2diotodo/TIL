package pairproject;

import java.util.Scanner;

public class ExerciseTest {
	public static void main(String[] args) throws NotFoundExceptions {
		Scanner sc = new Scanner(System.in);
		ExerciseManager manager = ExerciseManager.getInstance();
		ExerciseClient client1 = new ExerciseClient();

		int sel = 0;

		Exercise excercise1 = new Exercise("렛플다운", 100, 20, "등", 5);
		Exercise excercise2 = new Exercise("벤치프레스", 120, 15, "가슴", 7);
		Exercise excercise3 = new Exercise("스쿼트", 110, 30, "하체", 10);

		manager.add(excercise1);
		manager.add(excercise2);
		manager.add(excercise3);

		// 사용자모드 실행 프로세스
		do {
			System.out.println("메뉴선택");
			System.out.println("1. 운동목록보기\n2. 운동부위검색하기\n3. 운동이름검색하기\n9. 관리자메뉴\n0. 종료하기");
			sel = sc.nextInt();
			if (sel == 9) {
				// 관리자모드 실행 프로세스
				do {
					System.out.println("메뉴선택");
					System.out.println("1. 운동추가하기\n2. 운동목록보기\n3. 운동부위검색하기\n4. 운동이름검색하기\n5. 사용자모드복귀");
					sel = sc.nextInt();
					if (sel == 1) {
						System.out.println("운동을 추가합니다.");

						System.out.print("운동이름: ");
						String name = sc.next();
						System.out.print("칼로리: ");
						int kcal = sc.nextInt();
						System.out.print("시간(분): ");
						int time = sc.nextInt();
						System.out.print("부위: ");
						String target = sc.next();
						System.out.print("세트수: ");
						int set = sc.nextInt();
						Exercise ex = new Exercise(name, kcal, time, target, set);
						manager.add(ex);

					} else if (sel == 2) {
						System.out.println("모든 운동목록을 출력합니다.");
						manager.getList();
						System.out.println(manager.list);

					} else if (sel == 3) {
						System.out.println("운동을 검색합니다. 부위 입력");
						String target = sc.next();
						manager.searchByTarget(target);
						System.out.println(manager.list);

					} else if (sel == 4) {
						System.out.println("운동을 검색합니다. 이름입력");
						String name = sc.next();
						manager.searchByName(name);

					}
				} while (sel != 5);
				//관리자모드 끝, 다시 사용자모드재개
			} else if (sel == 1) {
				System.out.println("모든 운동목록을 출력합니다.");
				client1.getList();
				System.out.println(client1.getList().toString());

			} else if (sel == 2) {
				System.out.println("운동을 검색합니다. 부위 입력");
				String target = sc.next();
				System.out.println(client1.searchByTarget(target).toString());

			} else if (sel == 3) {
				System.out.println("운동을 검색합니다. 이름입력");
				String name = sc.next();
				System.out.println(client1.searchByName(name));

			}
		} while (sel != 0);

		
		
		
		sc.close();
	}
}
