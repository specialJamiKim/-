package statictest;

public class Student {
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public int studentCardId;
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public void showInfo() {
		System.out.println(serialNum + "," + studentName);
	}
	
	public Student() {
		studentID = serialNum;
		studentCardId = studentID + 100;
		serialNum++;	
	}
	/*public static void showInfo2() {
		System.out.println(serialNum + "," + studentName);
	}*/
}
