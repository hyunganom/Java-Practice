package OOP2;

public class Inheritance2 {

	public static void main(String[] args) {
		smartTv stv = new smartTv();
		stv.channel = 10;		//���� Ŭ�����κ��� ��ӹ��� ���
		stv.channeUp();			//���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(stv.channel);
		stv.displayCatiom("Hello, world");
		stv.caption = true;		//ĸ�� �ڸ��� Ų��.
		stv.displayCatiom("Hello, world");
	}

}
class Tv{
	boolean power;	//���� (on/off)
	int channel;	//ä��
	
	void power() {power =! power;}
	void channeUp() {++channel;}
	void channeDown() {--channel;}
}

class smartTv extends Tv{	//smartTv�� tv�� ĸ��(�ڸ�)�� �����ִ� ����� ����
	boolean caption;	//ĸ�ǻ���(on/off)
	void displayCatiom(String text) {
		if(caption) {	//ĸ�ǻ��°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	}
}