package com.hw3;

public class Book {
public Book() {}

private int bookNumber;
private String title;
private String author;
private int price;
private String publisher;
public Book(int bookNumber, String title, String author, int price, String publisher) {
	this.bookNumber = bookNumber;
	this.title = title;
	this.author = author;
	this.price = price;
	this.publisher = publisher;
}
public int getBookNumber() {
	return bookNumber;
}
public void setBookNumber(int bookNumber) {
	this.bookNumber = bookNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
@Override
public String toString() {
	return "Book [bookNumber=" + bookNumber + ", title=" + title + ", author=" + author + ", price=" + price
			+ ", publisher=" + publisher + "]";
}


}
