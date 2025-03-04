package com.toyFactory.run;

import com.toyFactory.model.service.ToyFactory;

public class Run {

    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory(); // ToyFactory 객체 생성
        factory.displayMenu(); // displayMenu() 메서드 호출
    }
}