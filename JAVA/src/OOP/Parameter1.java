package OOP;

public class Parameter1 {
	public static void main(String[] args) {
	Date d = new Date();
	d.x =10;
	System.out.println("main() : x = "+d.x);
	change(d.x);
	System.out.println("After change(d.x)");
	System.out.println("main() : x = "+d.x);
	
	}
	static void change(int x) {//기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
class Date{int x;}
//기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
//참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.