package solve_2;

public class No_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(j>i)
					break;
				else
					System.out.printf("%2d * %2d = %d ", i, j, (i * j));
			}
			System.out.println();
		}
	}

}
