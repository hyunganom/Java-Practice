package OOP;

public class Return1 {
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return;//dan의 값이 아닌경우, 호출한 곳으로 그냥 되돌아 간다.
		}
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
		return;//반환 타입이 void일때만 생략가능. 컴파일러가 자동추가.
		
		}
}
	
	
//	int multiply(int x, int y) {
//		int result = x*y;
//		result result;
//   }
	

//return문 : 실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
//반환타입이 보이드가 아니면 반드시 return문 필요