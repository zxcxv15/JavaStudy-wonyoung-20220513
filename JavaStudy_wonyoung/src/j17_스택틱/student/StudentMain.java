package j17_스택틱.student;

public class StudentMain {
	public static void main(String[] args) {
		// 1.매개변수 3가지를 받을 수 있는 생성자가 필요하다.
		Student student1 = new Student("장원영", 1);
		Student student2 = new Student("장원일", 3);
		Student student3 = new Student("장원이", 3);
		Student student4 = new Student("장원삼", 2);
		Student student5 = new Student("장원사", 1);
		
		student1.studentInfo();
		student2.studentInfo();
		student3.studentInfo();
		student4.studentInfo();
		student5.studentInfo();
		

	}
}
