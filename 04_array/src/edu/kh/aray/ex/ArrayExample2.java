package edu.kh.aray.ex;

import java.util.Arrays;

public class ArrayExample2 {

	// 얕은 복사
	// 주소를 복사하여 서로 다른 두 참조변수가 
	// 하나의 배열 (또는 객체)을 참조하는 상태를 만드는 복사 방법.
	public void shallowCopy() {
		
		int[] arr = {1, 2, 3, 4, 5};//arrays 는 클래스를 가져오는거라 임포트 필요
		
		// 얕은 복사 진행
		
		int[] copyArr = arr; //
		
		System.out.println("변경 전");
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소: " + copyArr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : "+ Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경
		
		copyArr[2] = 999;
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : "+ Arrays.toString(copyArr));
	}
	public void deepCopy() {
		// 깊은 복사 (deep copy) 
		// -> 같은 자료형의 새로운 배열을 만들어서
		// 기존 배열의 데이터를 모두 복사하는 방법
		
		int[] arr = {1,2,3,4,5}; // 원본
		// 1. for 문을 이용한 깊은 복사
		
		int[] copyArr1 = new int[arr.length]; // 5칸 짜리 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			copyArr1[i] = arr[i];
			
			System.out.println("arr 주소 : " + arr);
			System.out.println("copyArr1 주소 : " + copyArr1);
			
			System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("copyArr1 : "+ Arrays.toString(copyArr1));
			
		// 2. System.arraycopy(원본배열, 원본 복사 시작 인덱스, 복사 배열, 복사배열의 삽입 시작 인덱스, 복사의 길이)
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		
		// 3. 복사할 배열 참조변수 = Arrays.copyOff(원본배열, 복사할 길이)
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println("copyArr3 : "+ Arrays.toString(copyArr3));
		
		// 값 변경후 확인
		
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4]= 5000;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : "+ Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : "+ Arrays.toString(copyArr3));
		}
		}
	public void createLottoNumber() {
	//1. 1~45 사이 중복되지 않은 난수 6개 생성
	//2. 생성된 난수가 오름차순으로 정렬
	//[5,11,13,18,24,25]
	
	//1) 정수 6개를 저장할 배열 선언 및 할당
	int[] lotto = new int[6];
	//2 생성된 배열(lotto)을 처음부터 끝까지 순차 접근하는 for 문 작성
	for(int i = 0; i < lotto.length; i++) {
		//3 1~45 난수 생성
		int random = (int)(Math.random() * 45 + 1); // 1~45
		//4 생성된 난수를 순서대로 배열 요소에 대입
		lotto[i] = random;
		
		//5) 중복 검사를 위한 for 문 작성
		for(int x = 0; x < i; x++) { // 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사

			if(random == lotto[x]) {
				i--;
				// i가 1씩 증가할 때 마다 난수가 하나 생성됨
				//-> 중복값이 있으면 난수를 새로 하나 더 생성해야 함
				// -> i값을 인위적으로 1 감소시켜서, 난수 발생의 기회를 한번 더 주는것.
			break;
			// 앞쪽에서 중복데이터를 발견하면
			// 남은 값은 비교할 필요 없다
			// -> 효율 향상을 위해서 중복 검사용 for문 종료
			}
		}
		
	}
	
	// 정렬은 되어 있지 않지만, 중복 제거가 된 배열이 완성됨
	
	//7) 오름차순 정렬
	//--> 선택, 삽입, 버블, 퀵 등등
	// --> 자바가 정렬 방법을 미리 만들어서 제공하고 있음
	// Arrays.sort(배열명) : 배열 내 요소값 들이 오름차순 정렬됨.
	Arrays.sort(lotto);
	// 결과 출력
	System.out.println(Arrays.toString(lotto) );

}
}