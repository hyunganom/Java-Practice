package OOP;

public class Parameter3 {

	public static void main(String[] args) {
		Date3 d = new Date3();
		d.x = 10;
		
		Date3 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);
	}
	static Date3 copy(Date3 d) {
		Date3 tmp = new Date3();	//���ο� ��ü�� �����Ѵ�.
			
		tmp.x = d.x;				// d.x�� ���� tmp.x�� �����Ѵ�.
		
		return tmp;					//������ ��ü�� �ּҸ� ��ȯ�Ѵ�.
	}
}
class Date3{int x;}