package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserSevice {

	private Scanner scanner;

	public UserSevice() {
		scanner = new Scanner(System.in);
	}
	//return의 자료형(User)
	public User insertUser() {
		showInsertView(); // 1. 메서드 호출
		//insertUser에서 사용하려고 만든 변수
		String usercode = null; 
		String email = null;
		String name = null;
		String username = null;
		String password = null;

		System.out.print("사용자번호입력: ");
		usercode = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("사용자이름: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();

		//User형태로 반환해라  // User 클래스에 있는 User생성자
		//새로운 유저를 생성해준다
		//전체 생성자를 호출해라 그리고 리턴해라.
		User user = new User(usercode, email, name, username, password);
		return user;
	}

	private void showInsertView() { 
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}

}
