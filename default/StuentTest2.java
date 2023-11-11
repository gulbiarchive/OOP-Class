
public class StuentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student(); // 첫 번째 학생 생성 
		student1.studentName = "김철수";

		Student student2 = new Student(); // 두 번째 학생 생성 
		student2.studentName = "이철수";
		
		// 참조 변수 값 출력 
		System.out.println(student1);
		System.out.println(student2);
	}

}

