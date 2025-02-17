package loop;

import java.util.Scanner;

public class LoopPractice {
Scanner sc = new Scanner(System.in);

public void practice1(){
	/*메소드명: public void practice1(){}
	 * 사용자로부터한개의값을입력받아1부터
	 * 그숫자까지의숫자들을모두출력하세요.
	 * 단, 입력한수는1보다크거나같아야합니다.
	 * 만일1 미만의숫자가입력됐다면“1 이상의숫자를입력해주세요“
	 * 를출력하세요.*/
	System.out.print("1이상의 숫자를 입력하세요 : ");
	int input = sc.nextInt();
	String result = "";
	if(input<1) {
		System.out.println("1 이상의 숫자를 입력해주세요");
	} else {
		for(int i= 1; i <= input; i++) {
			result += i + " ";
		} 
		System.out.println(result);
	}
	
}
public void practice2() {
	/*사용자로부터한개의값을입력받아
	 * 1부터그숫자까지의모든숫자를거꾸로출력하세요.
	 * 단, 입력한수는1보다크거나같아야합니다*/
	System.out.print("1이상의숫자를입력하세요 : ");
	int input1 = sc.nextInt();
	String result1 = "";
	if(input1 < 1) {
		System.out.println("1 이상의숫자를입력해주세요.");
	} else {
		for (int i=input1; i >=1; i--) {
			result1 += i + " ";
		}
		System.out.println(result1);
	}
}
public void practice3() {
	/* 1부터사용자에게입력받은수까지의
	 * 정수들의합을for문을이용하여출력하세요.
	 * ex.
	 * 정수를하나입력하세요: 8
	 *  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 *  */
System.out.print("정수를 하나 입력하세요 : ");
int input = sc.nextInt();
String result = "";
int sum = 0; // 합계용 변수

for (int i = 1; i <= input; i++) {
	sum += i;
	if(i == input) {
		System.out.println(i + "= ");
	} else {
		System.out.print(i + " + ");
	}
}






}
public void practice4() {
	/*사용자로부터두개의값을입력받아그사이의숫자를모두출력하세요.
	 * 만일1 미만의숫자가입력됐다면
	 * “1 이상의숫자를입력해주세요“를출력하세요.*/
	System.out.print("첫번째 숫자 : ");
	int first = sc.nextInt();
	System.out.print("두번째 숫자 : ");
	int second = sc.nextInt();
	String result4 = "";

	if(first<1 || second<1) {
		System.out.println("1 이상의 숫자를 입력해 주세요.");
	} else {
		if(first < second) {
			for(int i = first;i <= second; i++) {
				result4 += i +" ";
			}  
			}for (int i = second; i <= first; i++) {
				result4 += i+ " ";
		}
	}	System.out.println(result4);
	// 숫자가 큰것 작은걸 구분했으면, 그걸로 숫자를 대입했으면 더 쉬울 수 있었다.
	
	
	
	
}
public void practice5() {
	// 사용자로부터입력받은숫자의단을출력하세요.
/*숫자: 4
 ===== 4단=====*/
	System.out.print("숫자: ");
	int dan = sc.nextInt();
	System.out.printf("=========%d단==========\n",dan);
	if (dan >= 2 && dan <= 9) {
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
	}
	}
}
public void practice6() {
	/*사용자로부터입력받은숫자의단부터9단까지출력하세요.
	 * 단, 2~9를사이가아닌수를입력하면
	 * “2~9 사이숫자만입력해주세요”
	 * 를출력하세요.*/
	System.out.print("숫자 : ");
	int dan1 = sc.nextInt();
	int result = 0;
	if (dan1>9 || dan1<2) {
		System.out.println("2~9 사이 숫자만 입력해 주세요");
	} else {
		for(int i = dan1; i <= 9; i++){
			result = i;
			System.out.printf("=========%d단========\n", result);
			}
	}
}
public void practice7() {
	/*다음과같은실행예제를구현하세요.
 ex.
정수입력: 4
 *
 **
 ***
 ****
*/
	System.out.print("정수 입력 : ");
	int num3 = sc.nextInt();
	String star = "";
	for(int i = 1;i <= num3; i++) {
		star += "*";
		System.out.println(star);
		
		/* for(int row = 1; row <= input; row++){//1~4 까지 4번 반복
		 * for(int col = 1; col <= row; col++){
		 * System.out.print("*");
		 * }
		 * System.out.println();// 한 행의 모든 열 출력이 끝나면 줄바꿈
		 */
		
	}
}
public void practice8() {
	/*System.out.print("정수 입력 : ");
	int num4 = sc.nextInt();
	String star1 = "";
	
	for(int i = num4; i >= 0; i--) {
		star1 += "*";
		System.out.println(star1);*/
		
	//public void practice8() {
    System.out.print("정수 입력 : ");
    int num4 = sc.nextInt();

    for (int i = num4; i >= 0; i--) {
        if (i > 0) { // i가 0일 때 예외 처리
            String star1 = "";
            for (int j = 0; j < i; j++) {
                star1 += "*";
            }
            System.out.println(star1);}}}
public void practice9() {
	System.out.print("정수 입력 : ");
	int num6 = sc.nextInt();
	String star = "";
	for(int i = 1;i <= num6; i++) {
		star += "*";
		System.out.printf("%10s\n",star);
	}
}
public void practice10() {
	System.out.print("정수 입력 : ");
	int num7 = sc.nextInt();
	String result = "";
	
	for (int i=1;i <= num7;i++) {
	result += "*";
	System.out.println(result);
	}
	}
public void practice11() {
	
}
public void practice12() {
	
}
public void practice13() {
	System.out.print("자연수 하나를 입력하세요 : ");
    int num7 = sc.nextInt();

    String twoAndThree = ""; // 2와 3의 배수 저장
    int commonMultipleCount = 0; // 2와 3의 공배수 개수 저장

    for (int i = 1; i <= num7; i++) {
        if (i % 2 == 0 || i % 3 == 0) { // 2 또는 3의 배수
            twoAndThree += i + " "; // 문자열 결합
            if (i % 6 == 0) { // 2와 3의 공배수
                commonMultipleCount++;
            }
        }
    }

    System.out.println(twoAndThree); // 2와 3의 배수 출력
    System.out.println("2와 3의 공배수 개수 : " + commonMultipleCount); // 공배수 개수 출력
}

}