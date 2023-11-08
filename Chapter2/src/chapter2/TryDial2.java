package chapter2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TryDial2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int inNum = s.nextInt();
		int[] arr = new int[inNum];
		double avg = 0.0;
		int max = 0;

		String st = s.next();
		StringTokenizer stk = new StringTokenizer(st, " ");

		// 초기화
		for (int i = 0; i < inNum; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}

		for (int arr2 : arr) {
			if (arr2 > max)
				max = arr2;
		}

		int aa = max * 100;
		for (int arr2 : arr) {
			arr2 /= aa;
			avg += arr2;
		}

		double result = avg / inNum;
		System.out.println(result);
	}

}
