package day28;

public class Inner4 {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("outerclass의 a의 값:"+oc.a);
		System.out.println("outerclass의 a의 값:"+OuterClass.b);
		System.out.println("===inner 클래스 접근하기===");
		
		OuterClass oc2 =new OuterClass();
		OuterClass.Inner i = oc.new Inner();
		i.innerMethod();
		System.out.println("Inner의 c의 값 :"+i.c);
		OuterClass.staticinner si = new OuterClass. staticinner();
		System.out.println("staticinner의 d의 값 : "+si.d);
		
		//si.staticMethod();-> 객체를 사용하지 않고, 클래스명을 사용해서 호출가능
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