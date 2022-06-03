package j17_스택틱;
/*
 * 인스턴스 변수: 클래스가 생성될 떄 메모리공간이 할당되고 생성자에 있는 값으로 초기화 된다.
 * 클래스 변수(static): 1.어디에서 선언이 되더라도 공유되어 질 수 있다.
 * 					 2. static이 선언되는 순간에 하나의 메모리 공간이 할당되어,그 순간부터 공유 가능
 */

public class StaticTest {

	public static int cnt; 

	public static void staticmethod() {
		System.out.println("스택틱 메소드 [ " + cnt + " ]");
	}
}
