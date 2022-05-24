package j08_클래스;

public class FishBun {
	String material;
	String dough;
	//생성자 => 1.반환값: 무족건 메모리 주소를 반환한다. 2.클래스명이랑 이름이 같다 3.반환자료형이 생략되어있다. 
	FishBun() {
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
	

}
