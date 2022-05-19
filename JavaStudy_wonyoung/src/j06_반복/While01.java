package j06_반복;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		// i += 1; 복합대입 연산: +=, -=, *=, /= ... -> 값을 바꿀수 있고 i++은 무족건 1씩 증가
		
		while (i < 100) { // 조건식이 참일때 반복 실행		
			result += (i + 1);
			i++; // 조건 변화 수식  -> 반복의 젤 끝에
		}
		System.out.println(result);

	}

}
