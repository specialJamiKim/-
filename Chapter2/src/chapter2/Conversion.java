package chapter2;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//두개의 변수를 선언하여 10고 2.0을 대입한 후 두개의 값을 더한 결과를 정수로 출력해보세요.
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		
		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		
		System.out.println(a>b ? a : b);
		
	}

}
