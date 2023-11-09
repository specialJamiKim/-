package cooperation;

public class Taxi {
	public int taxiNumber;
	public int passengerCount;
	public int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int price) {
		money += price;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("택시 %d번의 승객은 %d명이고, 수입은 %d원 입니다.\n", taxiNumber,passengerCount,money);
	}
}
