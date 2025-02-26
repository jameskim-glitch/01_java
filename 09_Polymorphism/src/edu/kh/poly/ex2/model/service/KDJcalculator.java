package edu.kh.poly.ex2.model.service;
// extends : 확장하다 , implements : 구현하다
// (부) 클래스 - (자) 클래스 : extends 사용
// (부) 인터페이스 - (자) 인터페이스 : extends 사용
// (부) 인터페이스 - (자) 클래스 : implements 사용
// (부) 클래스 - (자) 인터페이스 : 상속 불가

// The type KDJcalculator must implement the inherited abstract method Calculator.minus(int, int)

public class KDJcalculator implements Calculator, TestInterface {

	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		Calculator.super.display();
	}

	}
	

