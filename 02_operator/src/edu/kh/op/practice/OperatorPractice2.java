package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	public void ex() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		
		String personType = (age >= 20) ? "성인" : "미성년";
		System.out.println("저는 + personType + 입니다" );
		
		boolean isTeenager = (age >= 13) && (age <=19);
		System.out.println("청소년 입니까? " + isTeenager);
		
		
		boolean isSenior = (age >=65) || (age <= 12);
		System.out.println("노인이거나 어린이 입니까? " + isSenior);
		
		
	}

}
