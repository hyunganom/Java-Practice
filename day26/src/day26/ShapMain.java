package day26;

public class ShapMain {

	public static void main(String[] args) {
		Shape shape[]=new Shape[3];
		//�θ��� ��ü�迭 ��ҿ� �ڽ� �� �ֱ�=> ��ĳ����
		shape [0] = new Rect();
		shape [1] = new Circle();
		shape [2] = new Line();
		
		for(int i=0;i<3;i++) {
			shape[i].draw();
		}
			
	}

}
abstract class Shape {
	abstract void draw();
	
}
class Rect extends Shape{
	void draw() {
		System.out.println("�簢���� �׸���.");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("���� �׸���.");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("���� �׸���.");
	}
}