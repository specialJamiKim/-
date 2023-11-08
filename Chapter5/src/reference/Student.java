package reference;

class Subject{
	int subjectNum;
	String subjectTitle;
	String teacherName;
	int score;
	
	public int getSubjectNum() {
		return subjectNum;
	}

	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}

	public String getSubjectTitle() {
		return subjectTitle;
	}

	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	Subject(){
		this(1,"미정","미정",0);
	}
	
	Subject(int subjectNum, String subjectTitle, String teacherName, int score){
		this.subjectNum = subjectNum;
		this.subjectTitle = subjectTitle;
		this.teacherName = teacherName;
		this.score = score;
	}
	
	public String toString() {
		return "번호 : " + subjectNum + ", 과목명 : " + subjectTitle+ ", 선생님이름 : " + teacherName+ ", 점수 : " + score;
	}
}


public class Student {
	int studentID;
	Subject korea = new Subject();

	
	public static void main(String args[]) {
		Subject sj = new Subject();
		System.out.println(sj.toString());
		sj.setScore(100);
		System.out.println(sj.toString());
	}
}
