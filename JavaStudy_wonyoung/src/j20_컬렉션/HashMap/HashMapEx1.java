package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx1 {

	public static void main(String[] args) {
		// 두개의 제네릭 --> 따로 따로 사용하겠다.
		// k 값이 중복 될 수 없다. --> 제일 마지막 값으로 출력된다.
		// k값이 중복 x 순서 x --> k값이 다르면 중복 가능
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();

		// 값 추가
		studentMap.put(20, "김준일");
		studentMap.put(10, "김준이");
		studentMap.put(22, "김준삼");
		studentMap.put(33, "김준사");
		studentMap.put(44, "김준오");

		System.out.println(studentMap);

		// key로 value(값) 가져오기
		System.out.println(studentMap.get(10)); // -->0번째 키 값

		// 수정
		studentMap.put(10, "김준육"); // --> key 값이 없을 경우 추가됨
		studentMap.replace(10, "김준철"); // --> 그냥 수정만 됨

		// 삭제
		studentMap.remove(10);

		// 순서가 없으니 iterator을 사용해서 하나씩 확인 가능
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
//			if (value.equals("김준오")) {
//				System.out.println(studentMap.get(key));
//			}
			System.out.println(value);
		}

		// 람다식(함수형 프로그래밍)
		studentMap.forEach(
				(k, v) -> {
			System.out.println("key :" + k);
			System.out.println("value :" + v); 
		});
		
		System.out.println(studentMap.containsKey(22));
		System.out.println(studentMap.containsValue("김준구"));
		
	}

}
