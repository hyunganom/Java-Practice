package OOP2;

public class Overriding1 {
	public static void main(String[] args) {
//	Point3D p = new Point3D();
//	p.x = 3;
//	p.y = 5;
//	p.z = 7;
//	System.out.println(p.getLocation());
		
		
//	Point2 p2 = new Point2();
//	p2.x=2;
//	p2.y=3;
//	System.out.println(p2);
//	System.out.println(p2.toString());
		
	Point2 p3 = new Point2(3, 5);
	System.out.println(p3);
		
	}
}
//�������̵� : �����
//��ӹ޴� ������ �޼��带 �ڽſ� �°� �����ϴ� ��

//�������̵��� ����
//1.����ΰ� ���� Ŭ������ �޼���� ��ġ�ؾ� �Ѵ�.
//2. ���� �����ڸ� ���� Ŭ������ �޼��庸�� ���� ������ ������ �� ����.
//3.���ܴ� ���� Ŭ������ �޼��庸�� ���� ������ �� ����.

class Point{
	int x;
	int y;
	
	String getLocation() {
		return "x : "+x+", y : "+y;
	}
}

class Point3D extends Point{
	int z;
	
	String getLocation() {
		return "x : "+ x +", y : "+ y +", z : "+z;
	}
}

class Point2 extends Object{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "x:"+x+", y:"+y;
	}
}