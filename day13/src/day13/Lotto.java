package day13;

import java.lang.reflect.Array;
import java.util.*;

public class Lotto {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int lotto[] = new int[6];
		int user[] = new int[6];
		
		int bonus;
		int bonusUser;
		int count=0;
		
		//�ζ� �迭�� 6���� �������� ����
		for(int i=0; i<6; i++) {
			lotto[i]=rd.nextInt(45)+1;
		}
		bonus=rd.nextInt(45)+1;
		
		System.out.println(Arrays.toString(lotto)+bonus);
		
		//����ڿ��� 6���� ���� �Է�
		System.out.print("6�� �����Է� :");
		for(int i=0; i<6;i++) {
			user[i]=sc.nextInt();
		}
		System.out.print("���ʽ��� �Է� :");
		bonusUser=sc.nextInt();
		
		System.out.println(Arrays.toString(user)+",bonus:"+bonusUser);
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(user[i]==lotto[j]) {
					count++;
				}
			}
		}
		
		
		
		System.out.println("���� ���� ���� :"+count);
		
		
		if(count==6) {
			System.out.println("1��");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("2��");
			}
			else {
				System.out.println("3��");
			}
		}
		else if(count==4) {
			System.out.println("4��");
		}
		else {
		System.out.println("5��");
			}
		
	

  }
	}
