package day36;

public class Generic1 {

	public static void main(String[] args) {
		Value v = new Value();
		v.<Integer>TypeSearch(3);
		v.TypeSearch(3.14);
		v.TypeSearch(3.14f);
		v.TypeSearch('a');
		v.TypeSearch("hello");
		v.TypeSearch(true);
	}

}
class Value{
	public <T> void TypeSearch(T x) {//x�� ������������
		//�׷��� ���׸�����ؼ� �ϴ� x�� �޾Ƶ�
		if(x instanceof Integer) {
			System.out.println(x+"�� �����Դϴ�.");
		}
		else if(x instanceof Double|| x instanceof Float) {
			System.out.println(x+"�� �Ǽ��Դϴ�.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"�� �������Դϴ�.");
		}
		else if(x instanceof String) {
			System.out.println(x+"�� ���ڿ��Դϴ�.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"�� �����Դϴ�.");
		}
	}
	
	
}