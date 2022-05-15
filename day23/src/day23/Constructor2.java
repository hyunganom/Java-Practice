package day23;

public class Constructor2 {

	public static void main(String[] args) {
	cellphone mycellphone=new cellphone();
	System.out.println(mycellphone.model);
	}

}
class cellphone{
	String model="Galaxy 8";
	String color="Red";
	int capacity=60;
	
	cellphone() {
		System.out.println("model: "+model);
		System.out.println("color: "+color);
		System.out.println("capacity: "+capacity);
	}
}