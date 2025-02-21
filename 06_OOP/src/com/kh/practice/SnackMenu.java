package com.kh.practice;

import java.util.Scanner;

public class SnackMenu {
SnackController scr = new SnackController();
private Scanner sc = new Scanner(System.in);
public void menu() {
	System.out.println("스낵류를 입력하세요");
	System.out.print("종류 : ");
	String kind = sc.nextLine();
	System.out.print("이름 : ");
	String name = sc.nextLine();
	System.out.print("맛 : ");
	String flavor = sc.nextLine();
	System.out.print("갯수 : ");
	int numOf = sc.nextInt();
	System.out.print("가격 : ");
	int price = sc.nextInt();
	System.out.println("저장완료되었습니다.");
	System.out.print("저장된 정보를 확인하시겠습니까?(y/n) : ");
	String confirmData = sc.next();
	
	if (confirmData == "y") {
		System.out.println(scr.getSaveData());
	}
	
}

}
