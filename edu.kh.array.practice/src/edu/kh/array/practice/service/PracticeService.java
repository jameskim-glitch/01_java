package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeService {
Scanner sc = new Scanner(System.in);
	public void practice1(){
		int sum = 0;
		int[] prac1;
    prac1 = new int[9];
    for(int i = 0; i < prac1.length; i++) {
    	prac1[i] = i+1;
    	if (i % 2 == 0) {
    		sum += prac1[i];
    	}
    }
        	System.out.println(Arrays.toString(prac1));
System.out.println("짝수 번째 인덱스 합: " + sum);
        		
        	}
	public void practice2() {
		int sum = 0;
		int[] prac2;
    prac2 = new int[9];
    for(int i = 0; i < prac2.length; i++) {
    prac2[i] = prac2.length - i;
if (i % 2 != 0 ) {
sum += prac2[i];
}

}
  System.out.println(Arrays.toString(prac2));
System.out.println("홀수 번째 인덱스 합 : "+ sum);  }
	public void practice3() {
	System.out.print("양의 정수 :");
	int input = sc.nextInt();
	int[] prac3 = new int[input];
	for(int i = 0;i<input;i++) {
		prac3[i] = i+1;

	}
	    	System.out.println(Arrays.toString(prac3));

}
	public void practice4() {
	    int[] prac4 = new int[5];

	    for (int i = 0; i < prac4.length; i++) {
	        System.out.print("입력" + i + ":");
	        int input1 = sc.nextInt();
	        prac4[i] = input1;
	    }

	    System.out.print("검색할 값 입력: ");
	    int search = sc.nextInt();

	    boolean found = false; // 검색 결과 플래그

	    for (int x = 0; x < prac4.length; x++) {
	        if (search == prac4[x]) {
	            System.out.println("인덱스 값 :" + x);
	            found = true; // 검색 결과 플래그를 true로 설정
	            break; // 값을 찾았으면 반복문 종료
	        }
	    }

	    if (!found) { // 검색 결과 플래그를 확인하여 메시지 출력
	        System.out.println("일치하는 값이 존재하지 않습니다.");
	    }
		
	}
	public void practice5() {
        System.out.print("문자열: ");
        String word = sc.next();
        char[] words = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            words[i] = word.charAt(i);
        }

        System.out.print("문자: ");
        char ap = sc.next().charAt(0);

        int count = 0;

        System.out.printf("%s에 %c가 존재하는 위치 : ", word, ap);

        for (int i = 0; i < words.length; i++) {
            if (words[i] == ap) {
                System.out.print(i + " "); // 위치 출력
                count++;
            }
        }
        System.out.println(); // 줄바꿈

        System.out.print(ap + " 개수 : " + count);
        }
	public void practice6() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int[] prac6= new int[input];
		int sum = 0;
		for(int i = 0; i < prac6.length;i++) {
			System.out.print("배열" + i + "번째 넣을 값 : ");
		int input1 = sc.nextInt();
		prac6[i] = input1;
		sum += input1;
		}
		System.out.println(Arrays.toString(prac6));
		System.out.println("합계: " + sum);
	}
	public void practice7() {
		System.out.print("주민등록번호(-포함): ");
        String word = sc.next();

        char[] prac7 = word.toCharArray(); // char 배열 선언 및 초기화

        for (int i = 0; i < prac7.length; i++) {
            if (i > 7) { // 8번째 문자(index 7)부터 *로 변경
                prac7[i] = '*';
            }
        }

        System.out.println(Arrays.toString(prac7)); 
}
	public void practice8() {
		/* 3이상인홀수를입력받아배열의중간까지는1부터1씩증가하여
		 * 오름차순으로값을넣고,
		 * 중간이후부터끝까지는1씩감소하여
		 * 내림차순으로값을넣어출력하세요.
		 * 단, 입력한정수가홀수가아니거나3 미만일경우
		 * “다시입력하세요”를출력하고
		 * 다시정수를받도록하세요*/
        int input;

        while (true) { // 입력 검증 반복문
            System.out.print("정수 입력 : ");
            input = sc.nextInt();

            if (input >= 3 && input % 2 != 0) { // 3 이상 홀수 조건 만족
                break; // 반복문 종료
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] prac8 = new int[input]; // 배열 선언 및 초기화 (반복문 밖에서)

        for (int i = 0; i < prac8.length; i++) {
            if (i <= input / 2) { // 중간까지는 오름차순
                prac8[i] = i + 1; // 1부터 시작
            } else { // 중간 이후부터는 내림차순
                prac8[i] = input - i;
            }
        }

        System.out.println(Arrays.toString(prac8)); // 배열 출력
}
	public void practice9() {
		int[] prac9 = new int[10];
		for(int i=0;i<10;i++) {
			prac9[i] = (int)(Math.random() * 10) + 1;
		}
	System.out.println("발생한 난수 :" + Arrays.toString(prac9));
	}			
	public void practice10() {
		int[] prac10 = new int[10];
		for(int i=0;i<10;i++) {
			prac10[i] = (int)(Math.random() * 10) + 1;

			}			
        int max = prac10[0]; // 배열의 첫 번째 요소로 초기화
        int min = prac10[0]; // 배열의 첫 번째 요소로 초기화

        for (int i = 1; i < 10; i++) { // 두 번째 요소부터 비교 시작
            if (prac10[i] > max) {
                max = prac10[i];
            }
            if (prac10[i] < min) {
                min = prac10[i];
            }
        }	
	System.out.println("발생한 난수 :" + Arrays.toString(prac10));
	System.out.println("최대 값 :" + max);
	System.out.println("최소 값 : " + min);
		}
	public void practice11() {
        int[] prac11 = new int[10];

        for (int i = 0; i < 10; i++) {
            prac11[i] = (int)(Math.random()*10) + 1; // 1부터 10까지의 난수 생성

            for (int x = 0; x < i; x++) { // 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사
                if (prac11[i] == prac11[x]) { // 난수 값을 비교
                    i--; // 중복된 난수가 발생했으므로 다시 생성
                    break; // 중복 검사 루프 종료
                }
            }
        }

        System.out.println("발생한 난수 : " + Arrays.toString(prac11));
}
	public void practice12() {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int x= 0; x < i; x++) {
				if (lotto[i] == lotto[x]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	public void practice13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String word = sc.next();

        char[] charArray = new char[word.length()]; // 문자 배열 생성
        int charCount = 0; // 문자 개수

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // 현재 문자 이전의 문자들과 비교하여 중복 확인
            boolean found = false;
            for (int j = 0; j < charCount; j++) {
                if (charArray[j] == currentChar) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                charArray[charCount++] = currentChar;
            }
        }

        System.out.print("문자열에 있는 문자: ");
        for (int i = 0; i < charCount; i++) {
            System.out.print(charArray[i]);
            if (i < charCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("문자 개수: " + charCount);
        }
	public void practice14() {
        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print(" " + (i + 1) + "번째 문자열: ");
            arr[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            char answer = sc.nextLine().charAt(0);

            if (answer == 'N' || answer == 'n') {
                break;
            } else if (answer == 'Y' || answer == 'y') {
                System.out.print("더 입력하고 싶은 개수: ");
                int addSize = sc.nextInt();
                sc.nextLine(); // 버퍼 비우기

                String[] tempArr = Arrays.copyOf(arr, arr.length + addSize); // 배열 확장

                for (int i = arr.length; i < tempArr.length; i++) {
                    System.out.print(" " + (i + 1) + "번째 문자열: ");
                    tempArr[i] = sc.nextLine();
                }
                arr = tempArr; // 확장된 배열로 교체
            } else {
                System.out.println("잘못된 입력입니다. Y 또는 N을 입력해주세요.");
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}