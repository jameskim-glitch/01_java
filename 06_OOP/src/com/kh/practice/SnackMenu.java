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
	System.out.print( scr.saveData(kind, name, flavor, numOf, price) );
	
	String result = sc.next(); // y or n
	
	if(result.equals("y")) {
		// 저장된 데이터를 출력
		System.out.println(scr.confirmData());
	}
	
	
	
}

}
