package OOP;

public class Constructor2 {

	public static void main(String[] args) {
		Date_1 d1 = new Date_1();
		Date_2 d2 = new Date_2();
	}

}
class Date_1{
	int value;
	Date_1(){} //기본생성자 추가
}

class Date_2{
	int value;
	
	Date_2(int x){
		value=x;
	}

	Date_2() {}// 기본 생성자
}
