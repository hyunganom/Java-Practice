package day07;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		/*int a=2;
		if(a>3) {
			System.out.println("a�� 3���� Ů�ϴ�");//���ǹ��ȿ� ����� �����̹Ƿ� ������� �ʴ´� �׷��� �ۿ��ִ°� ����.
		}
		System.out.println("�˻簡 �������ϴ�.");
		
		
		int age=15;
		if(age>19) {
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ���ҵ˴ϴ�.");
		}
		else{
			System.out.println("�����̾ƴմϴ�.");
			System.out.println("û�ҳ�̸� ����� ���ҵ˴ϴ�.");
		}
		System.out.println("��������");
		
		int age;
		Scanner input= new Scanner(System.in);
		System.out.println("���� : ");
		age = input.nextInt();
		
		if(age>19) {
			System.out.println("�����Դϴ�.");
		}
		else if(age>13) {
			System.out.println("û�ҳ��Դϴ�.");
		}
		else if(age>8) {
			System.out.println("����Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("���̿��°� ����� �����ϼ���.");
		*/
		String id,pass;
		Scanner sc =new Scanner(System.in);
		System.out.println("���̵� �Է��� �ֽʽÿ�.");
		id = sc.nextLine();

		
		if(id.equals("java")) {
			System.out.println("���̵� ��ġ");
			System.out.println("��й�ȣ�� �Է����ּ���.");
			pass = sc.nextLine();
			if(pass.equals("123")) {
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
}
