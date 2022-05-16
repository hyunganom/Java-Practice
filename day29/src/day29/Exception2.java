package day29;

public class Exception2 {

	public static void main(String[] args) {
		try {
			int a[]= {2,0,0};
			int b=4;
			int c=b/a[2];//배열의 인덱스 [0],[1]
		}
		catch (ArithmeticException e) {
			System.out.println("산술 요류 발생");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("예외처리 공부중");
	}
		
	}


