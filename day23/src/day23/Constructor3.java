package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1= new Bclass("가길동");
		System.out.println(b1.name);
		Bclass b2=new Bclass();
		System.out.println(b2);
	}

}
class Bclass{
	String name;
	Bclass(){}
	Bclass (String name){//매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자()");
		this.name=name;
		
		}
	}
