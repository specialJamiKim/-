package p1;

public class Cong {
	private int lattePrice;// 라떼가격
	private int saleCount; // 메뉴 판매 횟수
	private int money;

	public int getAmericanoPrice() {
		return lattePrice;
	}

	public void setAmericanoPrice(int americanoPrice) {
		this.lattePrice = americanoPrice;
	}

	public int getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	Cong() {
		this(4500, 0, 0);
	}

	Cong(int americanoPrice, int saleCount, int money) {
		this.lattePrice = americanoPrice;
		this.saleCount = saleCount;
		this.money = money;
	}

	public void sale(int saleCount) {
		this.saleCount += saleCount;
		money += saleCount * lattePrice;
	}

	public void viewInfo() {
		System.out.printf("라떼 판매 : %d잔, 총 판매금액 : %d\n", saleCount, money);
	}

}
