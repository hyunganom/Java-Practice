package day32;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random = new Random();//seed : ����ð�
		Random random1 = new Random(2);//seed:2
		Random random2= new Random(2);//seed:2
		
		for(int i=0; i<5;i++) {
			System.out.println("�⺻������:"+random.nextInt());
		}
		for(int i=0; i<5;i++) {
			System.out.println("random1:"+i+"��° ��: "+random1.nextInt());
		}
		for(int i=0; i<5;i++) {
			System.out.println("random2:"+i+"��° ��: "+random2.nextInt());
		}
	}

}
