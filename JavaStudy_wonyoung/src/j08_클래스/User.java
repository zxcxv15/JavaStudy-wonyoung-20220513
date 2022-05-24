package j08_클래스;

public class User {
	String name;
	String age;
	String phone;
	String address;
	
	User(){ //기본 생성자
		System.out.println("생성.");
	}
	//오버로딩 => 자료형,개수,매개변수가 다르면 쓸 수있다.
	User(String name){ //사용자 정의 생정자
		this.name = name;
	}
	
	User(String name,String age, String phone, String address){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	void setName(String name) { //메서드가 호출 되면 name의 값이 들어간다.
		System.out.println("setName 메소드 안에서 호출: " + this);
		this.name = name; // 어떤 name인지 구분이 안된다 -> this.name(자기 자신의 주소)
	}
}
