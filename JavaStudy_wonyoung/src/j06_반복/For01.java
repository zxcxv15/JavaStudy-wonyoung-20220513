package j06_반복;

public class For01 {
	
	//while -> 자유로운 반복
	//for -> 규칙적인 반복
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		for(int i = 0; i < 10; i++) { // 반복 횟수
			System.out.println(10 - i); // 여기서 조건 고민
		}
	}

}
