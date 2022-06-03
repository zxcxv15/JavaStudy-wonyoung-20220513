package j18_최상위클래스;

import java.util.Objects;

/*
 * Object class(최상위 클래스) --> 모든 객체(모든 클래스는 오브젝트 클래스이다)
 */

public class Teacher {
	private String name;
	private String subject;
	private int age;

	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	

	@Override
	public int hashCode() { // hashCode = 주소값, int자료형 -->16 진수로 바꿔 준 것.
		return Objects.hash(age, name, subject);
	}
	


	//비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 현재 자기자신의 주소와 비교대상의 주소를 비교
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass()) //getClass :해당 클래스의 있는 모든 정보를 가져온다(instanceof랑 같은 역할)
			return false;
		Teacher other = (Teacher) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}



	@Override // 정보를 담는 클래스(엔티티클래스)에서 많이 사용된다.(모든 클래스에서 사용하기 위해 오버라이딩해서 사용한다)
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Teacher) {
//			Teacher teacher = (Teacher) obj;
//			if (this.name.equals(teacher.name) && this.subject.equals(teacher.subject)
//					&& this.age == teacher.age) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	@Override
//	public String toString() {	// 리턴에 변수들의 정보를 넣어준다.(마냥 toString을 리턴하면 주소값이 출력된다.)	
//		return "이름: " + name + ", 과목: " + subject; // 부모의 toString을 호출한다 --> object 클래스(부모)
//	}

}
