package java04.control;

public class IF03 {
	public static void main(String[] args) {
		int score = 87;

		// 이상 초과 이하 미만

		// 90점 이상 일 경우는 A학점
		// 90점 미만 80점 이상 일경우는 B학점
		// 80점 미만 70점 이상 일경우는 C학점
		// 그외 F학점

//		if(score >= 90) {
//			System.out.println("A");
//		}else {
//			if(score < 90 && score >= 80) {
//				System.out.println("B");
//			}else {
//				if(score < 80 && score >=70) {
//					System.out.println("C");
//				}else {
//					System.out.println("F");
//				}
//			}
//		}

//		if(score >= 90) {
//			System.out.println("A");
//		}else {
//			if(score >= 80) {
//				System.out.println("B");
//			}else {
//				if(score >=70) {
//					System.out.println("C");
//				}else {
//					System.out.println("F");
//				}
//			}
//		}

		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else
			System.out.println("F");

	}
}
