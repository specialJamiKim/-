package solve_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8 {

	public static void main(String[] args) throws IOException {

		int winCount = 0, loseCount = 0;// 승리횟수,패배횟수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int user = 0, com = 0, result = 0;
		String[] rcp = { "가위", "바위", "보" };

		while (winCount < 5) {
			System.out.println("=====================================");
			System.out.print("가위(1),바위(2),보(3) 중에 선택해주세요. >>");
			user = Integer.parseInt(br.readLine());
			com = (int) (Math.random() * 3 + 1); // 1~3사이 숫자랜덤

			if (user >= 4 || user <= 0) {
				System.out.println("★잘못된 입력입니다. 다시 진행해주세요.★");
				continue;
			}

			// 결과값 계산
			result = user - com;

			if (result == 0) {
				System.out.printf("플레이어 %s vs %s 컴퓨터 : 비김\n", rcp[user - 1], rcp[com - 1]);
				System.out.printf("승리 : %d/5, 패배 : %d\n", winCount, loseCount);

			} else if (result == -1 || result == 2) {
				System.out.printf("플레이어 %s vs %s 컴퓨터 : 짐\n", rcp[user - 1], rcp[com - 1]);
				loseCount++;
				System.out.printf("승리 : %d/5, 패배 : %d\n", winCount, loseCount);
			} else if (result == -2 || result == 1) {
				System.out.printf("플레이어 %s vs %s 컴퓨터 : 이김\n", rcp[user - 1], rcp[com - 1]);
				winCount++;
				System.out.printf("승리 : %d/5, 패배 : %d\n", winCount, loseCount);
			}

		}
		System.out.println("게임이 종료되었습니다.");
		br.close();
	}

}
