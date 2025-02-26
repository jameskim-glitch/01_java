package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem {
    private Prisoner[] prisoners;
    private int prisonerCount;

    public Prison(int size) {
        prisoners = new Prisoner[size];
        prisonerCount = 0;
    }

    @Override
    public void addPerson(Person person) {
        if (person instanceof Prisoner) {
            if (prisonerCount < prisoners.length) {
                prisoners[prisonerCount++] = (Prisoner) person;
                System.out.println("수감자가 추가되었습니다.");
                System.out.println(person.getInfo());
            } else {
                System.out.println("인원이 모두 충원되었습니다.");
            }
        }
    }

    @Override
    public void removePerson(String id) {
        for (int i = 0; i < prisonerCount; i++) {
            if (prisoners[i].getId().equals(id)) {
                System.out.println("수감자가 삭제되었습니다.");
                System.out.println(prisoners[i].getInfo());
                for (int j = i; j < prisonerCount - 1; j++) {
                    prisoners[j] = prisoners[j + 1];
                }
                prisoners[--prisonerCount] = null;
                return;
            }
        }
        System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다.");
    }

    @Override
    public void displayAllPersons() {
        System.out.println("전체 수감자 명단:");
        for (int i = 0; i < prisonerCount; i++) {
            System.out.println(prisoners[i].getInfo());
        }
    }
}