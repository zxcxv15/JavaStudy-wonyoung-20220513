package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {
	public static void main(String[] args) {

		String name = "홍길동"; 
		String name2 = "홍길동";

		System.out.println(name == name2); //주소값 비교
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름1: "); // 새로운 주소가 생성된다.
		name = scanner.nextLine();
		
		System.out.print("이름2: "); // 새로운 주소가 생성된다.
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("이순신");  // 새로운 객체가 생성 = new 되서 주소가 다르다.
		name2 = new String("이순신"); // 새로운 객체가 생성 = new 되서 주소가 다르다.
		
		System.out.println(name == name2); // 주소값 비교
		 
		System.out.println(name.equals(name2)); // 안에있는 값 (문자열) 비교
	}

}
