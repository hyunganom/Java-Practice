package day22;

public class AnimalObject {

	public static void main(String[] args) {
		
		Animal ar[]= new Animal[3];
		for(int i=0;i<3;i++) {
			ar[i]=new Animal();
		}
		ar[0].name="����";
		ar[0].kind="�����";
		ar[0].age=1;
		
		ar[1].name="����";
		ar[1].kind="������";
		ar[1].age=1;
		
		ar[2].name="����";
		ar[2].kind="�����";
		ar[2].age=1;
		
		for(int i=0;i<3;i++) {
			ar[i].info();
		}
		
	}

}
class Animal{
	String kind;
	String name;
	int age;
	void info() {
		System.out.println("kind :"+kind);
		System.out.println("name :"+name);
		System.out.println("age :"+age);
	}
}