package j08_클래스;

public class FishBunMain {

	public static void main(String[] args) {
//참조 자료형(클래스도 자료형이다)  붕어빵틀  붕어빵호출(생성자)
					FishBun fishBun = new FishBun(); //객체(붕어빵 1개) 생성... => 오브젝트(찍어 낼 수있는 것) => 인스턴스(실제로 찍어낸 것)
//							생성해서 어디다 보관 ==> 메모리 주소에 닮겨있다.
		
		fishBun.showInfo(); //처음에는 값을 넣지 않았으니 null.
		fishBun.material = "팥";
		fishBun.dough = "부드러운 반죽";
		fishBun.showInfo();
		
		System.out.println("=========================");
//			변수명 중복 x	
		FishBun fishBun2 = new FishBun();
		
		fishBun2.showInfo();
		fishBun2.material = "슈크림";
		fishBun2.dough = "퍽퍽한 반죽";
		fishBun2.showInfo();
		fishBun.showInfo();

		System.out.println("=========================");

		System.out.println(fishBun); // 반환할 값(메모리 주소)가 있으니 출력 가능.
		System.out.println(fishBun2);
	}

}
