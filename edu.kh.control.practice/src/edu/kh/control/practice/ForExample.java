package edu.kh.control.practice;

import java.util.Scanner;

public class ForExample { // 기능제공용 클래스
	Scanner sc = new Scanner(System.in);//(ctrl+shift+o, 자동 임포트)

	
	public void ex1() {
		// 1~10 까지 콘솔에 출력하기
		
		for(int i = 1; i <= 10 ;i++) {
			// 수행될 코드(반복 수행될 코드)
			System.out.println(i);
		}
	}
	public void ex2() {
	// 영어 알파벳 A 부터 Z 까지 한줄로 출력
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);//강제 형변환
		}
		System.out.println("\n==========================");
		
		for(char  i = 'A'; i<= 'Z'; i++)
			System.out.print(i);
}
	public void ex3() {
	// 1부터 입력받은 수 까지 1씩 증가하며 출력
	System.out.print("번호 입력 : ");
	int input = sc.nextInt();
	for(int i = 1; i <= input; i++) {
		System.out.print(i);
	}
		
}
	public void ex4() {
		//정수 5개를 입력받아서 합계 구하기
		// [실행화면]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150
		
		int sum = 0;//합계 저장용 변수
		//밖에서 태어난 변수는 안으로 들어갈 수 있음.
		
		for(int i = 1;i <=5; i++) {
			System.out.print("입력" + i + ": ");
			int input = sc.nextInt();
			// sum 에 입력받은 input 값 누적
			// sum = sum + input
			sum += input;
			//안에서 태어난 변수는 밖으로 나갈 수 없음.
		}
		
		System.out.println("합계 : " + sum);
	}
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		//[실행화면]
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 (9) ... 20
		
		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) ... 20
		
		System.out.println("괄호를 표시할 배수 :");
		int num = sc.nextInt();
		for(int i = 1; i <= 20; i++) {
			if (i % num == 0) { //배수일때
				System.out.print("("+i+") ");
				}
			else {System.out.print(i+ " ");} // 배수가 아닐때
		}
		
		
		
		
	}
	public void ex6() {
		// [구구단 출력]
		// 2~9 사이 수를 하나 입력받아 해당 단을 출력
		// 단, 입력받은 수가 2~9 숫자가 아니라면 
		// "잘못 입력하셨습니다" 출력
		/*
		 * 단 입력 : 5
		 * 5 X 1 = 5
		 * 5 X 2 = 10
		 *  . . . 
		 *  5 X 9 = 45
		 *  
		 *  =========
		 *  단 입력 : -5
		 *  잘못 입력하셨습니다*/
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if (dan >= 2 && dan <= 9) {//2~9 사이일때
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		} else {//범위 밖 일때
			System.out.print("잘못 입력하셨습니다.");
		}
		
		
		
	}
	public void ex7() {
		// 숫자세기 count
		
		// 1부터 20까지 1씩 증가하면서
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 18 : 6개
		// 3의 배수 합계 : 63
		
		int count = 0; // n의 배수를 세기 위한 변수
		int sum = 0; // n 의 배수의 합계를 구하기 위한 변수
		String result = "";
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= 20; i++) {
			
			if(i % input == 0) { // 배수일때
				result += i + " ";	// 문자열도 중첩이 가능하다.
				count++; //갯수 세기
				sum += i; // 합계 누적
		}
		}
		System.out.printf("%s : %d\n",result , count);
		System.out.printf("%d의 배수 합계 : %d",input, sum);
	}
	public void ex8() {
	// 구구단 모두 출력하기
		for(int dan = 2; dan <= 9; dan++) { // 2~ 9단까지 차례대로 증가
			//1
			for(int num = 1; num <=9; num++) { //각 단에 곱해질 숫자, 1~9 까지 차례대로 증가
				System.out.printf("%d X %d = %2d  ",dan, num, dan*num);
			//2}
		}
			System.out.println();
}


	}
	public void ex9() {
		// 구구단 역순으로 출력하기
		for (int dan = 9; dan >=9; dan--) {
			for(int num = 1; num <=9; num++)
			System.out.printf("%d X %d = %2d  ",dan, num, dan*num);
		}
			System.out.println();
	}
	
}


