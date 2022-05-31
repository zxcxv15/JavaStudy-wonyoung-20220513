package j17_스택틱;

public class Main {
	public static void main(String[] args) {

		//클래스 = 틀 --> t,t2,t3을 생성(클래스는 각자 한테 주어진다)?
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//각각의 메소드들에 대입
		t.cnt = 10; 
		t2.cnt = 20;
		t3.cnt = 30;
		
		//cnt에 들어 있는 값을 메소드에 대입해 출력.
		t.method();
		t2.method();
		t3.method();
		
		System.out.println();
		
		// 생성을 했지만 복제 안된다. 메모리주소가 할당 되더라도 변수나 데이터 값이 들어가 있지 않다 --> 생성이 무의미하다(생성관 전혀 상관 x)
		// 공유한다.
//		StaticTest st = new StaticTest();
//		StaticTest st2 = new StaticTest();
//		StaticTest st3= new StaticTest();
//		
//		st.cnt = 10;
//		st2.cnt = 20;
//		st3.cnt = 30;
		
		
//		st.staticmethod();
//		st2.staticmethod();
//		st3.staticmethod();
//		
		StaticTest.cnt = 100; 	// 스태틱 = 젤 마지막에 들어가 값이 공유된다.(변수나 메소드에 사용)
								// 자주쓰이고 공통적으로 쓰이는 것.
		StaticTest.staticmethod();
	}

}