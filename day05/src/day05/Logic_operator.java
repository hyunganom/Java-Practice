package day05;

public class Logic_operator {

	public static void main(String[] args) {
			boolean a=true;
			boolean b=false;
			boolean c=true;
			
			System.out.println(a&&b); //a���� b���� ��� ���϶��� ����� �� : and
			System.out.println(a&&c); //a���� c���� ��� ���϶��� ����� �� : and
			System.out.println((2<4)&&(4<5));
			
			System.out.println(a||b);//a Ȥ�� c�� true��� ����� true
			System.out.println(a||c);//a Ȥ�� c�� true��� ����� true
			
			System.out.println(!a);
	}

}
