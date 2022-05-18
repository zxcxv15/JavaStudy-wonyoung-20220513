package j03_연산;

public class Operation4 {

	public static void main(String[] args) {
		/*
		 * num1, num2, num3 전부 0으로 초기화.
		 * 
		 * num1의 값이 3의 배수이면서 
		 * num2의 값이 짝수 여야하고
		 * num3의 값이 5의 배수이면서
		 * num3의 값에 num1을 나눈 나머지가 1이면 또는 
		 * num3의 값에 num2를 나눈 나머지가 0이면 
		 * 
		 * true를 출력하라.
		 */  
		int num1 = 3;
		int num2 = 2;
		int num3 = 9;
		boolean result = num1 % 3 == 0  //참
				&& num2 % 2 == 0 	//참
				&& num3 % 5 == 0 	//참
				&& num3 % num1 == 1  //거짓
				|| num3 % num2 == 0; //참
		System.out.println(result);
	}

}
