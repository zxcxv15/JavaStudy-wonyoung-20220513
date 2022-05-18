package j03_연산;

/*
 * 논리 연산자
 * 
 * 1.AND => &&  -  곱  ~이면서,그리고
 * => 모든 조건이 참일때 True의 결과를 가짐.
 * => 하나라도 거짓이면 False의 결과를 가짐.
 * 
 * t(1) && t(1) => t(1)
 * t(1) && f(0) => f(0)
 * 
 * 2.OR  => ||  -  합  ~또는,이거나
 * => 모든 조건이 거짓일때 False의 결과의 가짐.
 * => 하나라도 참이면 True의 결과를 가짐.
 * 
 * t(1) || t(1) => t(1)
 * t(1) || f(0) => t(1)
 * f(0) || f(0) => f(0) 
 * 
 * 3.NOT => !   -  부정
 * => !(t && t) => f(0)
 * => !(f && f) => t(1)
 * 
 * 0(false)
 * !0(true)
 * 	
 */

public class Operation2 {

	public static void main(String[] args) {
		int num = 10;

		boolean result1 = num > 5;
		boolean result2 = num == 10;

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result1 AND result2: " + (result1 && result2));

	}

}
