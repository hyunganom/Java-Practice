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
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
	
}
class japanTour implements Prividable{

	@Override
	public void lesureSports() {
		System.out.println("도쿄 타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
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




