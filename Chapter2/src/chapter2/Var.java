package chapter2;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		
		String inputString;
		Scanner s = new Scanner(System.in);
		
		int inputNum = s.nextInt();
		if(inputNum < 1 || inputNum > 11)
			System.exit(0);

		for(int i = 0; i<inputNum;i++) {
			inputString = s.next();
			String first = inputString.valueOf(inputString.charAt(0));
			String end = inputString.valueOf(inputString.charAt(inputString.length()-1));
			System.out.println(first + end);
		}
		
		
	}

}
