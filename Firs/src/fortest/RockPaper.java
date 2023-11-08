package fortest;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위 바위 보

		String[] a = { "가위", "바위", "보" };

		Scanner sc = new Scanner(System.in);
		int winCount = 0; // 이김수
		int playCount = 0; //진행도
		
		while (true) {
			System.out.print("유저 입력값(0~2)(-1 : 종료) => ");
			int user = sc.nextInt();
			
			//잘못된 입력 + 종료조건
			if(user>2) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요!");
				continue;
			} else if(user == -1)
			{
				System.out.println("게임 종료");
				System.out.println("★ "+playCount+"번 진행 중 " + winCount+"번 이김");
				return;
			}
			
			//컴퓨터 랜덤값 0~2사이
			int num = (int) (Math.random() * 3);
			System.out.println("유저 : " + a[user] + " / 컴퓨터 : " + a[num]);
			playCount++;//게임진행 횟수
			
			
			switch (user) {
			case 0: {
				if (num == 0) {
					System.out.println("비김");
					break;
				} else if (num == 1) {
					System.out.println("짐");
					break;
				} else {
					System.out.println("이김"); winCount++;
					break;
				}
			}

			case 1: {
				if (num == 0) {
					System.out.println("이김"); winCount++;
					break;
				} else if (num == 1) {
					System.out.println("비김");
					break;
				} else {
					System.out.println("짐");
					break;
				}
			}

			case 2: {
				if (num == 0) {
					System.out.println("짐");
					break;
				} else if (num == 1) {
					System.out.println("이김"); winCount++;
					break;
				} else {
					System.out.println("비김");
					break;
				}
			}

		
			}

		}

	}

}
