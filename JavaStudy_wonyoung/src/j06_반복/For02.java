package j06_반복;

public class For02 {

	public static void main(String[] args) {
		/*
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    ** 
		 *     *
		 *     
		 *    *
		 *   ***
		 *  *****
		 * *******
		 **********     
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) { // 조건 고정하는게 좋다
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("=====================");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("=====================");

		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}