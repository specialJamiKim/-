package p1;

public class Cafe {

	public static void main(String[] args) {
		Starbucks kim = new Starbucks();
		kim.sale(5);
		
		Cong lee = new Cong();
		lee.sale(3);
		
		kim.viewInfo();
		lee.viewInfo();
	}
}
