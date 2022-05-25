package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserSevice;

public class UserManagementController {
	//
	private UserSevice userSevice; // 선언 되어져 있으니 지역변수에서도 쓸 수 있다

	public UserManagementController() {
		userSevice = new UserSevice(); 	// 1생성 다른 지역변수 메소드에서도 써야되니까 전역변수 안에 만들어 준다.
	}									

	public void createUser() {
		User user = userSevice.insertUser(); 

		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}

	public void updateUser() {

	}

}
