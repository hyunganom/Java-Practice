package day05;

public class Logic_operator {

	public static void main(String[] args) {
			boolean a=true;
			boolean b=false;
			boolean c=true;
			
			System.out.println(a&&b); //a값과 b값이 모두 참일때만 결과가 참 : and
			System.out.println(a&&c); //a값과 c값이 모두 참일때만 결과가 참 : and
			System.out.println((2<4)&&(4<5));
			
			System.out.println(a||b);//a 혹은 c가 true라면 결과는 true
			System.out.println(a||c);//a 혹은 c가 true라면 결과는 true
			
			System.out.println(!a);
	}

}
