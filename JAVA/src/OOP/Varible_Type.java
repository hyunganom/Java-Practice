package OOP;

public class Varible_Type {
	int iv; 		//�ν��Ͻ� ����
	static int cv;	// Ŭ���� ����(static����, ��������)
	
	void method() {
		int lv=0;	//��������
	}
	public static void main(String[] args) {
		Card c = new Card(); //��ü����
		c.kind = "HEART";//��ü���
		c.number = 5;//��ü���
		
		Card.width = 200;//��ü��� �� ���⼭ ���� cv�� �տ� Ŭ������ ������
		Card.height = 300;//�ֳĸ� �տ� c.width�� ����ص��ǰ��� �ٵ� �տ� Ŭ������ ���̼�
	}
}
//���� 1: Ŭ��������  2:�޼��� ����
//Ŭ���� ���������� ���𹮸� ���� �������)y=x+3�̶���� system.out.println ��� �̷��� ����
//���𹮿��� ������ �������
 //��ü�� iv������ �����̴�.
//-----------------------------------------------
//�ڹ��� ���� ī�帣 ���÷�����
//ī�忡�� ���̳� ���ڴ� ���ϴϱ� �ν��Ͻ������� �ΰ�
//���̶� ���� �����Ǿ���ϴϱ� ����ƽ�� �༭ �����ǰ�
class Card{
	String kind;		//����
	int number;			//����
	
	static int width = 100;		//��
	static int height = 250;	//����	
}
