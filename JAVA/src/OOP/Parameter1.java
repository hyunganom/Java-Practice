package OOP;

public class Parameter1 {
	public static void main(String[] args) {
	Date d = new Date();
	d.x =10;
	System.out.println("main() : x = "+d.x);
	change(d.x);
	System.out.println("After change(d.x)");
	System.out.println("main() : x = "+d.x);
	
	}
	static void change(int x) {//�⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
class Date{int x;}
//�⺻�� �Ű����� - ������ ���� �б⸸ �� �� �ִ�.(read only)
//������ �Ű����� - ������ ���� �а� ������ �� �ִ�.