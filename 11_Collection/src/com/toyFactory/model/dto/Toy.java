package com.toyFactory.model.dto;

import java.util.HashSet;
import java.util.Set;

public class Toy {
    private String name; // 이름 항목 추가
    private int age; // 나이 항목 추가
    private int price; // 가격 항목 추가
    private String color; // 색상 항목 추가
    private String madeDate; // 제조연월 추가
    private Set<String> materials; // 재료 목록을 저장하는 Set

    public Toy() {
        this.materials = new HashSet<>(); // HashSet으로 초기화
    }

    public Toy(String name, int age, int price, String color, String madeDate, Set<String> materials) {
        this.name = name; // 이름 초기화
        this.age = age; // 나이 초기화
        this.price = price; // 가격 초기화
        this.color = color; // 색상 초기화
        this.madeDate = madeDate; // 제조연월 초기화
        this.materials = materials; // 재료목록 초기화
    }

    public String getName() {// get/set 추가 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() { // 색상 Getter 추가
        return color;
    }

    public void setColor(String color) { // 색상 Setter 추가
        this.color = color;
    }

    public String getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(String madeDate) {
        this.madeDate = madeDate;
    }

    public Set<String> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<String> materials) {
        this.materials = materials;
    }

    @Override
    public String toString() { // toy 를 toString 추가
        return "이름 : " + name + 
               "/ 가격 : " + price + 
               "/ 색상 : " + color + 
               "/ 사용가능 연령 : " + age + 
               "/ 제조년월일 : " + madeDate + 
               "/ 재료 : " + materials;
    }
}