package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1= new Bclass("���浿");
		System.out.println(b1.name);
		Bclass b2=new Bclass();
		System.out.println(b2);
	}

}
class Bclass{
	String name;
	Bclass(){}
	Bclass (String name){//�Ű����� ������
		System.out.println("Bclass�� �Ű����� ������()");
		this.name=name;
		
		}
	}
