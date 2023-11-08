package solve_2;

public class No_7 {

	public static void main(String[] args) {

		int N = 4;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j<=N-i; j++)
				System.out.print(" ");
			for(int k = 1; k<=2*i-1;k++)
				System.out.print('*');
			
			System.out.println();
		}
		
		for (int i = N-1; i > 0; i--) {

			// 공백출력
			for (int k = N; k > i; k--)
				System.out.print(" ");
			// 별출력
			for (int j = (i * 2) - 1; j > 0; j--)
				System.out.print("*");

			System.out.println();

		}
		
		
	

	}

}
