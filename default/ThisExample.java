
class BirthDay{
	int day;
	int month;
	int year;
	
	// 태어난 연도 저장하는 메서드 
	public void setYEar(int year) {
		this.year = year; //
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
public class ThisExample {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYEar(2000);
		System.out.println(bDay);
		bDay.printThis();
	}

}

