package OOP;

public class Constructor_this {

}
//������ this()
//�����ڿ��� �ٸ� ������ ȣ���� �� ���
//�ٸ� ������ ȣ��� ù �ٿ����� ��밡��

class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this(color,"auto",4);
	}
}