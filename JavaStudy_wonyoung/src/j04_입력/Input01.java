package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		//윤년 값 출력해보기.
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		String result = year % 4 == 0 && year % 100 != 0 || year % 100 == 0 ? "윤년" : "윤년아님";
		System.out.println(result);
	}

}
