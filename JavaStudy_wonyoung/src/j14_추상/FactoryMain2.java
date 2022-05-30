package j14_추상;

public class FactoryMain2 {

	public static void main(String[] args) {
		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop();
		
	//	Factory factory = new Factory(); Factory를 추상 클래스로 만들었으니까 => 추상 클래스는 생성할 수 없다.
	//공통된 사항들을 묶어서 설계를 하고 싶고 꼭 구현해야 하는 메소드들을 abstract를 사용하여 구현을 해야하게끔 유도
		System.out.println();
		
		SamsungFactory samsungFactory = new SamsungFactory();
		samsungFactory.start();
		samsungFactory.stop();
		
	}
}
