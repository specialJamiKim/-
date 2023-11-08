package classTest;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person();
		kim.name = "김유신";

		Person lee = new Person();
		lee.name = "이순신";
		
		Person park = new Person("박세리",40,160,'f',false);
		
		System.out.println(kim.toString());
		System.out.println(lee.toString());
		System.out.println(park.toString());
		
	}

}
