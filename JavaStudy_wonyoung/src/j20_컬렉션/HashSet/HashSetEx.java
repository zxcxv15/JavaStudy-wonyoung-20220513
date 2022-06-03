package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		// 중복 허용 x 순서 x
		name.add("김준일");
		name.add("김준이");
		name.add("김준삼");
		name.add("김준사");
		name.add("김준일");
		name.add("김준일");

		System.out.println(name);

		// 하나씩 차례대로 줄세워서 가지고 올 수 있게 출력
		Iterator<String> iterator = name.iterator();

		while (iterator.hasNext()) { // iterator에 next(다음값)가 있니 ? 처음에는 아무 것도 없는 곳을 가르키고 있다 -> next(값) -> next... 출력
										// -> 스택개념
			String name2 = iterator.next(); // 무족건 값을 선언 해줘야한다. 안해주면 그냥 next(다음값)으로 그냥 넘어감
			if (iterator.next().equals("김준이")) {
				System.out.println(iterator.next());
			}
		}
		name.remove("김준사");
		System.out.println(name);

		// HashSet: 수정이 불가능 하다. --> 수정하고 싶은 값을 삭제 후 다시 추가.

	}

}
