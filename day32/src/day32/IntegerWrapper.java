package day32;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer ii=30;//auto boxing
		//Integer->int Integer객체를 int형으로 바꾸기
		System.out.println(ii.intValue());
		//Integer->double
		System.out.println(ii.doubleValue());
		//Integer->float
		System.out.println(ii.floatValue());
		//Integer->String
		System.out.println(ii.toString());
		
	}

}
