package day26;

public class ShapMain {

	public static void main(String[] args) {
		Shape shape[]=new Shape[3];
		//부모의 객체배열 요소에 자식 값 넣기=> 업캐스팅
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
		System.out.println("사각형을 그리다.");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리다.");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("선을 그리다.");
	}
}