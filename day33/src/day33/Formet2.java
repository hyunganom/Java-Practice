package day33;

import java.text.SimpleDateFormat;
import java.util.*;

public class Formet2 {

	public static void main(String[] args) {
		Date day= new Date();
		String patternKorea="yyyy-MM-dd";
		String patternUsa="MM-dd-yyyy";
		String patternUK="dd-MM-yyyy";
		String pattern1 = "E���� HH�� mm�� ss��";
		
		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternUsa);
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
		
		System.out.println("���糯¥:"+day);
		System.out.println("�ѱ� ����(��,��,��)"+p1.format(day));
		System.out.println("�̱� ����(��,��,��)"+p2.format(day));
		System.out.println("���� ����(��,��,��)"+p3.format(day));
		System.out.println("pattern1 :"+p4.format(day));
		
		
	}

}
