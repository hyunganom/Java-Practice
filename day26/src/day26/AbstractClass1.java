package day26;

public class AbstractClass1 {

	public static void main(String[] args) {
		Pokemon pokemon = new Pikachu();
		System.out.println("이 포켓몬은 :"+pokemon.getname());
		pokemon.attack();
		pokemon.sound();
		
		
		pokemon = new Squirle();
		System.out.println("이 포켓몬은 :"+pokemon.getname());
		pokemon.attack();
		pokemon.sound();
		
		//객체의 다형성
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
		this.name="피카츄";
	}
	@Override
	void attack() {
		System.out.println("전기 공격");
	}

	@Override
	void sound() {
		System.out.println("피카피카!");
	}}
class Squirle extends Pokemon{
	Squirle(){
		this.name="꼬부기";
	}
	@Override
	void attack() {
		System.out.println("물대포");
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북!");
	}}