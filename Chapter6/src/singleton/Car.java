package singleton;

public class Car {
	int carNum;//차번호
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	Car(int carNum){
		this.carNum = carNum; 
	}
}
