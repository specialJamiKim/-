package mydate;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(2018,2,30);
		System.out.println(date1.isValid());
		
		MyDate date2 = new MyDate(2006,2,2);
		System.out.println(date2.isValid());
	}

}
