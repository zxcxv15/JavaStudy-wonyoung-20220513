package j13_다형성;

/*
 * 공장
 * 1.smartFactory,ComputerFactory = 공장이니 Factory에서 상속을 받는다.
 */

public class Factory {
	public void start() {
		System.out.println("공장을 가동합니다.");
	}
}

/*
 * 업캐스팅은 상속이 되어져 있어야 가능
 * 
 * 
 * 다운캐스팅
 */
