package hello;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입장료 계산 프로그램 만들기
		// 나이를 기준으로 8살이하는 1,000원
		// 14살 이하는 2,000원
		// 20살 이하는2,500원
		// 그 외, 4,000원
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int a = sc.nextInt();
		
		if(a>20)
			System.out.println("4,000원입니다.");
		else if(a>14)
			System.out.println("2,500원입니다.");
		else if(a>8)
			System.out.println("2,000원입니다.");
		else
			System.out.println("1,000원입니다.");
		
	}

}
