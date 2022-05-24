package j08_클래스;

public class Car {
	String company;
	String model;
	String color;
	
	//생성자 => 1.반환값: 무족건 메모리 주소를 반환한다. 2.클래스명이랑 이름이 같다 3.반환자료형이 생략되어있다(주소값을 무족건 반환하기 때문에) 
	
	void showCompanyInfo() {
		System.out.println(company + "회사에서 제조된 차량입니다.");
	}

	void showInfoAll() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}

	String getCar() {
		return company + "_" + model + "_" + color;
	}

	void setColor(String color) {
		this.color = color; // this = 자기 자신 주소
	}
}
