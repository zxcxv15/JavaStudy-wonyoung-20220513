package j15_인터페이스;

public class BeamProjector implements Hdmi {

	@Override
	public void connect() {
		System.out.println("빔프로젝트 연결");
	}

	@Override
	public void disconnet() {
		System.out.println("빔프로젝트 해제");
		
	}

}
