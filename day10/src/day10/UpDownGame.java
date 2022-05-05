package day10;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int a=-1;
		int b=random.nextInt(100)+1;
		
		while(a!=b) {
			System.out.print("숫자입력 : ");
			a=sc.nextInt();
			if(b<a) {
				System.out.println("down");
			}
			else if(b>a) {
				System.out.println("up");
			}
			else {
				System.out.println("정답");
			}
		}
		
	}

}
