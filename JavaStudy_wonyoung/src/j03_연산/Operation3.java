package j03_연산;

public class Operation3 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 *
		 * result = false
		 * 
		 * 년도가 4의 배수이면 True 아니면 False
		 * 
		 * 윤년이면 True 아니면 False 4의 배수 이면서 100의배수가 아닐때 또는 400의 배수일때.
		 */

		int year = 2000;

		boolean result = year % 4 == 0 // 참
				&& year % 100 != 0 // 참
				|| year % 400 == 0; // 참
		System.out.println(result);
	}

}
