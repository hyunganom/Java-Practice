package day33;

import java.util.Calendar;

public class Date3 {
public static void main(String[] args) {
	Calendar a = Calendar.getInstance();
	
	int year = a.get(Calendar.YEAR);
	int month=a.get(Calendar.MONTH);
	int date = a.get(Calendar.DATE);
	
	System.out.println(year+"��"+month+"��"+date+"��");
	System.out.println("������ �̹��ֿ��� �� ��° ���ΰ�: ");
	System.out.println(a.get(Calendar.DAY_OF_WEEK));
	
	System.out.println("�̹� �⵵���� ������ �� ��° �ΰ�: ");
	System.out.println(a.get(Calendar.DAY_OF_YEAR));
	
	System.out.println("�̹� ���� ���ϱ��� �ִ°�: ");
	System.out.println(a.getMaximum(Calendar.DATE));
	
	}
}
