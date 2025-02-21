package edu.kh.oop.method.run;

import edu.kh.method.model.service.MemberService;
import edu.kh.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodExample methodEx = new MethodExample();
		//methodEx.method1();
		MemberService service = new MemberService();
		service.displayMenu();
		
		// method2() 메서드 호출
		// method1() 메서드 실행
		// main 메서드 실행
		
		// LIFO 후입선출
	}

}
