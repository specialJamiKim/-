package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("김태룡",4,10000);
		Student s2 = new Student("토마스",3,10000);
		Student s3 = new Student("Edward",1,15000);
		
		Bus b = new Bus(179);
		Subway s = new Subway(1);
		Taxi t = new Taxi(4885);
		
		s1.takeBus(b);
		s1.takeSubway(s);
		s1.showInfo();
		b.showInfo();
		s.showInfo();
		System.out.println();
		
		s2.takeBus(b);
		s2.takeSubway(s);
		s2.showInfo();
		b.showInfo();
		s.showInfo();
		System.out.println();
		
		s3.takeTaxi(t);
		s3.showInfo();
		t.showInfo();
		
	}

}
