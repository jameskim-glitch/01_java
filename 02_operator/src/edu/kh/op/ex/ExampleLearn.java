package edu.kh.op.ex;
// 실행용 클래스 (메인 메서드 존재)
public class ExampleLearn {

	
	// 메인 메서드 필수 작성
	public static void main(String[] args) {
		
		OpExample opEx = new OpExample();
		
		// OpExample 생성
		// -> OpExample 이라는 클래서(설계도)를 이용해서
		// 객체를 생성하는데, 그 객체 이름이 opEx 다.
		// 같은 패키디(edu.kh.op.ex) 안에 있는 클래스는
		// import 하지 않아도 자유럽게 불러다 쓸 수 있다.
		
		opEx.ex2();
		// opEx가 가지고 있는 기능(메서드)중 ex1 이름의 메서드를 호출(실행)
		// ctrl 누르고 메서드에 마우스를 클릭하면 이동됨.
		 
		opEx.ex3();
		
		opEx.ex4();
		
	}

}
