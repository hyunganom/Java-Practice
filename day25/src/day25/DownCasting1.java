package day25;

public class DownCasting1 {

	public static void main(String[] args) {
		//��ĳ����
		Human h1=new Student("���浿", 15, "����",2);
		//h1.study();
		//�ٿ�ĳ����
		Student s1=(Student)h1;
		s1.study();
	}

}
