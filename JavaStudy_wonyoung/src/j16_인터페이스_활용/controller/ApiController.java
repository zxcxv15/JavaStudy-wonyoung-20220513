package j16_인터페이스_활용.controller;

import j16_인터페이스_활용.service.UserService;

public class ApiController {

	private final UserService userService; // 무조건 생성자에서 대입을 해줘야 한다.

	public ApiController(UserService userService) { // final = 선언을 하였으면 생성되는 시점에 무족건 값을 줘야한다.
		this.userService = userService;
	}

	public void addUser() {
		System.out.println("사용자 추가");
		userService.create();
	}

	public void getUser() {
		System.out.println("사용자 정보 가져오기");
		userService.read();
	}

	public void modifiUSer() {
		System.out.println("사용자 정보 수정");
		userService.update();
	}

	public void removeUSer() {
		System.out.println("사용자 삭제");
		userService.delete();
	}

}
