package day30;

public class Exception4 {

	public static void main(String[] args) {
		int age=-19;
		try {
			ticketing(age);
		} catch (AgeException e) {
			e.printStackTrace();
		}
	}
	public static void ticketing(int age) throws  AgeException{
		if(age<0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");
		}
	}
}
class AgeException extends Exception{
	 public AgeException() {
	}
	 public AgeException(String message) {
		 super(message);
	 }
	
}