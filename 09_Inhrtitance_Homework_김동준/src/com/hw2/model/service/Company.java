package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
    private Employee[] employees;
    private int employeeCount;

    public Company(int size) {
        employees = new Employee[size];
        employeeCount = 0;
    }

    @Override
    public void addPerson(Person person) {
        if (person instanceof Employee) {
            if (employeeCount < employees.length) {
                employees[employeeCount++] = (Employee) person;
                System.out.println("직원이 추가되었습니다.");
                System.out.println(person.getInfo());
            } else {
                System.out.println("인원이 모두 충원되었습니다.");
            }
        }
    }

    @Override
    public void removePerson(String id) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId().equals(id)) {
                System.out.println("직원이 삭제되었습니다.");
                System.out.println(employees[i].getInfo());
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--employeeCount] = null;
                return;
            }
        }
        System.out.println("해당 id를 가진 직원을 찾을 수 없습니다.");
    }

    @Override
    public void displayAllPersons() {
        System.out.println("전체 직원 명단:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].getInfo());
        }
    }
}