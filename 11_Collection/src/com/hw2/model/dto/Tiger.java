package com.hw2.model.dto;

public class Tiger extends Animal {

	public Tiger() {	}
	
	public Tiger(String name) {
		super(name);
	}



	public void sound() {
		System.out.println( this.name + "는 어흥 하고 웁니다");
	}
}
