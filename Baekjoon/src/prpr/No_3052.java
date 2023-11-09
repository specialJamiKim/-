package prpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_3052 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 10;
		boolean [] arr = new boolean[42];
		int count = 0; // 다른 값 카운트
		
		for(int i = 0 ; i < N  ; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
			
		}

		for(boolean value : arr) {
			if(value)
				count++;
		}

		System.out.println(count);
	}
}
