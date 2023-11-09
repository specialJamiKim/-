package prpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_3003 {
	public static void main(String args[]) throws IOException {

		int[] arr = { 1, 1, 2, 2, 2, 8 }; // 킹 퀸 룩 비숍 나이트 폰 / 총 16개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (arr[i] == a) {
				sb.append(0 + " ");
				continue;

			} else {
				arr[i] -= a;
				sb.append(arr[i] + " ");
			}

		}

		System.out.println(sb);
	}

}
