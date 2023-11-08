package classTest;

public class FunctionTest {

	// 1부터 파라미터로 받아온 값까지 더해주는 메서드

	int addMe(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++)
			sum += i;

		return sum;
	}
	
	int add(int x, int y)
	{
		return x+y;
	}
	
	int sub(int x, int y) {
		return x-y;
	}
	
	int mul(int x, int y) {
		return x*y;
	}
	
	int div(int x, int y) {
		return x/y;
	}

	public static void main(String[] args) {
		// System.out.println(FunctionTest.addMe(10));

		FunctionTest t = new FunctionTest();
		System.out.println(t.addMe(10));
		System.out.println(t.add(1, 2));
		System.out.println(t.sub(1, 2));
		System.out.println(t.mul(1, 2));
		System.out.println(t.div(1, 2));
	}

}
