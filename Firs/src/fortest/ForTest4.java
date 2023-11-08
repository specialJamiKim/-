package fortest;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i =0;
		for(i = 1; i<=100; i++)
		{
			sum +=i;
			if(sum>=55)
				break;

		}

		System.out.println(sum + " " + i);

	}

}