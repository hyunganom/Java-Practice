package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfyear=Calendar.getInstance();
		Calendar Chrismas = Calendar.getInstance();
		
		endOfyear.set(Calendar.MONTH, 12);//month:12월
		endOfyear.set(Calendar.DATE, 31);//date:31일
		long diff = endOfyear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은날 : "+diff/(24*60*60*1000)+"일");
		
		Chrismas.set(2022, 12, 25);
		diff=Chrismas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은날 : "+diff/(24*60*60*1000)+"일");
		
	}

}
