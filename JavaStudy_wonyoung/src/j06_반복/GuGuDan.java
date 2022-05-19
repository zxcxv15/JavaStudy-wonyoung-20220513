package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) { //  0~8 => 0 1 2 3 4 5 6 7 
			System.out.println((i + 2) + "단"); // 2단부터 시작 => +2
			for (int j = 0; j < 9; j++) { // 0~9 => 0 1 2 3 4 5 6 7 8 
				System.out.println((i + 2) + " x " + (j + 1) + " = " + (i + 2) * (j + 1));
			}
			System.out.println();
		}
	}
}
