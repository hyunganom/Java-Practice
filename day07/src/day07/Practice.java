package day07;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		/*int a=2;
		if(a>3) {
			System.out.println("a는 3보다 큽니다");//조건문안에 결과가 거짓이므로 실행되지 않는다 그래서 밖에있는거 실행.
		}
		System.out.println("검사가 끝났습니다.");
		
		
		int age=15;
		if(age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 지불됩니다.");
		}
		else{
			System.out.println("성인이아닙니다.");
			System.out.println("청소년미만 요금이 지불됩니다.");
		}
		System.out.println("돈내세요");
		
		int age;
		Scanner input= new Scanner(System.in);
		System.out.println("나이 : ");
		age = input.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");
		}
		else if(age>13) {
			System.out.println("청소년입니다.");
		}
		else if(age>8) {
			System.out.println("어린이입니다.");
		}
		else {
			System.out.println("유아입니다.");
		}
		System.out.println("나이에맞게 요금을 지불하세요.");
		*/
		String id,pass;
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디를 입력해 주십시오.");
		id = sc.nextLine();

		
		if(id.equals("java")) {
			System.out.println("아이디 일치");
			System.out.println("비밀번호를 입력해주세요.");
			pass = sc.nextLine();
			if(pass.equals("123")) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
}
