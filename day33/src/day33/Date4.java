package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfyear=Calendar.getInstance();
		Calendar Chrismas = Calendar.getInstance();
		
		endOfyear.set(Calendar.MONTH, 12);//month:12��
		endOfyear.set(Calendar.DATE, 31);//date:31��
		long diff = endOfyear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("�������� ������ : "+diff/(24*60*60*1000)+"��");
		
		Chrismas.set(2022, 12, 25);
		diff=Chrismas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("ũ������������ ������ : "+diff/(24*60*60*1000)+"��");
		
	}

}
