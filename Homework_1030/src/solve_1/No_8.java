package solve_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("커피 주문하세요>>");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		String coffee = st.nextToken();
		int inputNum = Integer.parseInt(st.nextToken());
		int result = 0;
		System.out.println("========= if문사용 =========");

		if (coffee.equals("에스프레소")) {
			result = 2000 * inputNum;
		} else if (coffee.equals("아메리카노")) {
			result = 2500 * inputNum;
		} else if (coffee.equals("카푸치노")) {
			result = 3000 * inputNum;

		} else if (coffee.equals("카페라떼")) {
			result = 3500 * inputNum;
		}
		
		System.out.println(result + "원입니다.");

		System.out.println("========= switch문사용 =========");

		switch (coffee) {
		case "에스프레소": {
			result = 2000 * inputNum;
			break;
		}
		case "아메리카노": {
			result = 2500 * inputNum;
			break;
		}
		case "카푸치노": {
			result = 3000 * inputNum;
			break;
		}
		case "카페라떼": {
			result = 3500 * inputNum;
			break;
		}
		}
		
		System.out.println(result + "원입니다.");


	}

}
