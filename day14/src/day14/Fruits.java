package day14;

import java.util.Scanner;
import java.util.Stack;

public class Fruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fr[] = new String[3];
		
		for(int i=0; i<3;i++) {
			System.out.print("주문할 과일 : ");
			fr[i]=sc.next();
		}
		System.out.println("주문받은 과일");
		for(String efr:fr) {
			System.out.print(efr+" ");
		}
	}

}
