package prpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_10813 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N]; // 입력값저장

		// 숫자 저장
		for (int i = 0; i < N; i++) {
			arr[i] = (i + 1);
		}

		// 변경반복횟수 M번
		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int tmp = 0;

			tmp = arr[i - 1];
			arr[i - 1] = arr[j - 1];
			arr[j - 1] = tmp;
		}
		br.close();

		for (int a : arr)
			System.out.print(a + " ");
	}
}