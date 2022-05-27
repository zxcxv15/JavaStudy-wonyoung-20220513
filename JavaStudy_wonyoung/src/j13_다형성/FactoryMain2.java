package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
		// 참조형이니까 배열로 나타낼 수 있다? => 반복을 할 수 있다.
		// 업캐스팅
		Factory[] factorys = new Factory[10];
		// 업캐스팅(하나로 묶어주기 위해)이 되면 start 메소드만 사용할 수 있는데 부모에 start가 없다면 메소드를 사용하지 못한다.
		// 그래서 메소드 오버라이드를 써야 한다.
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();

		for (int i = 0; i < factorys.length; i++) {
			// 삼항연산자, 조건연산자
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}

		for (Factory factory : factorys) {
			factory.start();
		}

		int i = 10;
		double d = i;
		int ii = (int) i;

		System.out.println();
		// 다운캐스팅
		for (Factory factory : factorys) {
			//원래의 생성된 것이 무엇인지 알려주는 것 = instanceof
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;	
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			} else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
		}
	}
}
