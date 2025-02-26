package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		// SmartPhone 객체 생성
		SmartPhone sp = new SmartPhone("Samsung", "Galaxy S20", 2020, 1200000, "Android", 128);
		//사용자정의자료형 참조변수명
		sp.printInfo(); // 오버라이딩 O -> SmartPhone(자식)에서 재정의한 메서드
		
		System.out.println("==========================================");
		
		// BasicPhone 객체 생성
		BasicPhone bp = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		bp.printInfo(); // 오버라이딩 X -> Phone(부모)의 메서드
		bp.checkKeyboard();
	}}
