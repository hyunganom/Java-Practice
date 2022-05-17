package day31;

public class StringEx1 {

	public static void main(String[] args) {
		
		//concat<< 붙여쓰기
		String str="hello";
		System.out.println(str.concat(" world!"));
		//substring(시작위치,끝위치):시작위치~끝위치전까지 가져오기
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(3));
		System.out.println(str.length());
		
		//charAt(인덱스), indexOf(문자열),equals(문자열)
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("o"));
		System.out.println(str.equals("hello"));
		
	}

}
