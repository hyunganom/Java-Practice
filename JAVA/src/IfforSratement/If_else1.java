package IfforSratement;

import java.util.*;

public class If_else1 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ���>5: ");
		Scanner sc = new Scanner(System.in);
		int num=0;
		num = sc.nextInt();
		if(num>5) {
			System.out.println(num);
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ� 5�����Դϴ�.");
		}
	}

}
