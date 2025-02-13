package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1(){
		/*키보드로입력받은정수가양수이면서
		 *짝수일때만“짝수입니다.”를출력하고
		 *짝수가아니면“홀수입니다.“를출력하세요.
		 *양수가아니면“양수만입력해주세요.”를출력하세요
		 * [실행화면1]
		 * 숫자를한개입력하세요: 8
		 * 짝수입니다.*/
		System.out.print("숫자를 한개 입력하세요. : ");	
		int input = sc.nextInt();
		if(input <= 0) {
			System.out.println("양수만 입력해 주세요");
		} else {
		switch(input%2) {
		case 0 : System.out.println("짝수입니다");break;
		case 1 : System.out.println("홀수입니다");break;
		
		//stirng result; 결과 저장용 변수 선언
		//if( input <= 0)
		//result = "양수만 입력해 주세요"
		//else if (input %2 == 0)
		// result = "짝수입니다"
		//else 
		//result = "홀수입니다"
	}
	
}
	}
	public void practice2(){
	/*국어, 영어, 수학세과목의점수를키보드로입력받고합계와평균을계산하고
합계와평균을이용하여합격/ 불합격처리하는기능을구현하세요.
 (합격조건: 세과목의점수가각각40점이상이면서평균이60점이상일경우)
합격했을경우과목별점수와합계, 평균, “축하합니다, 합격입니다!”를출력하고
불합격인경우에는“불합격입니다.”를출력하세요.*/
	 
	 System.out.print("국어점수 : ");
	 int kor =  sc.nextInt();
	 System.out.print("수학점수 : ");
	 int math = sc.nextInt();
	 System.out.print("영어점수 : ");
	 int eng = sc.nextInt();
	 
	 //int sum = kor + math + eng;
	 // double avg = sum / 3.0;
	 double average;
	 average = (kor + math + eng)/3;
	 if (kor < 40 || eng < 40 || math < 40 || average < 60) {
		 System.out.println("불합격 입니다.");}
		 else {
			 System.out.println("국어 :" + kor);
			 System.out.println("수학 :" + math);
			 System.out.println("영어 :" + eng);
			 System.out.println("평균 :" + average);
			 System.out.println("축하합니다, 합격입니다!");
		 }
	 }
	public void practice3() {
		/*메소드명: public void practice3(){}
 1~12 사이의수를입력받아해당달의일수를출력하세요.(2월윤달은생각하지않습니다.)
잘못입력한경우“OO월은잘못입력된달입니다.”를출력하세요. (switch문사용)
 [실행화면1]
 1~12 사이의정수입력: 8
 8월은31일까지있습니다.
 [실행화면2] 
1~12 사이의정수입력: 99
 99월은잘못입력된달입니다*/
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1 : System.out.println("1월은 31일 까지 있습니다."); break;
		case 2 : System.out.println("2월은 28일 까지 있습니다."); break;
		case 3 : System.out.println("3월은 31일 까지 있습니다."); break;
		case 4 : System.out.println("4월은 30일 까지 있습니다."); break;
		case 5 : System.out.println("5월은 31일 까지 있습니다."); break;
		case 6 : System.out.println("6월은 30일 까지 있습니다."); break;
		case 7 : System.out.println("7월은 31일 까지 있습니다."); break;
		case 8 : System.out.println("8월은 30일 까지 있습니다."); break;
		case 9 : System.out.println("9월은 30일 까지 있습니다."); break;
		case 10 : System.out.println("10월은 31일 까지 있습니다."); break;
		case 11 : System.out.println("11월은 30일 까지 있습니다."); break;
		case 12 : System.out.println("12월은 31일 까지 있습니다."); break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		// case : 1 case : 3 case : 7  case : 8 case : 10 case 12  
		// System.out.println(month + "월은 31일 까지 있습니다")
		// case : 4 case : 6  case : 9 case : 11 
		// System.out.println(month + "월은 30일 까지 있습니다")
		// case 12  
		// System.out.println(month + "월은 28일 까지 있습니다")
		// defalut : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}
	public void practice4() {
	/*키, 몸무게를double로입력받고BMI지수를계산하여계산결과에따라
저체중/정상체중/과체중/비만을출력하세요.
 BMI = 몸무게/ (키(m) * 키(m))
 BMI가18.5미만일경우저체중/  18.5이상23미만일경우정상체중
BMI가23이상25미만일경우과체중/  25이상30미만일경우비만
BMI가30이상일경우고도비만
[실행화면]
키(m)를입력해주세요: 1.65
몸무게(kg)를입력해주세요: 58.4
 BMI 지수: 21.45087235996327
정상체중
*/
		System.out.print("키(m)를 입력해 주세요: ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);//하나하나 쓸 필요 없음.
		
		//String result; 
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi <= 1.85 && bmi >23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >=25 && bmi <30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}		
}
	public void practice5() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를입력하고
		 * Pass 또는Fail을출력하세요.
		 * 평가비율은중간고사20%, 기말고사30%, 과제30%, 
		 * 출석20%로이루어져있고
		 * 이때, 출석횟수는총강의횟수20회중에서
		 * 출석한날만따진값으로계산하세요.
		 * 70점이상일경우Pass,70점미만이거나
		 * 전체강의에30% 이상결석시Fail을출력하세요*
		 * 
		 *  [실행화면1]
*중간고사점수: 80
*기말고사점수: 30
과제점수: 60
출석횟수: 18
 ================= 결과=================
중간고사점수(20) : 16.0
기말고사점수(30) : 9.0
과제점수(30) : 18.0
출석점수(20) : 18.0
총점: 61.0
 Fail [점수미달]
 * [실행화면3]
중간고사점수: 100
기말고사점수: 80
과제점수: 40
출석횟수: 10
 ================= 결과=================
 Fail [출석횟수부족(10/20)]
*/
		System.out.print("중간고사점수 :");
		int middle = sc.nextInt();
		System.out.print("기말고사점수 :");
		int finale = sc.nextInt();
		System.out.print("과제점수 :");
		int exam = sc.nextInt();
		System.out.print("출석횟수 :");
		int att = sc.nextInt();
		double midscor = middle * 0.2;//=* 을 사용했으면 
		//변수를 추가할 필요 없었다.
		double finscor = finale * 0.3;
		double examscor = exam * 0.3;
		double attscor = att;
		double score = midscor+finscor+examscor+attscor;

		if (att<17) {
			System.out.println("Fail [출석횟수 부족(" + att + "/20)");
		} else {
			System.out.println(" ================= 결과=================\r\n"
					+ "");
			System.out.println("중간고사점수(20) :" + midscor);
			System.out.println("기말고사점수(30) :" + finscor);
			System.out.println("과제점수(30) : " + examscor);
			System.out.println("출석점수 (20) : "+ attscor);
			System.out.println("총점 :" + score);
		if (score < 70) {
			System.out.println("Fail [점수 미달]");
			
		} else System.out.println("PASS");
		}
		
	}
	
}

//전체적으로 result 를 만들지 않고 
//그냥 프린트 아웃을 만들어서 손해를 본게 많았다.
//이러면 추후 수정도 힘들어지니 result 만드는걸 중요하게 보자.

		
		









 














