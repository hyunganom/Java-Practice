package day07;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args)
	{
		String id, password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력해주세요 : ");
		id=input.nextLine();//라인을 쓰는이유 : 띄워쓰기 까지 입력받기
		
		if(id.equals("java"))
		{
			System.out.println("id 일치!");
			System.out.print("비밀번호를 입력해 주세요:");
			password=input.nextLine();
			if
			(password.equals("abc123"))
				//(password=="123")<< 이거 equlas랑 ==랑 은 다른데 다른 유튜브나 구글해서 찾아보기
			{
				System.out.println("일치!");
				System.out.println("로그인 성공!");	
			}
			else {
				System.out.println("패스워드 불일치");
			}
		}
		
		else 
		{
			System.out.println("아이디 불일치");
		}
		
		input.close();
	}

}
