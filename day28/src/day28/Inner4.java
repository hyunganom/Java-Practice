package day28;

public class Inner4 {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("outerclass�� a�� ��:"+oc.a);
		System.out.println("outerclass�� a�� ��:"+OuterClass.b);
		System.out.println("===inner Ŭ���� �����ϱ�===");
		
		OuterClass oc2 =new OuterClass();
		OuterClass.Inner i = oc.new Inner();
		i.innerMethod();
		System.out.println("Inner�� c�� �� :"+i.c);
		OuterClass.staticinner si = new OuterClass. staticinner();
		System.out.println("staticinner�� d�� �� : "+si.d);
		
		//si.staticMethod();-> ��ü�� ������� �ʰ�, Ŭ�������� ����ؼ� ȣ�Ⱑ��
		OuterClass.staticinner.staticMethod();
	}

}
class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		void  innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class staticinner{
		int d=6;
		static int stat=10;
		static void staticMethod() {
			System.out.println("<static inner>");
		}
	}
}