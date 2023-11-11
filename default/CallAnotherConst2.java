class Person2{
	String name;
	int age;
	
	Person2(){
		/*
		 * Person(String, int) 생성자 호출하면서 
		 * 기본 값으로 "이름 없음"과 1 전달 
		 */
		this("이름 없음", 1); 
	}
	
	Person2(String name, int age){
		// 이름과 나이를 매개변수로 받아 객체 속성 초기화 
		this.name = name;
		this.age = age;
	}
	
	Person2 returnItself() {
		return this; // this 반환 
	}
}
public class CallAnotherConst2 {
	public static void main(String[] args) {
		Person2 noName = new Person2();
		System.out.println(noName.name); // 이름 없음 
		System.out.println(noName.age); // 1
		
		Person2 p = noName.returnItself(); // this 값을 클래스 변수에 대입 
		System.out.println(p); // noName.returnSelf()의 반환 값 출력 
		System.out.println(noName); // 참조 변수 출력 
	}
}

