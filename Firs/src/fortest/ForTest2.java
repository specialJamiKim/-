package fortest;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i = 1; i <=10; i++) { for(int j = 1 ; j<=5;j++) {
		 * System.out.println("j = "+j); } System.out.println("i="+i);
		 * System.out.println("------------------------------"); }
		 */

		for (int i = 1; i < 10; i++) {
			//System.out.println("------------------------------------------------------------------------------------------------------------------------");
			for (int j = 2; j < 10; j++) {
				System.out.printf("| %1d * %1d = %2d |", j, i, (i * j));
			}
			System.out.println();
		}
		
		//System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}

}
