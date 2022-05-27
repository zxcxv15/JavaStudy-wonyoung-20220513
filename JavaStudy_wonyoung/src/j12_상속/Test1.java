package j12_상속;

public class Test1 extends Test {
	// 자식
	
	public Test1() {
		super(); //생략이 되어있다 => 부모클래스(주소) 생성
		System.out.println("T1 자식생성자 호출...");
		System.out.println("T1에서 확인: " + super.toString());
											//부모의 주소값 출력
	}

}
