package day40;

import java.util.*;


public class PhoneBookMain {
	
	static HashMap<String, String> hm = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int choice;
		while(true) {
			System.out.println("--------��ȭ��ȣ��--------");
			System.out.println("1. �� ���� ����");
			System.out.println("2. �� ���� �˻�");
			System.out.println("3. �� ���� ���");
			System.out.println("4. ������");
			System.out.println("�Է� : ");
			choice= sc.nextInt();
			
			if(choice==1) {
				System.out.println("=====�� ���� ����=====");
				insert();
			}
			else if(choice==2) {
				System.out.println("=====�� ���� �˻�=====");
				search();
			}
			else if(choice==3) {
				System.out.println("=====�� ���� ���=====");
				show();
				}
			else if(choice==4) {
				System.out.println("=====������=====");
				break;
			}
			else {System.out.println("�߸��Է��ϼ˽��ϴ�");}
		}
		
		
	}
	public static void insert() {
		String name, phone;
		System.out.println("������ ���� �̸�: ");
		name = sc.next();
		//name key �̹Ƿ�, �ߺ���� �Ұ���
		if(hm.containsKey(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			return;
		}
		else {
			System.out.print("������ ���� ��ȣ : ");
			phone = sc.next();
			hm.put(name, phone);
			System.out.println("���� �Ϸ�!");
		}
	}
	public static void search() {
		String serchName;
		System.out.print("�˻��� �̸� : ");
		serchName = sc.next();
		//serchName�� hm�� �����ؾ� �˻� ����!
		if(hm.containsKey(serchName)) {
			System.out.println("�˻� �Ϸ�!");
			System.out.print("�˻��� ��ȭ��ȣ�� : "+hm.get(serchName));
		}
		else {
			System.out.println("�˻��� �̸��� �����ϴ�.");
		}
	}
	public static void show() {
		Set<String> Keyset = hm.keySet();
		Iterator i = Keyset.iterator();
		while(i.hasNext()) {
			String curName = (String)i.next();
			System.out.println("name : "+curName+", phone : "+hm.get(curName));
		}
	}
	
}



