package cooperation;

public class Subway {
	public int subNumber;
	public int passengerCount;
	public int money;
	
	
	
	public Subway(int subNumber) {
		this.subNumber = subNumber;
		passengerCount++;
	}
	public void take(int price) {
		money += price;
	}
	
	public void showInfo() {
		System.out.printf("지하철 %d번의 승객은 %d명이고, 수입은 %d원 입니다.\n", subNumber,passengerCount,money);
	}
}
