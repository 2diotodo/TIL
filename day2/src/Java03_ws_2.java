import java.util.Scanner;

public class Java03_ws_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // NxN크기의 농장

		int[][] farm = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				farm[i][j] = sc.nextInt();
			}
		} // 입력끝
			// 최대값을 뽑아야되니까 아주 작은값으로 초기화
			// 만약 최솟값을 뽑아야한다면 임으의 큰값으로 초기화를 한다.
		int ans = 0;

		// delta row
		int[] dr = new int[] { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		// 전체 농장을 순회 하면서 판단을 해보자.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				// 현재자리도 영양분에 포함이 되니까~~
				int nutrition = farm[i][j];

				// 4방향을 파악하는것
				for (int d = 0; d < 4; i++) {
					int nr = i + dr[d];
					int nc = j + dc[d];
					if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
						nutrition += farm[nr][nc];
					}
				}
				// 갱신
				if (ans < nutrition)
					ans = nutrition;
			}
		}
		System.out.println(ans);

	}// main
}// class
