package solve_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("논리 연산을 입력하세요>>");
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String s1 = st.nextToken();
		String bool = st.nextToken();
		String s2 = st.nextToken();
		boolean result;
		br.close();

		switch (bool) {

		case "OR": case "or": {
			result = Boolean.parseBoolean(s1) || Boolean.parseBoolean(s2);
			System.out.println(result);
			break;
		}
		case "AND": case "and": {
			result = Boolean.parseBoolean(s1) && Boolean.parseBoolean(s2);
			System.out.println(result);
			break;
		}

		}
	}

}
