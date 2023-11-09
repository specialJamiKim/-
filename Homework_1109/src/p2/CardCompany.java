package p2;

public class CardCompany {
	private int cardNum = 10000;
	private static CardCompany instance = new CardCompany(); //어디에서 사용하더라도 얘만 쓰게하려고 getCardCompany() 함수가 존재함
	
	public int getCardNum() {
		return cardNum;
	}

	private CardCompany() {}
	
	public static CardCompany getCardCompany() {
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Student createStudent(String name) {
		Student s = new Student(name, cardNum++);
		return s;
	}
}
