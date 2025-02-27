package edu.kh.collection.pack1.model.service;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {
	// java.util.List 인터페이스 : List 에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// 인터페이스 객체생성 X, 부모 참조변수 0
	
	//java.util.ArrayList : 배열형태 List (가장 대표적인 List 자식 클래스
	
	// new ArrayList() : 기본 생성자 -> 기본 크기 10 짜리 리스트 생성
	// 하지만 리스트의 크기는 늘었다 줄었다 하기 때문에 큰 의미 없음.
	
	
	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>(); // 검색(조회) 효율적
	//private List<Student> studentList = new LinkedList<>(); // 추가, 수정, 삭제 효율적
	// 다형성 중 업 캐스팅 적용
	// 부모타입(List) 참조변수(studentList) = 자식객체(ArrayList) 주소
	
	private Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		studentList.add(new Student("홍길동", 23, "서울시 중구", 'M', 100));
		studentList.add(new Student("고영희", 23, "경기도 안산시", 'F', 100));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentList.add(new Student("오미나", 27, "충북 청주시", 'F', 70));
		studentList.add(new Student("박주희", 24, "서울시 서대문구", 'F', 100));

	}
	
	private List<Object> testList = new ArrayList<Object>();
	
	/*public void ex() {// List 테스트용 예제
		// List.add(Object e) : 리스트에 객체를 추가
		// 매개변수 타입이 Object == 모든 객체 매개변수로 전달할 수 있음.
		testList.add("문자열");
		testList.add(new Student("홍길동",25,"서울시 중구",'M', 90));
		testList.add(sc);
		testList.add(new Object());
		// 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다.
		
		// Object List.get(index) : 리스트에서 index 번째 인덱스에 있는 객체를 반환
		// 반환형이 오브젝트 == 모든 객체를 반환 할 수 있다
		
		System.out.println(testList.get(0) );
		System.out.println(testList.get(1) );
		System.out.println(testList.get(2) );
		System.out.println(testList.get(3) );
		
		//testList 에 꺼내온 인덱스 요소가 Student 혹은 상속관계인지 검사
		// 만약 Student 라면 이름을 꺼내오고 싶다.
		for(Object e : testList) {
			
			if(e instanceof Student) {
				System.out.println( ((Student)e).getName() );
			}
		}
	}*/
	
	/**
	* 메뉴 출력용 메서드
	 * alt + shift + j : 메서드 설명용 주석
	 * 
	 * @author 김동준(rbfyd@hotmail.com)
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	public void displayMenu() {
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			System.out.println("\n========학생 관리 프로그램===========");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); // Comparable 사용
			System.out.println("8. 이름순으로 정렬"); // Comparator 사용
			System.out.println("0. 프로그램 종료");

			System.out.print("메뉴 번호 선택 : ");
			
			try { 
				menuNum = sc.nextInt();
				sc.nextLine();
				switch(menuNum) {
				case 1 : System.out.println(addStudent()); break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(updateStudent());break;
				case 4 : removeStudent(); break;
				case 5 : /*searchName1*/break;
				case 6 : /*searchName2*/break;
				case 7 : /*sortByAge*/break;
				case 8 : /*sortByName*/break;
				case 0 :  System.out.println("프로그램 종료...");break;
				default : System.out.println("메뉴에 작성된 번호만 작성해 주세요");
				
				}
				
			} catch(InputMismatchException e){
				System.out.println("\n error : 입력형식이 유효하지 않습니다. 다시 시도해 주세요");
				sc.nextLine(); // 입력 버퍼에 남아있는 잘못된 코드 제거
				
				menuNum = -1; // 첫 반복시 잘못 입력하는 경우
				//menuNum 이 초기값인 0을 가지고 있어 반복문이 종료되는데
				// 이를 방지하기 위해서 임의값 -1 
			}
			
		} while(menuNum != 0) ;{
			
		}
		
		}
	/**
	 * @return// 삽입 성공시 "성공" , 실패시 "실패" 문자열 반환
		// 학생 정보 추가 메서드
	 */
	public String addStudent() {
		// Checked Exception  : 반드시 throws 구문이나 try - catch 처리 강제
		// IOException, sQLException...
		
		// UncheckedIOException : 강제 처리 X, 예외 발생하면 자동으로
		// 상위 호출 메서드로 예외가 전파됨
		//InputMismatchException, NullPointerException, 등등
		
		System.out.println("========학생 정보 추가========");
		
		System.out.print("이름 입력 : ");
		String name = sc.next();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();//입력버퍼 제거
		
		System.out.print("사는곳 입력 : ");
		String region = sc.nextLine();

		System.out.print("성별(M/F) 입력 : ");
		char gender = sc.next().charAt(0); // 'M' / 'F'

		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		// Student 새 객체 생성 후 studentList에 추가
		if (studentList.add(new Student(name, age, region, gender, score))) {
			return "성공";
		} else {
			return "실패";

		}
		
	}
	
	/**
	 *2. 학생 전체 조회 메서드
	 *
	 * - List 가 비어있는 경우 "학생 정보가 없습니다" 출력
	 * - 있는 경우 전체 학생 출력
	 */
	public void selectAll() {
		System.out.println("===========학생 전체 조회==========");
		
		// studentList 가 비어있는지 확인
		// List 에 저장된 데이터의 개수를 얻어오는 방법 : int List.size();
		
		//if(studentList.size() == 0) {
		// boolean List.isEmpty() : 컬렉션이 비어있다면 true 반환
		if(studentList.isEmpty()) {
			System.out.println("학생 정보가 없습니다.");
			return; // 현재 메서드를 종료하고 호출한 곳으로 돌아감.
		}
		// 일반 for 문
		//for(int i = 0; i < studentList.size(); i++) {// length() X
		//	System.out.println(studentList.get(i));
			
		//}
		// 향상된 for 문(for each문)
		// - 컬렉션, 배열의 모든 요소를 순차적으로 반복접근 할 수 있는 for 문
		
		int index = 0;
		for(Student std : studentList) {
			System.out.print((index++) + "번 : ");
			System.out.println(std);
		}
	}
	
	/**
	 * 3. 학생 정보 수정 메서드
	 * 
	 * - 학생 정보가 studentList 에 하나라도 있는지 검사.
	 * 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
	 * 인덱스 번호로 학생을 수정하려고 하는데
	 * 입력된 숫자가 0보다 작은지 검사
	 * 작다면 "음수는 입력할 수 없습니다" 반환
	 * 
	 * - studentList 범위 내 인덱스 번호인지 검사, 
	 * 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 반환
	 * 
	 * - 수정할 때
	 * 1.index 번 째에 저장된 학생 정보
	 * 수정 전 정보를 출력
	 * 
	 * 2.이름, 나이, 사는 곳 , 성별, 점수 수정할 값 입력받기
	 * 
	 * 3. 수정이 완료되었다면 "000의 정보가 변경되었습니다" 반환
	 * @return
	 */
	public String updateStudent() {
	 System.out.println("==========학생 정보 수정=============");
	 
	  System.out.print("인덱스 번호 : ");
	  int index = sc.nextInt();
	  
	  // 1) 학생 정보가 studentList 에 하나라도 있는지 검사
	  if(studentList.isEmpty()) {
		  return "입력된 학생 정보가 없습니다.";
	  } else if(index < 0 ){
		  return "음수는 입력할 수 없습니다";
	  } else if(index >= studentList.size()) {
		  return "범위를 넘어선 값을 입력할 수 없습니다";
	  } else {
		  // 수정 코드 작성
		  // 1. index 번째에 저장된 학생정보 출력
		  System.out.println(index + "번 째에 저장된 학생 정보");
		  System.out.println(studentList.get(index));
		  
		  //2 . 수정할 내용 입력받기
		  
		  	System.out.print("이름 입력 : ");
			String name = sc.next();
			
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();//입력버퍼 제거
			
			System.out.print("사는곳 입력 : ");
			String region = sc.nextLine();
			
			System.out.print("성별(M/F) 입력 : ");
			char gender = sc.next().charAt(0); // 'M' / 'F'
			
			System.out.print("점수 입력 : ");
			int score = sc.nextInt();
			
			// 입력받은 index번째에 수정할 학생정보를 세팅 -> 수정
			
			// index 번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장
			
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			
			return temp.getName() + "의 정보가 변경되었습니다.";
	  }
	}

	/**
	 * 4. 학생 정보 제거 메서드
	 * 수정과 같은 검사후
	 * 삭제 시 
	 * "정말 삭제하시겠습니까? (Y/N) : "
	 * 'Y' 를 입력했다면 해당 인덱스에 있는 객체 삭제후 
	 * "000 님의 정보가 제거되었습니다" 리턴
	 * 'N' 을 입력했다면 "취소" 리턴
	 * 
	 * @return
	 */
	public String removeStudent() {
		// StudentList.remove(int index);
		// 리스트에서 index 번째 요소를 제거
		// 이 때 제거된 요소가 반환됨
		// * List 중간에 비어있는 인덱스가 없게 하기 위하여
		// remove() 동작 시 뒤쪽 요소를 한칸씩 자동으로 당겨온다.
			 System.out.println("==========학생 정보 삭제=============");
			 
			  System.out.print("인덱스 번호 : ");
			  int index = sc.nextInt();
			  
			  // 1) 학생 정보가 studentList 에 하나라도 있는지 검사
			  if(studentList.isEmpty()) {
				  return "입력된 학생 정보가 없습니다.";
				  
			  } else if(index < 0 ){
				  return "음수는 입력할 수 없습니다";
				  
			  } else if(index >= studentList.size()) {
				  return "범위를 넘어선 값을 입력할 수 없습니다";
				  
			  } else {
				  System.out.print("정말 삭제하시겠습니까? Y/N : ");
				  char ch = sc.next().toUpperCase().charAt(0); // 순서 중요
				  // "y" -> "Y" -> 'Y'
				  
				  if(ch == 'Y') {
					  Student temp = studentList.remove(index);
					  return temp.getName() + "의 정보가 제거되었습니다.";
				  }
				  return "취소";
			  }
		
	}
}

