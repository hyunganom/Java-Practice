package day27;

public class Interface3 {

	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.lesureSports();
		guide.sightseeing();
		guide.food();
	}

}
interface Prividable{
	void lesureSports();
	void sightseeing();
	void food();
	
}

class koreaTour implements Prividable{

	@Override
	public void lesureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}

	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}

	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}
	
}
class japanTour implements Prividable{

	@Override
	public void lesureSports() {
		System.out.println("���� Ÿ�� �������� ����");
	}

	@Override
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}

	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}
	
}


class TourGuide{
	//private Prividable tour = new koreaTour();
	private Prividable tour = new japanTour();
	public void lesureSports() {
		tour.lesureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}




