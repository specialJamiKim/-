package p1;

public class Cafe {

	public static void main(String[] args) {
		Starbucks kim = new Starbucks();
		kim.sale(5); //5잔 판매
		
		Cong lee = new Cong();
		lee.sale(3); //3잔 판매
		
		//출력
		kim.viewInfo();
		lee.viewInfo();
	}
}
