package prpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1546 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// 과목 개수
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		double max = 0;
		double result = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}

		max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		
		//계산문제
		for (int i = 0; i < arr.length; i++) {
			result += (arr[i]/max)*100;
		}
		
		System.out.print(result / arr.length);

	}
}