package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		//ArrayList: 순서가 있고 값의 중복을 허용한다.,toString(안에 어떤값이 있는지)을 지원한다.
		//컬렉션이라는 클래스를 상속받는다
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> nameList2 = new ArrayList<String>();
		
		// 리스트에 값 추가 --> add()
		nameList.add("김준일"); // String 자료형만 넣을 수 있다.
		nameList.add("곽나경");
		nameList.add("김서홍");
		nameList.add("최보성");
		nameList.add("박준형");
		nameList.add("강주현");
		nameList.add("유재원");
		
		// 리스트 중간에 값 삽입 --> add()
		nameList.add(0, "이동영");
		
		//리스트 내의 해당 인덱스 값 수정 --> set()
		nameList.set(1, "장원영");
		
		//리스트 내에서 인덱스로 값 삭제 --> remove()
		nameList.remove(3);
		
		//리스트 내에서 값(object)으로 바로 삭제
		nameList.remove("강주현");
		
		//리스트에서 리스트2로 값 옮기기(깊은 복사)               얕은복사 = 주소값 복사 , 깊은복사 = 안에 있는 값을 모두 복사(주소가 다르다)
		nameList2.addAll(nameList); // 해당 리스트 모두 복사
		//nameList2.addAll(0, nameList2); // 해당 위치 사이에서 부터 쭉 복사
		//nameList2.removeAll(nameList2); // 이 리스트에 있는거를 모두 지워라
		
		//리스트에 모든 값 확인 --> toString()
		System.out.println(nameList);// toString이 생략되있는거다
		
		//리스트에 값 가져오기 --> get(인덱스 번호)
		System.out.println(nameList.get(3)); 
		
		//리스트 내에서 원하는 값이 있는지 확인 --> contains(확인할 값)
		System.out.println(nameList.contains("김준일"));
		System.out.println(nameList.contains("장원영"));
		
		//리스트 내에 값이 하나라도 있으면 지우기 --> clear()
		if(!nameList.isEmpty()) { //isEmpty:리스트 안이 비었니?(return boolean)
			nameList.clear();
		}
		System.out.println(nameList);
		System.out.println(nameList2);
		
		//리스트를 배열로 변환
		Object[] objs = nameList2.toArray(); // 리턴값이 오브젝트라 오브젝트로 받아야된다.
		for(Object obj : objs) {
			System.out.println((String) obj);
		}
		
		
		
		
		
		
	}

}
