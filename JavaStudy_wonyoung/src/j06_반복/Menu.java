package j06_반복;

import java.util.Scanner;

public class Menu {
//nextLine이 아닌 이상 모든 것이(next,nextInt...) 버퍼 때문에 \n을 날려줘야됨 (scanner.nextLine();)이거 해야 됨
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean loopFlag = true;

		System.out.println("프로그램 시작");

		while (loopFlag) { // 안쪽에서도 프로그램을 종료 시키려면 그 쪽에 값을 false로 바꾸면 된다.
			char select = 0; // 지역변수: while안에서만 쓸 수 있다.

			System.out.println("[ 메뉴 선택 ]");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("q. 프로그램 종료");

			System.out.print("명령을 입력하세요: ");
			select = scanner.next().charAt(0); // -> = nextLine().char(0) => nextLine은 엔터를 포함하니 버퍼가 필요없다.
			scanner.nextLine(); // 버퍼 기능상 반복을 멈춰버리기 떄문에.
			
			System.out.println();
			
			if (select == 'q') {
				break; // 결과 값이 참이면 멈춰라.
			} else if (select == '1') {
				System.out.println("java를 선택하셨습니다.");
				System.out.println();

				while (true) {
					System.out.println("[ java 메뉴 ]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기"); 
					System.out.println("q. 프로그램 종료");

					System.out.print("명령을 입력하세요: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();
					
					System.out.println();
					
					if (select == 'b') {
						break;
					}else if(select == 'q'){
						loopFlag = false;
						break;	
					} else if (select == '1') {
						System.out.println("java란 ... 입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요!!");
						scanner.nextLine();
						} else {
						System.out.println("해당 명령은 없습니다.");
						System.out.print("다시 입력하세요..");
					}
					System.out.println();
				}
			} else if (select == '2') {
				System.out.println("python를 선택하셨습니다.");
				System.out.println();

				while (true) {
					System.out.println("[ python 메뉴 ]");
					System.out.println("1. python이란?");
					System.out.println("b. 뒤로가기");

					System.out.print("명령을 입력하세요: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();

					if (select == 'b') {
						break;
					} else if (select == '1') {
						System.out.println("python이란 ... 입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요!!");
						scanner.nextLine();
					} else {
						System.out.println("해당 명령은 없습니다.");
						System.out.print("다시 입력하세요..");
					}
					System.out.println();
				}
			} else if (select == '3') {
				System.out.println("javascript를 선택하셨습니다.");
				System.out.println();

				while (true) {
					System.out.println("[ javascript 메뉴 ]");
					System.out.println("1. javascript란?");
					System.out.println("b. 뒤로가기");

					System.out.print("명령을 입력하세요: ");
					select = scanner.next().charAt(0);
					scanner.nextLine();

					if (select == 'b') {
						break;
					} else if (select == '1') {
						System.out.println("javascript란 ...입니다.");
						System.out.println("계속하시려면 엔터를 눌러주세요.");
						scanner.nextLine();
					} else {
						System.out.println("해당 명령은 없습니다.");
						System.out.println("다시 입력하세요..");
					}
					System.out.println();
				}
			} else {
				System.out.println("해당 명령은 보기에 없습니다.");
				System.out.print("다시 입력하세요.");
				scanner.nextLine();
			}

			System.out.println();

		}

		System.out.println("프로그램 종료");

	}

}
