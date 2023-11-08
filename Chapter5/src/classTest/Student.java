package classTest;

public class Student {
	//객체를 만드는 바탕, 객체가 가지고 있는 변수나 메서드의 집합
	//멤버변수 : 객체가 가지고 있는 변수
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//생성자
	Student(){
		//this(studentID,studentName,grade,address);
	}
	
	Student(int studentID, String studentName, int grade, String address){
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
		this.address = address;
	}
	
	//객체가 할 수 있는 일 : 메서드
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
