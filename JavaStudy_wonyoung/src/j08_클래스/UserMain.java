package j08_클래스;

public class UserMain {

	public static void main(String[] args) {
		User user1 = new User();
		System.out.println("첫번째: " + user1.name);
		System.out.println("메인메소드에서 호출: " + user1);
		// ser1.name = "장원영";
		user1.setName("aaa");
		System.out.println("두번째: " + user1.name);
		
//		User user2 = new User("장원영", "27", "010-2028-3850", "부산광역시");
//		System.out.println(user2.name);
//		System.out.println(user2.age);
//		System.out.println(user2.phone);
//		System.out.println(user2.address);
//		
	}

}
