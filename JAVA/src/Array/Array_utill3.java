package Array;

public class Array_utill3 {

	public static void main(String[] args) {
		int[] numArr= new int[10];
		int[] counter= new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=(int)(Math.random()*9);
			System.out.print(numArr[i]);
		}
		System.out.println();
		for(int i=0;i<counter.length;i++) {
			counter[numArr[i]]++;
		}
		for(int i=0;i<counter.length;i++) {
			System.out.println(i+"�� ����: "+counter[i]);
		}
	}

}
