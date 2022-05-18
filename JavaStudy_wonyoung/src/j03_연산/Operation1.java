package j03_연산;

public class Operation1 {

	public static void main(String[] args) {
		// 증감연산자('++', '--')
		// ++,--선증가 , 후증가++,--
		int num = 10;
		System.out.println(num++); 
		System.out.println(num);
		System.out.println(++num);
		
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num);

	}

}
