package example.variable;

import java.util.Scanner;

public class Variable {

	public void initVariable() {
		// ���� ����� ���ÿ� �ʱ�ȭ

		// ���� : 1byte
		// 2�ܾ� �̻��� ������ ��Ÿ�� ǥ���
		boolean isTrue = true;
		boolean isFalse = false;

		// ������ : 2byte
		char ch = 'a'; // �ϳ��� ���ڸ� ���԰���

		String str = "�ȳ��ϼ���";

		byte bnum = 1; // 1byte
		short snum = 2;// 2byte
		int inum = 4; // 4byte
		long lnum = 8L; // 8byte

		float fnum = 4.0f; // 4byte
		double dnum = 8.0;// 8byte

		System.out.println("isTrue�� �� : "+isTrue);
		System.out.println("isFalse�� �� : "+isFalse);
		System.out.println("ch�� �� : "+ch);
		System.out.println("str�� �� : "+str);
		System.out.println("bnum�� �� : "+bnum);
		System.out.println("snum�� �� : "+snum);
		System.out.println("inum�� �� : "+inum);
		System.out.println("lnum�� �� : "+lnum);
		System.out.println("fnum�� �� : "+fnum);
		System.out.println("dnum�� �� : "+dnum);

	}
	public void changeValue() {
		//������ ���� �׽�Ʈ
		String name;
		char gender;
		int age;
		double height;
		
		name = "�迵��";
		gender = 'F';
		age =20;
		height = 171.5;
		
		System.out.println(name+"���� ��������");
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		System.out.println("height : "+height);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		gender = sc.next().charAt(0);//���ڸ� �о���� �޼ҵ�� �������� �ʱ� ����
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		
		System.out.println(name+"���� ��������");
		System.out.println("gender : "+gender);
		System.out.println("age : "+age);
		System.out.println("height : "+height);
		
	}
	
	
}
