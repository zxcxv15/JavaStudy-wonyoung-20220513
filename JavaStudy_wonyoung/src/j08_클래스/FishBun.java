package j08_클래스;

public class FishBun {
	String material;
	String dough;
	//생성자 => 이름은 대문자로 시작. 반환값: 무족건 메모리 주소를 반환한다.
	FishBun() {
		System.out.println("생성자 호출");
	}
	
	void showInfo() {
		System.out.println("재료: " + material);
		System.out.println("반죽: " + dough);
	}
	

}
