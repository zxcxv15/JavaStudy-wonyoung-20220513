package j11_배열;

public class Array02 {

	public static void main(String[] args) {
//		int size = 4;
//		int[] numbers = new int[size]; // 인덱스 x , 배열의 갯수
//		
//		System.out.println("numbers의 길이: " + numbers.length);

		/*
		 * for문으로 0 ~ 99까지 반복을 한다. 
		 * 변수 i의 값이 8의 배수이면 
		 * 8의 배수 갯수 만큼 배열을 생성하고 
		 * 8의 배수를 모두 배열에대입한다. 
		 * 배열에 들어있는 8의 배수를 모두 출력하시오.
		 * 
		 */
		int size = 0;
		// 8의배수를 출력
		for (int i = 0; i < 100; i++) {
			if (i != 0 && i % 8 == 0) {
				size++; // 8의 배수이면 size를 1씩 증가시켜라

			}
		}
		//8의 배수일 때 배열에 담아주고 배열을 1씩 증가시켜라
		int[] numbers; // 배열 변수 선언 
		numbers = new int[size]; // size변수의 크기에 해당하는 배열의 생성

		for (int i = 0, j = 0; i < 100; i++) {
			if (i != 0 && i % 8 == 0) {
				numbers[j] = i;
				System.out.println(numbers[j]);
				j++;

			}
		}
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
	}
}