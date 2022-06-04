package OOP;

public class Varible_Type {
	int iv; 		//인스턴스 변수
	static int cv;	// 클래스 변수(static변수, 공유변수)
	
	void method() {
		int lv=0;	//지역변수
	}
}
//영역 1: 클래스영역  2:메서드 영역
//클래스 영역에서는 선언문만 가능 예를들어)y=x+3이라던가 system.out.println 등등 이런건 못들어감
//선언문에는 순서는 상관없음
 //객체는 iv변수들 묶음이다.