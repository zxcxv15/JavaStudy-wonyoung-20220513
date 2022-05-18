package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		/*
		 * 1.문제
		 * 
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름 :
		 * 나이:
		 * 연락처:
		 * 주소:
		 */
		
		char name1 = '장';
		char name2 = '원';
		char name3 = '영';
		
		int age = 27;
		String phone = "010-2028-3850";
		String address = "부산광역시 부산진구 ";
		
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println(name1 + name2 + name3); // char = 기본값이 유니코드
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		System.out.println("세 수의 합: " + (10 + 20 + 30)); //연산자 우선순위.

	}

}
