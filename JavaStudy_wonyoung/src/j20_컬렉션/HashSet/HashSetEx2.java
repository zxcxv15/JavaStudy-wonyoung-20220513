package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.entity.Student;

public class HashSetEx2 {
	/*
	 * HashSet<Student>
	 * 
	 * 20220001, 김준일, "부산대학교" 20220001, 김준이, "부경대학교"
	 * 
	 * 20220002의 코드를 가진 학생을 조회
	 * 
	 * 20220002의 코드를 가진 학생을 삭제
	 */

	public static void main(String[] args) {
		HashSet<Student> StudentSet = new HashSet<Student>();
		//객체의 주소를 set에 담는거 -> 학생 한명을 어디다 집어 넣는거(순서 이런거 아무것도 모름)
		StudentSet.add(new Student(20220001, "김준일", "부산대학교"));
		StudentSet.add(new Student(20220002, "김준이", "부경대학교"));
		
		
		//줄을 서라
		Iterator<Student> iterator = StudentSet.iterator(); //1.줄을 세움
		while (iterator.hasNext()) { // 방안에 줄서있는 사람이 있니?
			Student student = iterator.next(); //다음 학생 나와
			if (student.getStudentCode()==20220002) { // 나온 학생의 학번이 20220002니?
				System.out.println(student);
			}
		}
		// hasNext하면 다음은 비어 있으니 next 할게 없다 --> 다시 변수로 저장해줘야 한다.
		//변수에 안담으면 무한 반복하기 떄문에 변수로 저장 해줘야한다.
		iterator = StudentSet.iterator(); 
		while (iterator.hasNext()) { // 방안에 줄서있는 사람이 있니?
			Student student = iterator.next(); //다음 학생 나와
			if (student.getStudentCode()==20220001) { // 나온 학생의 학번이 20220002니?
				StudentSet.remove(student);
			}
		}

		System.out.println(StudentSet);

	}

}
