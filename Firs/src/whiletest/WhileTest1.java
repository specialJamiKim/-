package whiletest;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1;
		int sum2 = 0;
		
		do
		{
			sum2+=number;
			number++;
			
		}while(number<=10);
		
		System.out.println(sum2);
	}
}
