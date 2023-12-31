package switchTest;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 ==> ");
		int month = sc.nextInt();
		int days = 0;
		
		switch(month) {
		
		case 1:  case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31; break;
		case 4:  case 6: case 9: case 11:
			days = 30; break;
		case 2:
			days = 28; break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		
		System.out.println(month + "월은 " + days + "일 까지 입니다.");
	}

}
