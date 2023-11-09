package singleton;

public class Company {
	private static Company instance = new Company();

	Company() {

	}

	public static Company getCompany() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}

	public void say() {
		System.out.println("hi, there");
	}
}
