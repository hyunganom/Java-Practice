package day34;

import java.time.LocalTime;

public class WithParc2 {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalTime lt2 = lt.withHour(3).withMinute(25).withSecond(24).withNano(3333);
		System.out.println(lt2);
	}

}
