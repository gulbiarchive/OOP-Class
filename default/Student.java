	
public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName(){
	return studentName;
	}

	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성 
		studentAhn.studentName = "이철수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
