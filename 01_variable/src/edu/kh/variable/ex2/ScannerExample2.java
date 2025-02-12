package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 둘째자리 까지만 표현
		// 입력받아 : Scanner 필요
		// 출력 : print 필요
		// ctrl + shift + O : 현재 파일에서 임포트 되지 않은 클래스를 모두 임포트 해주는 단축키
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 : sc.nextInt();
		// 실수 : sc.nextDouble();
		
		System.out.print("첫번째 실수 입력 : ");
		double input1 = sc.nextDouble();
		
		System.out.print("두번째 실수 입력 : ");
		double input2 = sc.nextDouble();
		
		// + - * /
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2);
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2);
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2);
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2);
		
		
		
		
		
		
	}

}
