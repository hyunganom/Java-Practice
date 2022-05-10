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
			System.out.print("이름 :");
			ar[i].name=sc.next();
			System.out.print("전화번호 :");
			ar[i].phone=sc.next();
			System.out.print("나이 :");
			ar[i].age=sc.nextInt();
			System.out.print("성별 :");
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
		System.out.println("이름 :"+name);
		System.out.println("전화번호 :"+phone);
		System.out.println("나이 :"+age);
		System.out.println("성별 :"+gender);
	}
}