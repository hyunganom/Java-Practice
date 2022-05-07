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
		
		//로또 배열에 6개의 랜덤값을 저장
		for(int i=0; i<6; i++) {
			lotto[i]=rd.nextInt(45)+1;
		}
		bonus=rd.nextInt(45)+1;
		
		System.out.println(Arrays.toString(lotto)+bonus);
		
		//사용자에게 6개의 값을 입력
		System.out.print("6개 숫자입력 :");
		for(int i=0; i<6;i++) {
			user[i]=sc.nextInt();
		}
		System.out.print("보너스값 입력 :");
		bonusUser=sc.nextInt();
		
		System.out.println(Arrays.toString(user)+",bonus:"+bonusUser);
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(user[i]==lotto[j]) {
					count++;
				}
			}
		}
		
		
		
		System.out.println("맞춘 숫자 갯수 :"+count);
		
		
		if(count==6) {
			System.out.println("1등");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("2등");
			}
			else {
				System.out.println("3등");
			}
		}
		else if(count==4) {
			System.out.println("4등");
		}
		else {
		System.out.println("5등");
			}
		
	

  }
	}
