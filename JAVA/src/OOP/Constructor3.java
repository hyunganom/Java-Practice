package OOP;

public class Constructor3 {

	public static void main(String[] args) {
		Car c = new Car("white", "auto", 4);
	}

}
class Car {
	String color;
	String gearType;
	int door;
	Car(){}
	Car(String c, String g, int d){ // �Ű������� �ִ� ������
		color = c;
		gearType = g;
		door = d;
	}
}

//���� ���θ޼��忡 ������ �����ϰ� ���� �� �� �ִ�.
//������
//Car c = new Car();
//c.color = "white";
//c.gearType = "auto";
//c.door = 4;
//�̷��� ����� ��
