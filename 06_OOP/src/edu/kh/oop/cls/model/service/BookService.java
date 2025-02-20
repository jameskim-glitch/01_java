package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Book;

public class BookService {

	public void practice() {
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁성");

		
System.out.println(book1);


/*book2.setTitle("자바의정석");
book2.setAuthor("남궁성");
book2.setPrice(30000);
book2.setDiscountRate(0.2);
book2.getAuthor();
book2.getTitle();
book2.getDiscountRate();
book2.getPrice();*/
System.out.println(book2);
System.out.println("====================");
System.out.println("수정 된 결과 확인");
book1.setTitle("C언어");
book1.setDiscountRate(0.1);
book1.setAuthor("홍길동");
book1.setPrice(30000);
System.out.println(book1);
System.out.println("====================");

System.out.println("도서명 = " + book2.getTitle());
System.out.println("할인된 가격 = " + (book2.getPrice()-((book2.getPrice()*(book2.getDiscountRate())))));
	System.out.println("도서명 = " + book1.getTitle());
	System.out.println("할인된 가격 = " +(book1.getPrice()-((book1.getPrice()*(book1.getDiscountRate())))));
	
	}
}
