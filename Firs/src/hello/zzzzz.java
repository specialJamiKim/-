package hello;

import java.util.Scanner;

public class zzzzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학점부여하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 => ");
		int score = sc.nextInt();
		char grade = ' ';
		
		if(score >=90 && score <=100)
			grade = 'A';
		else if(score >=80)
			grade = 'B';
		else if(score >=70)
			grade = 'C';
		else if(score >=60)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
