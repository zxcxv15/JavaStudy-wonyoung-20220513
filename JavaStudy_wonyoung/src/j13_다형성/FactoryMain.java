package j13_다형성;

public class FactoryMain {
	
	public static void main(String[] args) {
		//각각 상위 클래스에 정의된 메소드를 사용할 수 있다.
//		SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
//		ComputerFactory computerFactory = new ComputerFactory();
		
		
		//업캐스팅 = 상위 클래스로 업캐스팅
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();

		Factory[] factorys = new Factory[5];   
	}
}
