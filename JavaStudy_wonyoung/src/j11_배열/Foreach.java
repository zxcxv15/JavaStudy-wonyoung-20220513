package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// i: 0 < numbers.length: 8

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			// 배열의 길이가 7이 아니면 ,을 출력해라
			if (i != numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length - 1 != i ? ", " : ""));
		}
		System.out.println();
		
		//foreach문
		// numbers배열에 들어있는 값을 num한테 대입해서 처음부터 끝까지 반복해라 num = numbers; 
		int i = 0;
		for(int num : numbers) { // 자료형이 같아야 된다
			System.out.print(num + (numbers.length - 1!= i ? ", " : ""));
			i++;
		}

	}

}
