package edu.kh.op.abstraction.run;

import edu.kh.op.abstraction.model.service.AbstractionService;

public class AbstactionRun { // 실행용 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 서비스 클래스 객체 생성
		AbstractionService as = new AbstractionService();
		
		// 객체에서 ex1() 메서드 호출
		as.ex1();
		
	}

}
