package solve_1;

import java.util.Scanner;

public class No_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요>>");
		int floor = sc.nextInt();
		int floorHeight = 5;
		int result = floor * floorHeight;
		
		System.out.println(result+"m 입니다.");
		
	}

}
