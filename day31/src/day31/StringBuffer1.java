package day31;

public class StringBuffer1 {

	public static void main(String[] args) {
		String str="test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);
		
	}

}
