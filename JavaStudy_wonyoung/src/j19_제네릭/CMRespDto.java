package j19_제네릭;

/*
 * 제네릭 --> 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // --> getter, setter, equalsAndHashCode를 하나로 쓸 수 있게끔 만들어 놓은것
public class CMRespDto<T> { // <T>: 타입(자료형)
	private int code;
	private String msg;
	private T date;
}
