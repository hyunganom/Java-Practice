package OOP;

public class Return1 {
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return;//dan�� ���� �ƴѰ��, ȣ���� ������ �׳� �ǵ��� ����.
		}
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
		return;//��ȯ Ÿ���� void�϶��� ��������. �����Ϸ��� �ڵ��߰�.
		
		}
}
	
	
//	int multiply(int x, int y) {
//		int result = x*y;
//		result result;
//   }
	

//return�� : �������� �޼��带 �����ϰ� ȣ���� ������ �ǵ��ư���.
//��ȯŸ���� ���̵尡 �ƴϸ� �ݵ�� return�� �ʿ�