package solve_2;

public class No_6 {

	public static void main(String[] args) {

		for (int i = 4; i > 0; i--) {

			// 공백출력
			for (int k = 4; k > i; k--)
				System.out.print(" ");
			// 별출력
			for (int j = (i * 2) - 1; j > 0; j--)
				System.out.print("*");

			System.out.println();

			// 공백출력
		}

	}

}
