package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Hero;

public class HeroService {

    public void practice() {

        Hero h1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
        Hero h2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);

        System.out.println("===========캐릭터 생성=============");
        System.out.println(h1);
        System.out.println("===========캐릭터 생성=============");
        System.out.println(h2);

        System.out.println("===========이구역짱 시점=============");
        h1.attack(100);
        h1.attack(50.5);
        h1.attack(49.5);
        h1.dash();
        h1.dash(); 

        System.out.println("======='이구역짱'님의 정보=======");
        System.out.println("- 현재 레벨 : " + h1.getLevel());
        System.out.println("- 현재 hp : " + h1.getHp());
        System.out.println("- 현재 mp : " + h1.getMp());
        System.out.println("- 현재 exp: " + h1.getExp());


        System.out.println("=========Zi존위자드 시점=============");
        h2.attack(300);
        h2.dash();
        h2.attack(300);
        h2.attack(300);

        System.out.println("======='Zi존위자드'님의 정보=======");
        System.out.println("- 현재 레벨: " + h2.getLevel());
        System.out.println("- 현재 hp : " + h2.getHp());
        System.out.println("- 현재 mp: " + h2.getMp());
        System.out.println("- 현재 exp: " + h2.getExp());

    }
}