package day31;

public class StringEx1 {

	public static void main(String[] args) {
		
		//concat<< �ٿ�����
		String str="hello";
		System.out.println(str.concat(" world!"));
		//substring(������ġ,����ġ):������ġ~����ġ������ ��������
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(3));
		System.out.println(str.length());
		
		//charAt(�ε���), indexOf(���ڿ�),equals(���ڿ�)
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("o"));
		System.out.println(str.equals("hello"));
		
	}

}
