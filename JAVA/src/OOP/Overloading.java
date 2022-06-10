package OOP;

public class Overloading {
	public static void main(String[] args) {
		Overloading op = new Overloading();
		System.out.println("op.add(3, 3) ���:"+op.add(3,3));
		System.out.println("op.add(3L, 3) ���:"+op.add(3L,3));
		System.out.println("op.add(3, 3L) ���:"+op.add(3,3L));
		System.out.println("op.add(3L, 3L) ���:"+op.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("op.add(a) ���:"+op.add(a));
	}
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {		//�迭�� ��� ����� ���� ����� �����ش�.
		System.out.print("int add(int[] a) - ");
		int result=0;
		for(int i=0; i < a.length;i++) {
			result += a[i];
		}
		return result;
	}
	
}
//�����ε� : �����ϴ�
//�� Ŭ���� �ȿ� ���� �̸��� �޼��� ���� �� �����ϴ� ��

//�����ε��� �����ϱ� ���� ����
//1.�޼��� �̸��� ���ƾ� �Ѵ�.
//2.�Ű������� ���� �Ǵ� Ÿ���� �޶���Ѵ�.
//3. ��ȯŸ���� ������ ����.