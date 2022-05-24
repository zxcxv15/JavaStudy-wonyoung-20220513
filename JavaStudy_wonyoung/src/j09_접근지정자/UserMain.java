package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();

		student.setName("장원영");
		System.out.println(student.getNmae()); // => getName에 있는 값을 가져와라(매개변수가 필요 없다 -> 그냥 return 값만 가져오면 되니 자료형만 같으면 된다)
		
		teacher.setName("김준이");
		teacher.setAddress("부산");
		teacher.setPhone("010-9988-1916");
		teacher.showInfo();
		
	}

}
