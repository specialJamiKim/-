package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class  Backjoon_25304 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); //	총금액
		int N = Integer.parseInt(br.readLine()); // 개수

		int sum = 0;
		StringTokenizer st;
		
		for(int i = 0; i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sum += (a*b);
		}
		
		
		if(X==sum)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		br.close();
		
	}
	


}
