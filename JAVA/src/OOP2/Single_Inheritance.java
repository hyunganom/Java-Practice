package OOP2;


public class Single_Inheritance {
}
//���� ���
//java�� ���� ��Ӹ��� ����Ѵ�.

class MyTv{
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class DvD{
	boolean power;
	
	void power() {power =! power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class TvDvd extends Tv{
	DvD d = new DvD();
	
	void play() {
		d.play();
	}
	void stop() {
		d.stop();
	}
	void rew() {
		d.rew();
	}
}
//������ ���� Ŭ���� �ϳ��� ��Ӱ����, �������� ���԰���� �Ѵ�.