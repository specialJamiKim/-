package fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 윤년확인하기 프로그램
		// 4로 나누어 떨어지는 연도는 윤년
		// 100으로 나누어 떨어지는 년도는윤년 x
		// 400으로 나누어 떨어지는 년도는 윤년

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			
			int year = Integer.parseInt(br.readLine());

			if (year == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0))
				System.out.println(year + "년은 윤년입니다.");
			else
				System.out.println(year + "년은 윤년이 아닙니다.");

		}
		
		br.close();

	}

}