package fortest;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (count == 10) {
				System.out.println();
				count = 0;
			}
			if (i % 2 != 0) {
				System.out.printf("%3d ", i);
				count++;
			} else
				continue;
		}

	}

}