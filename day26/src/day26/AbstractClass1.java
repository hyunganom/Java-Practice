package day26;

public class AbstractClass1 {

	public static void main(String[] args) {
		Pokemon pokemon = new Pikachu();
		System.out.println("�� ���ϸ��� :"+pokemon.getname());
		pokemon.attack();
		pokemon.sound();
		
		
		pokemon = new Squirle();
		System.out.println("�� ���ϸ��� :"+pokemon.getname());
		pokemon.attack();
		pokemon.sound();
		
		//��ü�� ������
	}

}

abstract class Pokemon{
	String name;
	abstract void attack();
	abstract void sound();
	public String getname() {
		return this.name;
	}
	
}
class Pikachu extends Pokemon{
	Pikachu(){
		this.name="��ī��";
	}
	@Override
	void attack() {
		System.out.println("���� ����");
	}

	@Override
	void sound() {
		System.out.println("��ī��ī!");
	}}
class Squirle extends Pokemon{
	Squirle(){
		this.name="���α�";
	}
	@Override
	void attack() {
		System.out.println("������");
	}

	@Override
	void sound() {
		System.out.println("���ϲ���!");
	}}