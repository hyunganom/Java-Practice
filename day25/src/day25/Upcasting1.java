package day25;

public class Upcasting1 {

	public static void main(String[] args) {
		Student st1=new Student("���浿", 15, "����", 1);
		st1.info();
		st1.study();
		//��ĳ����
		Human h1=new Student("���浿", 15, "�����ϱ�", 3);
		h1.info(); // �θ�Ŭ�����ε� �ڽ�Ŭ�����ȿ� �г���� ����ؼ� ���� : ��ĳ����
		//h1.study();
		//System.out.println(h1.grade);
		
	}

}
class Human{
	String name;
	int age;
	String hobby;
	public Human(String name, int age, String hobby) {//�Ű����� ������
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		//�Ű����� ���� ����
		//��Ŭ��-Source-Generate Constructor Using Fields
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}
	
}
class Student extends Human{
	int grade;
	public Student(String name, int age, String hobby,int grade) {
		super(name, age, hobby);
		this.grade=grade;
	}
	void info(){//�������̵�
		super.info();
		System.out.println("grade:"+grade);
	}
	void study() {
		System.out.println("�����ϱ�");
	}
}