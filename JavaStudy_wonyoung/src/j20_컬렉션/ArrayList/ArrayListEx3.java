package j20_컬렉션.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.entity.Student;

/*
 * 1.Student 자료형을 담을 수 있는 ArrayList를 생성.
 * 
 * 2.학생정보 추가
 * studentCode	name	schoolName
 * 2022001	   	김준일 	부산교육대학원
 * 2022002		곽나경	부산대학교
 * 2022003		정현경	부경대학교
 * 2022004		한재안	부산대학교
 * 2022005		전주홍	동아대학교
 * 
 * 3.전체 학생 정보 출력
 * 
 * 4.인덱스 3의 위치에 삽입
 * 2022006		한대경	서울대학교
 * 
 * 5.인덱스 2의 위치에 있는 학생의 학교명을 고려대학교로 수정
 * 
 * 6.인덱스 5의 위치에 있는 학생의 정보를 수정
 * 20220007		김나예	부산여중
 * 
 * 7.인덱스 0의 위치에 있는 학생의 정보를 삭제
 * 
 * ArrayList: 저장할 수 있는 공간 
 */
public class ArrayListEx3 {
	public static void main(String[] args) {
		
		// 1
		ArrayList<Student> studentsList = new ArrayList<Student>();
		
		Student s = new Student(2022001, "김준일", "부산교육대학교");
		
		// 2
		studentsList.add(s);
		studentsList.add(new Student(2022002, "곽나경", "부산대학교"));
		studentsList.add(new Student(2022003, "정현경", "부경대학교"));
		studentsList.add(new Student(2022004, "한재안", "부산대학교"));
		studentsList.add(new Student(2022005, "전주홍", "동아대학교"));
		// 3
		System.out.println(studentsList);
		System.out.println(studentsList.contains(s));
		// 4
		studentsList.add(3, new Student(2022006, "한대경", "서울대학교"));
		// 5
		studentsList.get(2).setSchoolName("고려대학교");
		// 6
		studentsList.set(5, new Student(2022007, "김나예", "부산여중"));
		// 7
		studentsList.remove(0);
		System.out.println(studentsList);

	}

}
