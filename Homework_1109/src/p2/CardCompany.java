package p2;

public class CardCompany {
	private int cardNum = 10000;
	private static CardCompany instance = new CardCompany();
	
	public int getCardNum() {
		return cardNum;
	}

	public static CardCompany getCardCompany() {
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Student createStudent() {
		Student s = new Student(cardNum++);
		return s;
	}
}
