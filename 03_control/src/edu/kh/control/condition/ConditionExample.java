package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스

	Scanner sc = new Scanner(System.in); // 필드

	// 생성자

	// 메서드

	public void ex1() {

		// if 문
		// 조건식이 true 일때만 내부 코드 수행
		// 입력 받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력

		System.out.println("정수 입력 :");
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수입니다.");
		}

		if (input < 0) {
			System.out.println("음수입니다");

		}
	}

	public void ex2() {

		// if - else 문
		// 조건식 결과가 true 면 if문
		// false 면 else 구문이 수행된다

		// 홀짝검사
		// 입력받은 정수값이
		// 홀수이면 홀수입니다 출력
		// 0이면 "0입니다" 출력
		// 짝수이면 짝수입니다 출력
		// 중첩 if 문 사용

		System.out.print("정수 입력 :");
		int input = sc.nextInt();

		if (input % 2 != 0) {
			System.out.println("홀수입니다");
		} else {// 짝수 혹은 0 입력 수행
				// 중첩 if 문
			if (input == 0) {
				System.out.println("0 입니다");
			} else
				System.out.println("짝수입니다");
		}
	}

	public void ex3() {

		// if (조건식) - else if (조건식) - else (조건식 없음)

		// 양수인지 음수인지 0인지 판별

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수입니다.");
		} else if (input < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}

	}

	public void ex4() {
		// 달 (month) 을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15 이하: "한파 경보") (-12도 이하 : "한파 주의보")
		// 3~5 봄
		// 6~8 여름(35도 이상 : "폭염 경보") (33도 이상 : "폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아닐땐 "해당하는 계절이 없다" 출력
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 수행
		
		if(month ==1 || month ==2 || month == 12 ) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			if(temperature <= -15) {
				// 겨울 한파 경보
				season += " 한파 경보";
				// season = season + "한파 경보"
			} else if (temperature <=-12) {
				season += "한파 주의보"; // 겨울 한파 주의보
			} //else 는 필요 없으면 작성 안해도 된다.
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >=6 && month <= 8) {
			season = "여름";
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			if(temperature >= 35) {
				// 여름 폭염 경보
				season += " 폭염 경보";
				// season = season + "폭염 경보"
			} else if (temperature >= 33) {
				season += "폭염 주의보"; // 여름 폭염 주의보
						}
		} else if (month >=9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
					}
		System.out.println(season);
		
		
	}

	public void ex5() {
		
		// 나이를 입력받아
		//13세 이하면 "어린이 입니다"
		//13세 초과 19세 이하면 "청소년 입니다
		// 19세 초과시 "성인입니다" 출력
			
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;// 결과값 담을 변수 선언
		
		if (age <=13) {
			result = "어린이 입니다.";
		} else if (age <= 19){// 위에서 어린이는 if 문으로 걸러짐 {}	
			result = "청소년 입니다.";
		} else {
			result = "성인입니다.";//한줄 이라면 {} 생략 가능.
		}
		System.out.print(result);
	}

	public void ex6() {
		// 점수 (100점 만점)을 입력받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		
		//0 점미만, 100좀 초과 : "잘못 입력하셨습니다" 출력
		
		//[실행화면]
		//점수 입력 : 60
		//D
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String ggg;
		
		if (score < 0 || score > 100) { // 범위에서 벗어난 조건부터 처리
			ggg = "잘못 입력하셨습니다.";
		}else if (score > 90){
			ggg = "A";
		}else if (score > 80){
			ggg = "B";
		}else if (score > 70){
			ggg = "C";
		}else if (score > 60){
			ggg = "D";
		}else 
			ggg = "F";
				System.out.println(ggg);
	}
	
	public void ex7() {
		//놀이기구 탑승 제한 검사
		//나이가 12세 이상, 키 140.0 이상일 경우에만 "탑승가능
		//나이가 12세 미만인 경우 : "적정 연령이 아닙니다."
		//키가 140.0 미만 : "적정 키가 아닙니다"
		//나이가 0세 미만, 100세 초과시 : 잘못 입력하셨습니다
		
		//[실행화면]
		//나이 입력 : 10
		//키 입력 : 160
		//적정 연령이 아닙니다
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
				//System.out.print("키 입력 : ");
				//double height = sc.nextDouble();
				String result;
				
				if (age < 0 || age >100) {
					result = "잘못 입력하셨습니다";
				} else System.out.print("키 입력 : ");
				double height = sc.nextDouble();
				
				if (age < 12) {
					result = "적정 나이가 아닙니다.";
				} else if (height < 140) {
					result = "적정 키가 아닙니다.";
				} else {
					System.out.println("탑승 가능");
				}
				//틀린 내가 짠 코드
				//} else if (age <12) {
					//result = "적정 나이가 아닙니다";
				//} else if (height < 140) {
					//result = "적정 키가 아닙니다";
				//} else {
					//result = "탑승 가능";
				//}
				//System.out.println(result);
	}
	
	public void ex8() {
// 놀이기구 탑승 제한 검사 프로그램
// 조건 - 나이 : 12세 이상
// - 키 : 140.0cm 이상
// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
// 나이 O , 키 O : "탑승 가능"

// [실행화면]
// 나이 입력 : 130
// 나이를 잘못 입력 하셨습니다

// 나이 입력 : 30
// 키 입력 : 300
// 키를 잘못 입력 하셨습니다

// 나이 입력 : 20
// 키 입력 : 110
// 나이는 적절하나, 키가 적절치 않음

// 나이 입력 : 10
// 키 입력 : 150
// 키는 적절하나, 나이가 적절치 않음

// 나이 입력 : 10
// 키 입력 : 110
// 나이와 키 모두 적절치 않음

// 나이 입력 : 15
// 키 입력 : 160
// 탑승 가능!!!
		System.out.print("나이 입력 : ");
		int input1 = sc.nextInt();
		String result; // 변수 선언
		if(input1 <0 || input1 >100) {
			result = "나이를 잘못 입력하셨습니다.";			
		}else { // 나이를 0~100 범위로 잘 입력한 경우
			System.out.print("키 입력 : ");
			double input2 = sc.nextDouble();
			
			if(input2 < 0 || input2 >250.0) {
				result = "키를 잘못 입력하셨습니다.";
			} else if (input1 < 12 && input2 < 140.0) {
				result = "나이와 키 모두 적절치 않음";
				} else if (input1 <12) {
					result = "키는 적절하나, 나이가 적절치 않음";
			}else if(input2 < 140.0) {
				result = "나이는 적절하나, 키가 적절치 않음";
			}else { // 나이 O, 키 O (그 외 조건 생각하기 : 변수를 선언만 했을때)
				result = "탑승 가능!!";
			}
		}System.out.println(result);//맨 마지막에 넣는거 잊지 말기
	}			

	


	public void ex9() {
	// swich 문
	// 여러 case 중 하나를 선택하여 수행하는 조건 문
	
	// 요일번호 입력(1~7) : 3
	// 수요일
	
	System.out.print("요일번호 입력 : ");
	int day = sc.nextInt();
	
	switch(day) {
	case 1 : System.out.println("월요일"); break;
	case 2 : System.out.println("화요일"); break;
	case 3 : System.out.println("수요일"); break;
	case 4 : System.out.println("목요일"); break;
	case 5 : System.out.println("금요일"); break;
	case 6 : System.out.println("토요일"); break;
	case 7 : System.out.println("일요일"); break;
	default : System.out.println("잘못된 입력이다."); break;//디폴트에서는 없어도 된다.
	}
}
	
	public void ex10() {
		// 점수 입력(0~100) : 85
		// 학점 B
		
		System.out.print("점수입력 (0~100) : ");
		// 정수범위 벗어난 건 생각 X
		int score = sc.nextInt();
		
		switch(score / 10) { // 점수를 10 으로 나눈 몫을 기준으로 학점 구분
		case 10:
		case 9 : System.out.println("학점 A"); break;
		case 8 : System.out.println("학점 B"); break;
		case 7 : System.out.println("학점 C"); break;
		case 6 : System.out.println("학점 D"); break;
		default : System.out.println("학점 F"); 


		}
		
	}
}
