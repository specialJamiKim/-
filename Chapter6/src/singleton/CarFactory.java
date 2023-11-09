package singleton;

public class CarFactory {
	private int carNum; //차 고유 번호
	private static CarFactory instance = new CarFactory();
	
	//생성자도 private선언을 해, 다른 곳에서 생성 못하도록 막아둠
	private CarFactory(){
		carNum = 10001;
	}
	
	//static변수를 사용했으니 메서드도 static처리
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public int getCarNum() {
		
		return carNum;
	}
	

	public Car createCar() {
		Car c = new Car(carNum);
		carNum++;
		return c;
	}
}
