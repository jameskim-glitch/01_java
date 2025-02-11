package edu.kh.basic;

// 초록색 글씨 

// 한 줄 주석 (컴파일러가 해석하지 않는 부분)

// Hello world!

/*
a
b
c
d
*/



// class : 자바코드가 작성되는 영역
public class JavaTest {
	
	// main 작성후 ctrl + space
	// main 메서드 : 자바 어플리케이션(프로그램)을 실행하기 위해서
	//				반드시 필요한 구문
	public static void main(String[] args) {
		// 실행 단축키 : ctrl + f11
		System.out.println("Hello world!");
		System.out.println("오늘 저녁은 뭐먹지");
		System.out.println("12345");
		System.out.println("출력 단축키는 syso+ctrl+space");
		System.out.println("오 신기해");
		
		//ctrl + alt + 방향키(위 아래) : 방향키 방향으로 해당 줄 복사
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");

		System.out.println("1 + 2");// 1 + 2
		System.out.println(1+2); // 3
		System.out.println(12*13);
		System.out.println(10/5);
		System.out.println(12%2); // 0 %는 나머지
		System.out.println("14*19="+266); // "" 뒤에 +를 쓰면 이어쓰기가 된다
		System.out.println("14*19="+14*19); // * 를 하면 그 수를 계산됨
		System.out.println("90 + 70 + 65 =" + 90 + 70 + 65); // + 기호를 이어쓰기 용으로 쓰기 때문에
		System.out.println("90 + 70 + 65 =" + (90+70+65)); // 괄호로 다시 감싸주면 이어쓰기와 더하기를 혼용할 수 있다.
		System.out.println("A" + "B");
	}
	
	
}

	
	
