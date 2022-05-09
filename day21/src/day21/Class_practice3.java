package day21;

public class Class_practice3 {

	public static void main(String[] args) {
		System.out.println(Car.wheel);
		
		Car mycar1=new Car();
		System.out.println(mycar1.speed);
		
		Car mycar2=new Car();
		
		System.out.println("변경 전");
		System.out.println("mycar1.speed:"+mycar1.speed);
		System.out.println("mycar2.speed:"+mycar2.speed);
		System.out.println("mycar1.wheel:"+mycar1.wheel);
		System.out.println("mycar2.wheel:"+mycar2.wheel);
		
		mycar2.speed=100;//speed는 인스턴스변수기때문에 1, 2따로 논다.
		
		mycar2.wheel=5;	//1,2 둘다 5로 변경된다.
						//클래스 변수는 전체적으로 관리(모두 공유한다.)
						//인스턴스 변수는 각각으로 관리(각각고유한값을 갖고있다.)
		
		//클래스변수와 인스턴스 변수의 차이다.
		System.out.println("변경 후");
		System.out.println("mycar1.speed:"+mycar1.speed);
		System.out.println("mycar2.speed:"+mycar2.speed);
		System.out.println("mycar1.wheel:"+mycar1.wheel);
		System.out.println("mycar2.wheel:"+mycar2.wheel);
	}

}
class Car{
	static int wheel=4;
	int speed;
}