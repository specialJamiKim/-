package statictest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		System.out.println(lee.serialNum);
		
		Student kim = new Student();
		System.out.println(kim.serialNum);
		
		System.out.println(Student.serialNum);
	}

}
