package j17_스택틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야 한다
		 * 2. 외부에서 생성자를 만들수 없게끔 무족건 private로 선언해줘야 한다.
		 */
		
		
		
		Singleton singleton = Singleton.getInstance(); // 클래스를 static을 주면 생성하지 않아도 사용할 수 있다.
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance(); 
		singleton2.setCount(20);
		singleton2.printInfo();

	}

}
