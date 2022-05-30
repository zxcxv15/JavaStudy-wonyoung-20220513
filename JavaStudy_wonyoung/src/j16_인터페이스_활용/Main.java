package j16_인터페이스_활용;

import j16_인터페이스_활용.controller.ApiController;
import j16_인터페이스_활용.service.Auth2UserSertvice;
import j16_인터페이스_활용.service.AuthUserSertvice;

public class Main {

	public static void main(String[] args) {
		ApiController companyA = new ApiController(new Auth2UserSertvice());
		companyA.addUser();
		companyA.getUser();
		companyA.modifiUSer();
		companyA.removeUSer();
	}

}
