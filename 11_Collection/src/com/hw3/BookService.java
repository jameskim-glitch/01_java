package com.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
	Scanner sc = new Scanner(System.in);
    List<Book> bookList = new ArrayList<>(); // 도서 목록
	public void displayMenu() {
		System.out.println("=======도서 목록 프로그램=========");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 조회");
		System.out.println("3. 도서 수정");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 즐겨찾기 추가");
		System.out.println("6. 즐겨찾기 삭제");
		System.out.println("7. 즐겨찾기 조회");
		System.out.println("8. 추천도서 뽑기");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴를 입력하세요 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : registerBook(); break;
		case 2 : searchBook(); break;
		case 3 : /*updateBook();*/break;
		case 4 : /*removeBook();*/break;
		case 5 : /*markFavoriteBook();*/break;
		case 6 : /*removeFavoriteBook();*/break;
		case 7 : /*getFavoriteBooks();*/break;
		case 8 : /*getRandomBook();*/break;
		case 0 : break;

		}
	}
	
	public void registerBook() {
        System.out.println("=======도서 등록=========");
        System.out.print("도서 번호: ");
        int bookNumber = sc.nextInt();
        System.out.print("도서 제목: ");
        String title = sc.next();
        System.out.print("저자: ");
        String author = sc.next();
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("출판사: ");
        String publisher = sc.next();

        Book book = new Book(bookNumber, title, author, price, publisher);
        bookList.add(book);

        System.out.println("도서 등록이 완료되었습니다.");
    }
	
    public void searchBook() { 
        System.out.println("==========도서 검색==========");
        if (bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
    public void 
}