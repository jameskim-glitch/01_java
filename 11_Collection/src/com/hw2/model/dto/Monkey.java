package com.hw2.model.dto;

public class Monkey extends Animal {
public Monkey() {}

public Monkey(String name) {
	super(name);
	
}

public void sound() {
	System.out.println(this.name + "은 우끼끼 하고 웁니다.");
}
}
