package solve_2;

public class No_5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=4; i++) {
			//공백출력
			for(int k = 3; k>i-1;k--)
				System.out.print(" ");
			
			//별출력
			for(int j = 0; j<2*i-1;j++)
				System.out.print('*');
			
			System.out.println();
		}
		
	}

}
