package day28;

public class Annonymous3 {

	public static void main(String[] args) {
		Inter1 it1 = new Inter1() {
			
			@Override
			public void f1() {
				System.out.println("inter imple f1()");
			}
		};
		it1.f1();
		
		Abstract ab = new Abstract() {
			
			@Override
			void f2() {
				System.out.println("Abstract extend f2()");
			}
		};
		ab.f2();
		
		
	}

}

interface Inter1{
	void f1();
}

class Inter1Imp implements Inter1{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Abstract{
	abstract void f2();
}



