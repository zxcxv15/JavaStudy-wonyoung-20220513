package j17_스택틱.student;

/*
 * student_code(정수)
 * student_name(이름)
 * student_year(학년)
 * 
 * 학생을 한명 생성할때마다 자동으로 student_code의 값이 1씩 증가하여 부여될 수 있게 작성.
 * 20220001
 * 20220002
 * 
 * static = 공유 
 */
public class Student {
	private static int auto_increment = 2022000;
	private int student_code;
	private String student_name;
	private int student_year;
	
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment; // 기본값이 2022000 --> 학생1,2,3,4...를 생성될떄만 1씩 더해준다
		this.student_name = student_name;
		this.student_year = student_year;
	}
	
	//이거 대신 toString을 활용해서 사용할 수 있다.
	public void studentInfo() {
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + student_name);
		System.out.println("학년: " + student_year);
		System.out.println();
	}




}
