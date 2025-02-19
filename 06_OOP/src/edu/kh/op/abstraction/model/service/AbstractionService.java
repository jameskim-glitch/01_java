package edu.kh.op.abstraction.model.service;

import edu.kh.op.abstraction.model.vo.People;

// service : 특정 기능(비즈니스 로직) 을 제공하는 패키지 or 서비스
// 비밀번호 -> 암호화 파일 -> 유효한 파일 걸러내는 작업 ..
public class AbstractionService {

	// 속성
	// 기능 
	public void ex1() {
		// people 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(==참조변수)
		// new People : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형 처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형" 이라고 부른다!!
		
		//int[] arr = new int[5];
		
/*
 * 
	p1.name = "홍길동";
	p1.gender= '남';
	p1.pNumber = "123456-1234657";
	p1.address = "서울시 중구 남대문로 120";
	p1.phone = "010-1234-1234";
		p1.age = 20;
		//필드명으로 들어가는건 직접 접근이고, 이건 캡슐화를 어긴것.
		  p1.tax();
		  p1.vote();
		  System.out.println("p1의 name : " + p1.name);
		  System.out.println("p1의 gender : " + p1.gender);
		//System.out.println("p1의 gender : " + (int)p1.gender);
		//char 타입 jvm 기본값 은 0
		// 유니코드 문자체계에서 0은 공백을 나타냄
		// -> int 형으로 강제 형 변환 하면 0인것을 확인할 수 있음
		System.out.println("p1의 pNumber : " + p1.pNumber);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);*/
		
		// 전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setPumber("123456-1234567");
		p1.setAddress("서울시 중구 남대문로 120");
		p1.setPhone("010-0000-1111");
		p1.setAge(20);
		System.out.println(p1.getGender());		
		System.out.println(p1.getPumber());
		System.out.println(p1.getGender());		
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());		
		System.out.println(p1.getPhone());		
		System.out.println(p1.getAge());	
		

	
	
	// 본인객체
	// people 클래스 이용하여 본인 이름 객체 생성하기
	// 본인 정보 setter 값 대입
	// getter 이용해서 콘솔창 출력까지
	People 김동준 = new People();

	김동준.setName("김동준");
	김동준.setGender('남');
	김동준.setPumber("890712-1023819");
	김동준.setAddress("경기도 고양시 일산서구 일산로636번길 52 1203동 401호");
	김동준.setPhone("010-7383-1972");
	김동준.setAge(35);
	System.out.println(김동준.getGender());		
	System.out.println(김동준.getPumber());
	System.out.println(김동준.getGender());		
	System.out.println(김동준.getName());
	System.out.println(김동준.getAddress());		
	System.out.println(김동준.getPhone());		
	System.out.println(김동준.getAge());
	}
}
