package day11;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {//true<<��ž������� ���ѹݺ��� �ϱ����Ͽ�
			System.out.print("�����Է� :");
			num=sc.nextInt();
			if(num==0) {
				System.out.println("���α׷� ����");
				break;//�극��ũ �̰žȾ��� �����Է� ��� Ƣ���
				
			}
			System.out.println("�Է°�:"+num);
		}
	}

}
