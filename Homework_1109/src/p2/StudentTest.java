package p2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany hyundai = CardCompany.getCardCompany(); //유일객체 생성
		
		Student kim = hyundai.createStudent("kim");
		kim.showInfo();
		
		Student lee = hyundai.createStudent("lee");
		lee.showInfo();
		
	}

}
