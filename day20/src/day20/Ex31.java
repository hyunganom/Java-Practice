package day20;

public class Ex31 {

	public static void main(String[] args) {
		Car mycar=new Car();
		System.out.println("시동 처움 초기화 : "+mycar.powerOn);
		System.out.println("차의 색상 초기화 : "+mycar.color);
		System.out.println("바퀴의 수 처움 초기화 : "+mycar.whell);
		System.out.println("속력의 초기화 : "+mycar.speed);
		System.out.println("와이퍼의 작동 초기화 : "+mycar.wiperOn);
		
		mycar.power();
		System.out.println("시동 메서드 출력: "+mycar.powerOn);
		
		mycar.power();
		System.out.println("시동 메서드 다시 동작: "+mycar.powerOn);
		
		mycar.color="black";
		System.out.println("현재 차의 색상:"+mycar.color);
	}

}
class Car{
	boolean powerOn;
	String color;
	int whell;
	int speed;
	boolean wiperOn;
	
	void power() {powerOn=!powerOn;}//true->false,false->true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiperOn() {wiperOn=!wiperOn;}
	
}