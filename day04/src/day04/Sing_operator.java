package day04;

public class Sing_operator {

	public static void main(String[] args) {
		int a= 1;
		System.out.println(a);
		
		a++;
		System.out.println(a);//이떄 a = 2
		System.out.println(++a);//a의 값 1증가, 전위형 : 증가가 먼저 : 3
		System.out.println(a++);//나중에 출력은 3인데 또 확인해보면 4임 밑에줄

		System.out.println(a);
	}

}
