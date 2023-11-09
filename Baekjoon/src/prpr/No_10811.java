package prpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_10811 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");


		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = (i + 1);

		// M은 반복횟수
		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;

			while(i<j) {
				int tmp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = tmp;
			}

				
			}
		for(int a : arr)
			System.out.print(a + " ");
	}
}
