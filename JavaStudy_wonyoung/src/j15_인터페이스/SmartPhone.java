package j15_인터페이스;

public class SmartPhone {

	private final Hdmi hdmi; // 인터페이스를 선언해 주고 -> 모니터, 빔이 될 수 도있다
	// final = 선언을 하였으면 생성되는 시점에 무족건 값을 줘야한다.

	public SmartPhone(Hdmi hdmi) { // 연결해준다
		this.hdmi = hdmi;
	}

	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다");
		hdmi.connect();
	}

	public void powerOff() {
		System.out.println("스마트폰의 전원을 끕니다");
		hdmi.disconnet();
	}

}
