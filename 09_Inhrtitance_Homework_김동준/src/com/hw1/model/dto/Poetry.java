package com.hw1.model.dto;

public class Poetry extends Book {

	private int numberOfPorms;
	public Poetry() {	}
	public Poetry(String title, String author, int numberOfPorms) {
		super(title, author);
		this.numberOfPorms = numberOfPorms;
	}
	public int getNumberOfPorms() {
		return numberOfPorms;
	}
	public void setNumberOfPorms(int numberOfPorms) {
		this.numberOfPorms = numberOfPorms;
	}
public void displayInfo(){
    System.out.println("[시집] 제목 : " + getTitle() + " / 저자 : " + getAuthor() + " / 시 수 : " + numberOfPorms);
}

}
