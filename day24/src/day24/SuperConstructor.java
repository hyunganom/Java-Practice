package day24;

public class SuperConstructor {

	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red", 300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}

}
class Car{
	int wheel;
	int speed;
	String color;
	//Car(){}
	Car(String color){
		this.color=color;
		//³»°¡ ¹Þ¾Æ¿À´Â Ä®¶ó´Â ¸â¹öÀÇ Ä®¶ó´Ù.
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color, int speedLimit){
		super(color);
		this.speedLimit=speedLimit;
	}
}