package cooperation;

public class Bus {
	public int busNumber;
	public int passengerCount;
	public int money;
	
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int price) {
		money += price;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d원 입니다.\n", busNumber,passengerCount,money);
	}
}
