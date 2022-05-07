package day12;

public class InitAr {

	public static void main(String[] args) {
		int arInt[] = new int[3];
		double arDouble[] = new double[3];
		char archar[] = new char[3];
		String arstring[] = new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.print(arInt[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arDouble[i]+" ");
		}
		for(int i=0;i<3;i++) {
			System.out.print(archar[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arstring[i]+" ");
		}
	}

}
