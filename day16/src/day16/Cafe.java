package day16;

import java.util.*;

public class Cafe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		//�ֹ��� �� 5������ ����
		String orderlist[]=new String[5];
		int total=0;
		while(true) {
			System.out.println("ī�信 ���Ű� ȯ���մϴ�.");
			System.out.println("1. �ֹ��ϱ� :");
			System.out.println("2. ����ϱ� :");
//			System.out.println("3. �����ϱ� :");
			System.out.println("4. ������ :");
			System.out.println("�Է� :");
			int num=sc.nextInt();
			if(num==1) {
				String menuname="";
				int menuprice=0;
				System.out.println("1.�Ƹ޸�ī��\t3800��");
				System.out.println("2.����������\t3800��");
				System.out.println("3.ī����\t3800��");
				System.out.println("4.��ũƼ\t\t3800��");
				System.out.println("�ֹ��� �޴���ȣ :");
				int menunum=sc.nextInt();
				if(menunum==1) {
					menuname="�Ƹ޸�ī��";
					menuprice=3800;
				}
				else if(menunum==2) {
					menuname="����������";
					menuprice=2400;
				}
				else if(menunum==3) {
					menuname="ī���";
					menuprice=4200;
				}
				else if(menunum==4) {
					menuname="��ũƼ";
					menuprice=5100;
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				total+=menuprice;
				orderlist[count]=menuname;
				count++;
				System.out.println("�ֹ��� �޴���"+menuname+"�Դϴ�.");
				System.out.println("������"+menuprice+"�Դϴ�.");
			}
			else if(num==2) {
				System.out.println("----�ֹ��� �޴� ����Ʈ----");
				for(int i=0;i<count;i++) {
					System.out.println(i+1+"."+orderlist[i]);
				}
				System.out.println("����� �޴���ȣ :");
				int cancelnun=sc.nextInt();
				if(1<cancelnun&&cancelnun<=count) {
					String delmenu =orderlist[cancelnun-1];
					System.out.println(delmenu+"�޴�����!");
					for(int i=cancelnun-1;i<count;i++) {
						orderlist[i]=orderlist[i+1];
					}
					if(delmenu.equals("�Ƹ޸�ī��")) {
						total-=3800;
					}
					else if(delmenu.equals("����������")) {
						total-=2400;
					}
					else if(delmenu.equals("ī���")) {
						total-=4200;
					}
					else if(delmenu.equals("��ũƼ")) {
						total-=5100;
					}
					count--;
				}
				
			}
			else if(num==3) {
				System.out.println("������ �ݾ�:"+total+"��");
				System.out.println("�����ұݾ�:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("�ݾ��̺����մϴ�");
					continue;
				}
				else {
					System.out.println("�ܵ���"+(money-total)+"�� �Դϴ�.");
					total=0;
					for(int i=0;i<5;i++) {
						orderlist[i]="";
					}
					count=0;
				}
			}
			else if(num==4) {
				System.out.println("�ݺ�����");
			break;}
			
			else {System.out.println("�߸��Է��ϼ̽��ϴ�.");}
			
			
			
			
			
		}
		
	}

}
