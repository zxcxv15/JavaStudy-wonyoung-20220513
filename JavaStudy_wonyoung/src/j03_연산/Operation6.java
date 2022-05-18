package j03_연산;

public class Operation6 {

	public static void main(String[] args) {
		//조건연산자(삼항 연산자)
		int num = 80;
		String result  = num % 4 == 0 ? "4의배수" : "4의배수가 아님";
		boolean result2 = num % 4 == 0 ? true : false;
		int result3 = num % 4 == 0 ? 1 : 0;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
