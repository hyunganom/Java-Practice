package day22;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Userclass ar[]=new Userclass[4];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<4;i++) {
			ar[i]=new Userclass();
		}
		for(int i=0;i<4;i++) {
			System.out.print("�̸� :");
			ar[i].name=sc.next();
			System.out.print("��ȭ��ȣ :");
			ar[i].phone=sc.next();
			System.out.print("���� :");
			ar[i].age=sc.nextInt();
			System.out.print("���� :");
			ar[i].gender=sc.next();
		}
		for(int i=0;i<4;i++) {
			ar[i].info();
		}
		
		
		}
	}


class Userclass{
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("�̸� :"+name);
		System.out.println("��ȭ��ȣ :"+phone);
		System.out.println("���� :"+age);
		System.out.println("���� :"+gender);
	}
}