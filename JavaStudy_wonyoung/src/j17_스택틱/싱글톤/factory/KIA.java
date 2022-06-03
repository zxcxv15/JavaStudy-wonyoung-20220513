package j17_스택틱.싱글톤.factory;
//싱글톤 예제
public class KIA {
	
	private static KIA instance; //1
	private int serial_auto_increment = 2022000; //  기본 값
	
	private KIA() {} //2
	
	public static KIA getInstance() { //3
		if(instance == null) {
			instance = new KIA();
		}
		return instance; 
	}
	
	public Car createCar(String model) {
		return new Car(++serial_auto_increment, KIA.class.getSimpleName(), model);
	}
	
	public void carInfo(Car car) {
		System.out.println(car.toString());
	}
}
