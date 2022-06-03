package j17_스택틱.싱글톤;
/*
 * 싱글톤 특징
 * 1. 생성자는 private로 지정하여 외부에서 생성 할 수 없게 만들어야 한다.
 * 2. 싱글톤으로 설계된 클래스의 유일한 instance를 return해줄 수 있는 
 * 		getInstance() static() 메소드가 존재해야 한다.
 * 
 * 3. 싱글톤 instance를 저장할 변수명이 instance인 static 변수가 존재해야 한다.
 */

public class Singleton {
	// 클래스 이름과 동일
	// static 메소드에서는 일반 변수는 쓸 수 없다(생성 필요 x) --> 생성이 필요한 변수는 쓸 수 없다.
	private static Singleton instance;
	private int count; 

	private Singleton() { // 2.생성자를 만들수 없도록 무족건 private
		
	}

	public static Singleton getInstance() { // Singleton getInstance = 가져다 쓸 수 있음
		//3.만약의 상황을 대비해서 getInstance가 호출 되기 전에 인스턴스가 null인지 체크부터 해
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤 테스트" + count);
	}
}
