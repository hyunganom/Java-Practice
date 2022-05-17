package day31;

import java.util.StringTokenizer;

public class StringTokenizEx {

	public static void main(String[] args) {
		//문자열 생성
		String str="kim:010-1234-1234";
		String delim=":";
		StringTokenizer st = new StringTokenizer(str, delim);
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		
		
	}

}
