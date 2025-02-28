package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
public class Zoo {
    Scanner sc = new Scanner(System.in);
    List<Animal> animals = new ArrayList<>(); // 동물 객체를 저장할 리스트

    public Zoo() {
 
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println("동물들의 울음소리를 들어보세요");
        for (Animal animal : animals) {
            animal.sound();
        }
    }

	
	public void displayMenu() {
		System.out.println("*** KH 동물원***");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : showAnimals(); return;
		case 2 : System.out.println("프로그램을 종료합니다."); break;
		}
	}
}
