package day23;

public class Constructor {

	public static void main(String[] args) {
		Aclass a= new Aclass();
		/*Aclass(클래스) 객체값을 담을수있는 a를 만들고
		  Aclass();생성자를 통해 객체값을 담는다.*/
		
		
	}

}

class Aclass{
	//기본생성자(dafault생성자)
	public Aclass() {
		System.out.println("Aclass 기본생성자");
	}
}