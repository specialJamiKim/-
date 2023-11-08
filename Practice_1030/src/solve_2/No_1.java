package solve_2;

public class No_1 {
	public static void main(String args[]) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i % 2 == 0) {
					System.out.printf("%2d * %d = %d", i, j, (i * j));
				} else 
					continue;
			}
			System.out.println();
		}
	}
}
