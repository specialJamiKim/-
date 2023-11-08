package solve_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학점을 입력하세요>>");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		String grade = st.nextToken();
		
		switch(grade) {
		case "A": case "B":
			System.out.println("Excellent"); break;
		case "C": case "D":
			System.out.println("Good"); break;
		case "F":
			System.out.println("Bye"); break;
		default:
			System.out.println("잘못된 학점입니다.");
		}
		
	}

}
