package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car { // 전기차
	
	private int batteryCapacity; // 배터리 용량
	
	//ctrl + space = 자동완성
	public Tesla() {
		// TODO Auto-generated constructor stub
	}
	// 매개변수 생성자 + 상속받은 것도 포함
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	// car.toString() 오버라이딩(재정의)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + batteryCapacity;
	}
	
}
