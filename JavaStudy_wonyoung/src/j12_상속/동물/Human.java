package j12_상속.동물;
/*
 * @: 어노테이션
 * 
 * @Override(재정의)
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다라는 의미
 * 굳이 하는 이유 => 다형성때문이다-+
 */

public class Human extends Animal {
	//메소드 오버라이딩(상속과 implements에서만) => 부모클래스가 가지고 있는 메소드를 자식클래스에서 메소드를 재정의 한다.
	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}
