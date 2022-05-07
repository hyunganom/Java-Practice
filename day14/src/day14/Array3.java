package day14;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int scores[][]=new int[4][3];
		String sub[]= {"국어","영어","수학"};
		/*System.out.print(sub[0]+" :");
		/*scores[0][0] = sc.nextInt();
		System.out.print(sub[1]+" :");
		scores[0][1] = sc.nextInt();
		System.out.print(sub[2]+" :");
		scores[0][2] = sc.nextInt();*/
		
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"번 학생 점수");
			for(int j=0;j<3;j++) {
				System.out.print(sub[j]+":");
				scores[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			System.out.print("\t"+sub[i]);
		}
		System.out.println();
		
		for(int i=0;i<4;i++) {
			System.out.print(i+1+"번:\t");
			for(int j=0;j<3;j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
