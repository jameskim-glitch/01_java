package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(); 한줄 출력용 메서드(출력 후 줄바꿈)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		//System.out.print(); 단순 출력용 메서드(출력 후 줄바꿈 X)
		System.out.print("테스트3");
		System.out.println(); // 내용없는 println() : 단순 줄바꿈
		System.out.print("테스트4");
		
		//줄바꿈 여부 차이점은 있지만 괄호 안의 내용이
		//그대로 출력된 다는 것은 똑같음.
		
		System.out.println(); // 바로 위에 print 사용했으므로 줄바꿈
		
		int iNum1 = 10;
		int iNum2 = 5; // 10 + 5 = 15
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));	
		
		System.out.printf("%d + %d = %d" , iNum1, iNum2, iNum1 + iNum2);
		
		System.out.printf("%d + %d = %d\n" , iNum1, iNum2, iNum1 + iNum2);
		//줄바꿈 : \n
		
		// 이스케이프 문자(escape caracter) 특별한 의미를 갖도록 하는 용도로 사용
		
		
		// System.out.printf("패턴", 패턴 자리에 각각 들어갈 값/변수 나열...)
		// %d : 정수형, %o : 8진수, %x : 16진수
		// %c : 문자, %s : 문자열
		// %f : 실수(소수점아래6자리), %e : 지수형태표현, %g : 대입값그대로
		// %A : 16진수실수
		// %b : 논리형
		
		//10 + 10 *5 / 2 = 35
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2, iNum1 + iNum1 * iNum2 / 2);
		
		//패턴 연습
		int iNum3 = 3;
		
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d\n", iNum3);// 5칸 공간 확보 후 왼쪽 정렬
		
		//소숫점 자리 제어 (반올림 처리)
		System.out.printf("%f\n", 10 / 4.0); // 2.500000
		System.out.printf("%.2f\n", 10 / 4.0); // 2.50 (소숫점 둘째 자리까지 표현)
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요";
		
		// false / 가 / 안녕하세요 출력
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);
	
		// \
		
		System.out.println("\\");
		
		// \o/
		
		System.out.println("\\o/");
		
		// \t : tab (한공간씩 표현 X, 한번에 공간 차지)
		System.out.println("a\tb\tc\td");
		
		// 유니코드 이스케이프
		System.out.println("\u0041");
		// 유니코드 (16진수)
		// 65를 16진수로 표현
		// 65 / 15 는 몫은 4, 나머지는 1
		
		
		
		
	}

}
