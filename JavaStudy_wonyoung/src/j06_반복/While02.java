package j06_반복;

public class While02 {

	public static void main(String[] args) {
		/*
		 * 구구단 2단출력
		 * 
		 * 2 x 1 = 2 ...
		 *  2 x 9 = 18
		 */
		int dan = 2;
		int num = 0;
		while (num < 9) {
			System.out.println(dan + " x " + (num + 1) + " = " + dan * (num + 1));
			//									0 + 1 				2 *  0 + 1 => 2  * 1 = 2		
			//									1 + 1				2 *  1 + 1 => 2  * 2 = 4
			num++; 
			//후증가 다음번 반복을 실행 할때  1씩 더해진다
		}	

	}

}
