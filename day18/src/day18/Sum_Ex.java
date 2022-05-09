package day18;

public class Sum_Ex {

	public static void main(String[] args) {
		sum(10,20);
		sum(1.24, 3.14);
	}
	static void sum(int x, int y) {
		System.out.println(x+y);
	}
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	static void sum(int x, int y , int z) {
		System.out.println(x+y+z);
	}
}
