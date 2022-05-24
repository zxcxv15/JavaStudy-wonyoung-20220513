package j08_클래스;
/*
 * 1. Car 클래스를 만든다.
 * 2. Car 클래스의 속성(변수)   제조사(company), 모델(model), color(색상)
 * 3. Car 클래스의 기능(메소드)	
 * 
 *  showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 *  showInfoAll() ->
 *  제조사: KIA
 *  모델: K5
 *  색상: 화이트
 *  getCar() -> return "KIA_K5_화이트" main에서 출력
 *  setColor() -> 매개변수에 색상을 받아서 color 변수의 값을 변경
 *  
 *  KIA, K7, 블랙 -setColor(블루)
 *  현대자동차, 소나타, 화이트 -setColor(그레이)
 *  Tesla, Model3, 레드 -setColor(그린)
 */

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.company = "KIA";
		car1.model = "K7";
		car1.color = "블랙";
		car1.showCompanyInfo();
		car1.showInfoAll();
		car1.getCar();
		car1.setColor("블루");
		car1.showInfoAll();

		
		System.out.println("==============================");
		
		Car car2 = new Car();
		car2.company = "현대자동차";
		car2.model = "소나타";
		car2.color = "화이트";
		car2.showCompanyInfo();
		car2.showInfoAll();
		car2.getCar();
		car2.setColor("그레이");
		car2.showInfoAll();

		
		
		System.out.println("==============================");
		
		Car car3 = new Car();
		car3.company = "테슬라";
		car3.model = "모델3";
		car3.color = "레드";
		car3.showCompanyInfo();
		car3.showInfoAll();
		car3.getCar();
		car3.setColor("그린");
		car3.showInfoAll();

	}

}
