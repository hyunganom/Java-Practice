package OOP;

public class Constructor2 {

	public static void main(String[] args) {
		Date_1 d1 = new Date_1();
		Date_2 d2 = new Date_2();
	}

}
class Date_1{
	int value;
//	Date_1(){} //�⺻������ �߰� �̰� ����� �ֳĸ� �����ڰ� 1���� ������ �̰� ���������ϴµ� ���� �ȿ� �����ڰ� ������ �ڵ����� �������
}

class Date_2{
	int value;
	
	Date_2(int x){
		value=x;
	}

	Date_2() {}// �⺻ ������ ���� �ϳ��� ������ �⺻�����ڸ� ����� �����
}
