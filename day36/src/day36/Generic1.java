package day36;

public class Generic1 {

	public static void main(String[] args) {
		Value v = new Value();
		v.<Integer>TypeSearch(3);
		v.TypeSearch(3.14);
		v.TypeSearch(3.14f);
		v.TypeSearch('a');
		v.TypeSearch("hello");
		v.TypeSearch(true);
	}

}
class Value{
	public <T> void TypeSearch(T x) {//x에 뭐가들어올지모름
		//그래서 제네릭사용해서 일단 x로 받아둠
		if(x instanceof Integer) {
			System.out.println(x+"는 정수입니다.");
		}
		else if(x instanceof Double|| x instanceof Float) {
			System.out.println(x+"는 실수입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"는 문자형입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"는 논리형입니다.");
		}
	}
	
	
}