package j18_최상위클래스;

public class Main {
	public static void main(String[] args) {

		Teacher t1 = new Teacher("홍길동", "웝개발");
		Teacher t2 = new Teacher("홍길동", "웝개발");

		System.out.println(t1); // toString은 생략이 가능하다
		System.out.println(t2); // 아무것도 안넣으면 주소값을 리턴 해주지
		System.out.println(t1 == t2); // '==' -> 주소값 비교하는 등호
		System.out.println(t1.equals(t2)); // 주소값 비교
		System.out.println(t1.hashCode() == t2.hashCode());

	}

}
