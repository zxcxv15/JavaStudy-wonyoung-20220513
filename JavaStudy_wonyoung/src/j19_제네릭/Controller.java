package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {

	// Object를 사용하여 모든 객체를 리턴 받을 수 있다.
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234");
		// 생성할 때 자료형을 바꿀 수 있다.
	}

	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보수정(나이) 성공", 45);
	}

	// 제네릭의 와일드카드 --> 어떤 자료형이 될지모른다.
	public CMRespDto<?> getUser() {
		User user = new User();
		user.setUsercode("1"); // equals 비교
		user.setName("홍길동");
		user.setPassword("123");
		user.setName("홍길동");
		user.setEmail("aaa@naver.com");
		if (user.getUsercode().equals("1")) { // equals 비교
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);

		} else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	public CMRespDto<? extends Animal> getAnimal(){
		Animal animal = new Animal();
		
		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다", (Human)animal);
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "호랑이입니다", (Tiger)animal);
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal);
		}
	}
}
