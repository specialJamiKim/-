package p1;

public class Starbucks {
	private int americanoPrice;//아메리카노가격
	private int saleCount; //메뉴 판매 횟수
	private int money; // 총 판매 금액
	

	public int getAmericanoPrice() {
		return americanoPrice;
	}

	public void setAmericanoPrice(int americanoPrice) {
		this.americanoPrice = americanoPrice;
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

	Starbucks(){
		this(4000,0,0);
	}
	
	Starbucks(int americanoPrice, int saleCount, int money){
		this.americanoPrice = americanoPrice;
		this.saleCount = saleCount;
		this.money = money;
	}
	
	public void sale(int saleCount) {
		this.saleCount+=saleCount;
		money += saleCount * americanoPrice;
	}
	
	public void viewInfo() {
		System.out.printf("스타벅스 아메리카노 판매 : %d잔 ==> 총 판매금액 : %d\n",saleCount,money);
	}

}
