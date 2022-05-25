package j10_클래스기본정리.repository;

/*
 * Entity(독립체) Class 
 * 
 * 정보를 담는 객체를 Entity 객체라고 한다.
 * 
 */

public class User {
	private String usercode;
	private String email;
	private String name;
	private String username;
	private String password;
	
	//기본 생성자 생략되있다 굳이 ?? => 생성자 오버로딩이 되면 기본 생성자는 비활성화 된다. 오버로딩을 하면 무족건 있어야 된다.
	public User() {}
	
	//생성자 오버로딩 => 전체 생성자
	public User(String usercode, String email, String name, String username, String password) {
		this.usercode = usercode;
		this.email = email;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	//getter, setter
	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//toString 
	@Override
	public String toString() {
		return "User [usercode=" + usercode + ", email=" + email + ", name=" + name + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}
