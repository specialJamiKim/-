package access;

public class Student{
	//접근 제어자 public, private, protected, default
	public int studentID; // 인스턴스 생성시, 어디서든 사용가능
	private String studentName; // 클래스 내에서만 사용가능
	int score; // 디폴트는 같은 패키지 안에서만 사용가능
	protected String majorCode; // 상속 손클래스에서 사용가능 + 같은 패키지 사용가능
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	
	
}

