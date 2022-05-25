package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserSevice;

public class UserManagementCoontroller {
	private UserSevice userSevice;
	
	public UserManagementCoontroller() {
		userSevice = new UserSevice();	// 다른 지역 메소드에서도 써야되니까 전역변수 안에 만들어 준다.
	}

	public void createUser() {
		System.out.println("여기호출?");
		User user = userSevice.insertUser();
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}

	public void getUser() {

	}

	public void updateUser() {

	}

	public void deleteUser() {

	}

}
