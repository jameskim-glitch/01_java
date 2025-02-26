package com.hw2.model.dto;

public class Employee extends Person {
	private String position;

	
	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}


	public String getInfo() {
		return "ID : " + getId() + " 이름 : " + getName() + " 직책 : " + position; 
	}
	
}
