package j14_추상;

public class FactoryMain {

	public static void main(String[] args) {
		// 업캐스팅 => 배열을 만들어서 묶을 수 있다.
		// 원래 -> LGFactory le = new LGFactory -> Factory로 업캐스팅
		Factory lg = new LGFactory();
		Factory samsung = new SamsungFactory();

		//Factory 클래스르 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간을 만든 것(배열 2개), 생성x => 동일한 자료 두개를 하나로 묶어서 나타낼수 있다.
		Factory[] factorys = new Factory[2]; // 처음 생성된 인덱스 값은 null이니 밑에 생성하여 값을 넣어줘라
		
		factorys[0] = new SamsungFactory(); // 삼성팩토리를 생성해서 0번 인덱스위치에 대입을 해준것 (업캐스팅): 하위 -> 상위
		factorys[1] = new LGFactory();	// 엘쥐팩토리를 생성해서 1번 인덱스위치에 대입을 해준것 (업캐스팅): 하위 -> 상위

		
		for (Factory factory : factorys) { //foreach: 처음부터 끝까지 반복
			factory.start();
		}
		for (Factory factory : factorys) {
			factory.stop();
		}
	}
}
