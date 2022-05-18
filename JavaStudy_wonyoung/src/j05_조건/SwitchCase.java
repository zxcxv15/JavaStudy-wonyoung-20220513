package j05_조건;

public class SwitchCase {

	public static void main(String[] args) {
		// 해당 변수를 찾아서 그 밑에꺼까지 같이 출력된다({} 가 없어서 쭉 실행) - > 그래서 중간에 break를 넣어줘야 해당 케이스만 실행
		// default = else와 같은 역할을 한다
		int num = 29;
		char c = 'd';
		String str = "김준형";
		switch (num / 10) { // 연산 가능
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
			default:
				System.out.println("찾을 수 없음");
			}
		switch (c) {
			case 'a':
				System.out.println("case a");
				break;
			case 'b':
				System.out.println("case b");
				break;
			case 'c':
				System.out.println("case c");
				break;
			default:
				System.out.println("찾을 수 없음");	
		}
		switch (str) {
			case "장원영":
				System.out.println("case 장원영");
				break;
			case "박준형":
				System.out.println("case 박준형");
				break;
			case "한재안":
				System.out.println("case 한재안");
				break;
			default:
				System.out.println("찾을 수 없음");	
		}
	}

}
