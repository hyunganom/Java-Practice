package day07;

public class If_sentence {

	public static void main(String[] args) {
	/*제어문 정의 : 프로그램의 흐름을 제어하는 문법
	조건문 : 정해진 조건에 따라 흐름을 제어하는 문법
	반복문 : 정해진 조건에 따라 흐름을 반복하는 문법
	*/
	int  a = 2;//조건이 참이아니라서 안에 명령문이 인식x
	if(a>3) {
			System.out.println("a는 3보다 큽니다.");
			}
	System.out.println("검사가 끝났습니다.");
	}
}