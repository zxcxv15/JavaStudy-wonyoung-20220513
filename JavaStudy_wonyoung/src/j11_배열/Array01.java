package j11_배열;

//리터럴 상수: 이미 정해져 있는 값

public class Array01 {
	public static void main(String[] args) {
//		// number1,2,3... =>각가 임의에 메모리 주소(변수명)에 값을 넣는다	 
//		//일일이 다 써야된다
//		int number1 = 1;
//		int number2 = 2;
//		int number3 = 3;
//		int number4 = 4;
//		int number5 = 5;
//		int number6 = 6;
//		
		// 반복문을 쓰기 위해서 배열을 쓴다

		// 1.배열을 공간(크기)을 정해서 생성
		int[] numbers = new int[10]; //배열 생성

		// 2.배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		char[] characters = { 'a', 'b', 'c', 'd', 'e' };
		boolean[] booleans = { true, true, true, false, false };
		
		//3.String은 클래스다
		//클래스 변수는 주소값을 받는다 문자열(null = 첫 번째 주소에 아무것도 들어있지 않다)도 일종의 주소값
		String[] strAtrray = new String[5];
		String str = "test";
		
		System.out.println("numbers의 길이: " + numbers.length);
		System.out.println("strAtrray의 길이: " + strAtrray.length);
		
		//numbers.length = 해당 배열의 크기 만큼 반복해라
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("i: " + i);
			System.out.println("numbers: " + numbers[i]);
			System.out.println("numbers2: " + numbers2[i]);
			//System.out.println(strAtrray[i]); 배열크기가 달라서 안된다
		}
		
		for(int i = 0; i < strAtrray.length; i++) {
			System.out.println(strAtrray[i]);
		}

		for(int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}

	}

}
