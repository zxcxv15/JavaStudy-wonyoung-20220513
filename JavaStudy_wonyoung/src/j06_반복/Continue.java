package j06_반복;

public class Continue {

	public static void main(String[] args) {
		// Continue => 계속 실행
		// break => 멈춰라
		
		for (int i = 0; i < 10; i++) { 
			if (i % 2 == 0) { // 짝수일 때 continue 해라 -> 홀수만 출력 되겠지
				continue; // -> 5일때 밑에 print를 넘어가고 다음 반복으로 넘어가 계속 실행해라
			}
			System.out.println(i);
		}

	}

}
