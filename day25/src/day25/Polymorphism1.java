package day25;

public class Polymorphism1 {

	public static void main(String[] args) {
		
		A obj=new B();//�θ� ���� = �ڽİ� : ��ĳ����
		obj.methedA();
		//obj.methedB();<<�����߻�
	}

}
class A{
	void methedA() {
		System.out.println("methodA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}