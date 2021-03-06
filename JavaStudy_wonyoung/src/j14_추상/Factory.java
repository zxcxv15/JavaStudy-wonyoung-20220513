package j14_추상;

/*
 * abstract(추상)
 * 1. 추상 메소드: 리턴 타입 앞에 abstract 키워드가 붙는다.
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다.
 * 3. 상속 또는 구현된 클래스에서 무족건 override(재정의)가 되어야한다.
 * => 이 메소드는 무족건 정의해야한다.
 * 
 * 추상 클래스
 * 1. 클래스 타입 앞에 abstract 키워드가 붙는다.
 * 2. 추상 클래스는 생성할 수 없다.(new 불가능) 단순 설계도(틀)의 역할만 한다.
 * 3. 추상 메소드를 포함 할 수 있다. 하지만 추상 메소드를 꼭 포함하지 않아도 된다. 
 */

//추상 클래스
public abstract class Factory {
	//추상 메소드
	public abstract void start(); // 이 공장에서 꼭 필요한 기능이다 -> 추상(꼭 오버라이드 해야함)
	//일반 메소드
	public  void stop() {  // 이 공장에서 꼭 필요없는 기능이다 -> 꼭 오버라이드 안해도 됨
		System.out.println("공장을 멈춥니다.");
	}
	
}
