package day21;

public class Class_practice3 {

	public static void main(String[] args) {
		System.out.println(Car.wheel);
		
		Car mycar1=new Car();
		System.out.println(mycar1.speed);
		
		Car mycar2=new Car();
		
		System.out.println("���� ��");
		System.out.println("mycar1.speed:"+mycar1.speed);
		System.out.println("mycar2.speed:"+mycar2.speed);
		System.out.println("mycar1.wheel:"+mycar1.wheel);
		System.out.println("mycar2.wheel:"+mycar2.wheel);
		
		mycar2.speed=100;//speed�� �ν��Ͻ������⶧���� 1, 2���� ���.
		
		mycar2.wheel=5;	//1,2 �Ѵ� 5�� ����ȴ�.
						//Ŭ���� ������ ��ü������ ����(��� �����Ѵ�.)
						//�ν��Ͻ� ������ �������� ����(���������Ѱ��� �����ִ�.)
		
		//Ŭ���������� �ν��Ͻ� ������ ���̴�.
		System.out.println("���� ��");
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