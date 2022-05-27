package j13_다형성;

public class SmartPhoneFactory extends Factory {
	
	@Override //상위 클래스의 메소드를 오버라이드 해서 재정의 해서 쓸 수있다
	public void start() {
		System.out.println("스마트폰 공장을 가동합니다.");
	}
	public void showSmartPhone() {
		System.out.println("스마트 폰들을 확인합니다.");
	}

}
