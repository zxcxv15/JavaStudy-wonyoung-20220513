package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserSevice;

public class UserManagementController {
	//
	private UserSevice userSevice; // 선언 되어져 있으니 지역변수에서도 쓸 수 있다
	private User[] users;

	public UserManagementController() {
		userSevice = new UserSevice(); // 1생성 다른 지역변수 메소드에서도 써야되니까 전역변수 안에 만들어 준다.
		users = new User[2];
	}

	public void createUser() {
		int indexResult = findEmptyInUsers();
		//0 또는 1이 넘어 오겠지
		if (indexResult != -1) {
			users[indexResult] = userSevice.insertUser();

			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
		} else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다.");
		}
	}
	//외부에서 쓸 일이 없다
	private int findEmptyInUsers() {
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				return i; // 0 , 1
			}
		}
		return -1;
	}

	public void updateUser() {

	}

}
