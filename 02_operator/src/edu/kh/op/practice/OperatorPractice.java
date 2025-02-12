package edu.kh.op.practice;

import java.util.Scanner;

// 기능 제공 클래스
public class OperatorPractice {

	public void practice1(){
		/*모든사람이사탕을골고루나눠가지려고한다. 
		 * 인원수와사탕개수를키보드로입력받고
		 * 1인당동일하게나눠가진사탕개수와
		 * 나눠주고남은사탕의개수를출력하세요.
		 * [실행화면]
		 * 인원수: 29
		 * 사탕개수: 100
		 * 1인당사탕개수: 3
		 * 남는사탕개수: 13
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 : ");
		int input1 = sc.nextInt();
		
		System.out.println("사탕개수 : ");
		int input2 = sc.nextInt();
		
		int out1 = input2 / input1;
		System.out.printf("1인당 사탕개수 : %d", out1);

		System.out.println();
		
		int out2 = input2 % input1;
		System.out.printf("남는 사탕개수 : %d", out2);
		
		}

	
	
	public void practice2(){
		/*이름: 홍길동
		 * 학년(정수만) : 3
		 * 반(정수만) : 4
		 * 번호(정수만) : 15
		 * 성별(남학생/여학생) : 남학생
		 * 성적(소수점아래둘째자리까지) : 85.75
		 * 3학년4반15번홍길동남학생의성적은85.75이다. 
		 * */ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String str1 = sc.nextLine();
		System.out.println("학년 : ");
		int input3 = sc.nextInt();
		sc.nextLine();
		System.out.println("반 : ");
		int input4 = sc.nextInt();
		sc.nextLine();
		System.out.println("번호 : ");
		int input5 = sc.nextInt();	
		sc.nextLine();
		System.out.println("성별 : ");
		String str2 = sc.nextLine();
		System.out.println("성적 : ");
		double input6 = sc.nextDouble();
		System.out.printf("%d 학년 %d 반 %d 번 %s %s 성적은 %.2f 이다.", input3, input4, input5, str1, str2, input6);
	}
	
	 public void practice3(){
		 /*메소드명: publicvoid practice3(){}
국어, 영어, 수학에대한점수를키보드를이용해정수로입력받고, 
세과목에대한합계(국어+영어+수학)와평균(합계/3.0)을구하세요.
 [실행화면]
국어: 60
영어: 80
수학: 40
합계: 180
평균: 60.0*/
			Scanner sc = new Scanner(System.in);
			System.out.println("국어 : ");
			int input7 = sc.nextInt();			
			System.out.println("영어 : ");
			int input8 = sc.nextInt();
			System.out.println("수학 : ");
			double input9 = sc.nextInt();
			double good1 = (input7 + input8 + input9);
			double sin = 3.0;
			double good2 = ((input7 + input8 + input9) / sin );
			System.out.printf("%.0f", (input7 + input8 + input9));
			System.out.println();
			System.out.printf("%.1f", ((input7 + input8 + input9)/3.0));

			
	 }
}


