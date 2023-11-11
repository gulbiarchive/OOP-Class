
class Person{
	String name;
	int age;
	
	Person(){
		/*
		 * Person(String, int) 생성자 호출하면서 
		 * 기본 값으로 "이름 없음"과 1 전달 
		 */
		this("이름 없음", 1); 
	}
	
	Person(String name, int age){
		// 이름과 나이를 매개변수로 받아 객체 속성 초기화 
		this.name = name;
		this.age = age;
	}
}
public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name); // 이름 없음 
		System.out.println(noName.age); // 1
	}
}

