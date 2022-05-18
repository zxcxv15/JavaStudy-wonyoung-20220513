package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		//버퍼:  버퍼(buffer)에 값을 임시로 저장해두었다가 한번에 출력하게 해준다.
		// next() -> 스페이스바,엔터를 포함 X
		// nextLine() -> 스페이스바,엔터를 포함
		
		//버퍼에 이름,나이...저장하다가 nextLine을 만나게 되면 다음 입력값으로 넘어감 -> nextLine은 스페이스바,엔터를 포함하니까.
		System.out.print("이름: ");
		name = scanner.next(); 				//엔터 날리고
		System.out.print("나이: ");
		age = scanner.nextInt();			//날리고
		System.out.print("전화번호: ");
		phone = scanner.next();				//날리고
		scanner.nextLine(); 				//넘어감을 방지하려고 하나 넣어서 엔터를 미리 날려줌
		System.out.print("주소: ");
		address = scanner.nextLine();		//포함되니까 다음으로 넘어감
		System.out.print("성별: ");
		gender = scanner.next().charAt(0);
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + name);
		System.out.println("전화번호: " + name);
		System.out.println("주소: " + name);
		System.out.println("성별: " + name);
		
	}

}
