package switchTest;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("층수를 입력하세요 ==> ");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1: 
			System.out.println(a +"층은 약국입니다."); break;
		case 2: 
			System.out.println(a +"층은 정형외과입니다."); break;
		case 3: 
			System.out.println(a +"층은 피부과입니다."); break;
		case 4: 
			System.out.println(a +"층은 치과입니다."); break;
		case 5: 
			System.out.println(a +"층은 헬스 클럽입니다."); break;
		default: 
			System.out.println(a +"층은 없습니다.");
		}
		
		sc.close();
		
	}

}
