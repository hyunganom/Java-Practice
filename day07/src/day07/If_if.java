package day07;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args)
	{
		String id, password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̵� �Է����ּ��� : ");
		id=input.nextLine();//������ �������� : ������� ���� �Է¹ޱ�
		
		if(id.equals("java"))
		{
			System.out.println("id ��ġ!");
			System.out.print("��й�ȣ�� �Է��� �ּ���:");
			password=input.nextLine();
			if
			(password.equals("abc123"))
				//(password=="123")<< �̰� equlas�� ==�� �� �ٸ��� �ٸ� ��Ʃ�곪 �����ؼ� ã�ƺ���
			{
				System.out.println("��ġ!");
				System.out.println("�α��� ����!");	
			}
			else {
				System.out.println("�н����� ����ġ");
			}
		}
		
		else 
		{
			System.out.println("���̵� ����ġ");
		}
		
		input.close();
	}

}
