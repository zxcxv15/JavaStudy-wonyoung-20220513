package j07_메소드;

//메소드 오버로딩 = 매개변수가 다른것

public class Method03 {
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, int num2) {
		System.out.println("int 자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void test1(double a) { // 매개변수가 하나여도 자료형이 다르면 호출 가능.
		System.out.println("int 자료형 매개변수가 하나인 test1 호출");
	}
	
	public static void test1(int num, double dNum) {
		System.out.println("int 자료형 다음에 double 자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void test1(double dNum, int num) { // 매개변수는 들어오는 순서가 다르면 호출 가능.
		System.out.println("double 자료형 다음에 int 자료형 매개변수가 두개인 test1 호출");
	}
	
	public static void main(String[] args) {
		test1();
		test1(10);
		test1(10,20);
		test1(3.14);
		test1(10,3.14);
		test1(3.14,10);
	}

}
