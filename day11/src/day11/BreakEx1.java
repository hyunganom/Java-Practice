package day11;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {//true<<요거쓴이유는 무한반복을 하기위하여
			System.out.print("숫자입력 :");
			num=sc.nextInt();
			if(num==0) {
				System.out.println("프로그램 종료");
				break;//브레이크 이거안쓰면 숫자입력 계속 튀어나옴
				
			}
			System.out.println("입력값:"+num);
		}
	}

}
