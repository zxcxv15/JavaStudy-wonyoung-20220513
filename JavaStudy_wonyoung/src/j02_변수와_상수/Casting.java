package j02_변수와_상수;

public class Casting {

	public static void main(String[] args) {
		//업캐스팅 문자 -> 정수 -> 실수(묵시적형 변환)
		
		char a = 'A'; 
		System.out.println(a);
		int b = a; 	
		System.out.println(b);
		double c = b;
		System.out.println(c);
		
		//다운캐스팅 실수 -> 정수 -> 문자(명시적형 변환)
		
		int d = (int) c;
		System.out.println(d);
		char e = (char)d;
		System.out.println(e);
		
	}

}
