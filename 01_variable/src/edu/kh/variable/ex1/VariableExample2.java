package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 자바 기본자료형 8가지
 *  논리형 boolean(1byte)
 *  정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
 *  실수형 : float(4byte), double(8byte)
 *  문자형 : char(2byte, 유니코드)
 * 
 *  참조형 - 문자형 String(대문자에 유의)
 * */
		// 변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는것. 
		// 변수 값 대입 : 변수에 값을 집어 넣는것
		
		boolean booleanData; // 변수의 선언
		// 메모리에 논리 값(true / false)을 저장할 공간을 1byte 할당하고, 할당된 공간의 이름을 booleanData 라고 정하겠다 라는 뜻.
		
		booleanData = true; // booleanData 변수에 true 논리값 집어넣기(대입)
		
		System.out.println("booleanData : "+ booleanData);
		
		
		
		byte byteNumber = 127; // 128을 넣는 순간 error (값의 범위가 -128~127 까지 이기 때문)
		// 메모리에 정수값을 저장할 공간을 1byte 할당하고, 할당된 공간을 byteNumber 라고 부르겠다.
		// 선언된 byteNumber 변수에 처음으로(초기 값) 127을 넣음
		// 초기화 --> 처음 변수에 값을 대입
		
		short shortNumber = 32767;//32768 을 넣는 순간 error
		
		//정수 자료형 기본형 int (short, byte 는 옛날 코드 잔재. 거의 사용 안함)
		int intNumber = 2147483647; //217483648 을 넣으면 에러
		
		//자료형(int) 변수명(intNumber) 대입연산자(=) 리터럴(값)
		// 프로그래밍에서 대입되는 데이터(값 자체)를 리터럴 이라는 단어로도 표현함.
		// 자료형에 따라서 리터럴 표기값이 다르다.
		
		long longNumber = 10000000000L; // long 의 리터럴을 입력할때는 마지막에 L(대소문자 상관없음) 을 넣어줘야 한다.
		// L이 아니면 int 값으로 인식해서 에러 메세지가 나옴.
		
		float floatNumber = 1.2345f; // float 도 마지막에 f(대소문자 상관없음)을 넣어주지 않으면 double 값으로 인식해서, 에러가 난다.
		
		double doubleNumber = 3.141592; 
		//double 이 실수형 중에서 기본형
		//리터럴 표기법 없는 실수는 자동으로 double 로 인식.
		//D(대소문자 상관 없음)로 인식시킬수 있다.
		
		//문자형(char) 리터럴 표기법 : ' '(홑 따옴표)
		// -> 문자 단 하나
		
		char ch = 'A'; //쌍따옴표를 쓰면 string 으로 인식해서 에러남.
		char ch2 = 66;
		
		System.out.println("ch = " + ch);
		System.out.println("ch2 = " + ch2);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		 *  컴퓨터네는 문자표가 존재하고 있음
		 *  숫자에 따라 지정된 문자 모양이 각각 매핑되고
		 *  'B' 문자 그대로 대입되면 변수에 숫자 66 으로 변환되어 저장
		 *  -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것도 가능함
		 */
		
		// 변수 명명 규칙
		
		//1. 대소문자 구분, 길이 제한 없음.
		
		int abcde12345678;
		int abcdE12345678;
		
		//2. 예약어 사용 X(변수등의 이름으로 지정된 것들)
		//double final;
		
		
		//3. 숫자로 시작하면 안된다.
		//char 1ac;
		char ab541651c;
		
		//4. 특수문자중에 $,_ 만 사용가능(보통 사용하지 않는다)
		int $intNumber; // 문제없음
		int _intNumber; // 자바는 카멜표기법 사용
						// _ 작성 표기법은 DB에서 사용
						// 자바의 상수에서 사용
						// MEMBER_NAME
		
		//5. 카멜표기법(맨 처음 소문자 시작, 후속 단어 첫글자 대문자)
		char helloWorldAppleBananaTomato;
		
		//6. 변수명은 언어를 가리지 않는다(하지만 쓰지 않는다)
		
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		final double PI_VALUE = 3.14;
		
		//PI_VALUE = 2.33;
		
		/*
		 * 상수(항상 같은 수)
		 * - 변수 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입할 수 없음
		 * - 자료형 앞에 final 키워드를 작성
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성시 _ 사용 
		 * 
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 
		 * */
		
		final int MIN_AGE = 1;
		final int MAX_AGE = 130;
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		System.out.println(1 + 1.3);
		
	}

}
