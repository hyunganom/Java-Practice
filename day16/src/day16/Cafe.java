package day16;

import java.util.*;

public class Cafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		//주문은 총 5개까지 가능
		String orderlist[]=new String[5];
		int total=0;
		while(true) {
			System.out.println("카페에 오신걸 환영합니다.");
			System.out.println("1. 주문하기 :");
			System.out.println("2. 취소하기 :");
//			System.out.println("3. 결제하기 :");
			System.out.println("4. 끝내기 :");
			System.out.println("입력 :");
			int num=sc.nextInt();
			if(num==1) {
				String menuname="";
				int menuprice=0;
				System.out.println("1.아메리카노\t3800원");
				System.out.println("2.에스프레소\t3800원");
				System.out.println("3.카페라뗴\t3800원");
				System.out.println("4.밀크티\t\t3800원");
				System.out.println("주문할 메뉴번호 :");
				int menunum=sc.nextInt();
				if(menunum==1) {
					menuname="아메리카노";
					menuprice=3800;
				}
				else if(menunum==2) {
					menuname="에스프레소";
					menuprice=2400;
				}
				else if(menunum==3) {
					menuname="카페라떼";
					menuprice=4200;
				}
				else if(menunum==4) {
					menuname="밀크티";
					menuprice=5100;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue;
				}
				total+=menuprice;
				orderlist[count]=menuname;
				count++;
				System.out.println("주문한 메뉴는"+menuname+"입니다.");
				System.out.println("가격은"+menuprice+"입니다.");
			}
			else if(num==2) {
				System.out.println("----주문한 메뉴 리스트----");
				for(int i=0;i<count;i++) {
					System.out.println(i+1+"."+orderlist[i]);
				}
				System.out.println("취소할 메뉴번호 :");
				int cancelnun=sc.nextInt();
				if(1<cancelnun&&cancelnun<=count) {
					String delmenu =orderlist[cancelnun-1];
					System.out.println(delmenu+"메뉴삭제!");
					for(int i=cancelnun-1;i<count;i++) {
						orderlist[i]=orderlist[i+1];
					}
					if(delmenu.equals("아메리카노")) {
						total-=3800;
					}
					else if(delmenu.equals("에스프레소")) {
						total-=2400;
					}
					else if(delmenu.equals("카페라떼")) {
						total-=4200;
					}
					else if(delmenu.equals("밀크티")) {
						total-=5100;
					}
					count--;
				}
				
			}
			else if(num==3) {
				System.out.println("결제할 금액:"+total+"원");
				System.out.println("지불할금액:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("금액이부족합니다");
					continue;
				}
				else {
					System.out.println("잔돈은"+(money-total)+"원 입니다.");
					total=0;
					for(int i=0;i<5;i++) {
						orderlist[i]="";
					}
					count=0;
				}
			}
			else if(num==4) {
				System.out.println("반복종료");
			break;}
			
			else {System.out.println("잘못입력하셨습니다.");}
			
			
			
			
			
		}
		
	}

}
