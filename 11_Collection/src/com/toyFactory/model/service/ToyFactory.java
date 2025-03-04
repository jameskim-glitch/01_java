package com.toyFactory.model.service;
// 임포트 추가
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {// 기본 작성자
    Scanner sc = new Scanner(System.in); // 스캐너
    private Set<Toy> toys = new HashSet<>(); // 장난감들 넣을 Set 
    private Map<Integer, String> materials = new HashMap<>(); // 재료들 넣을 Map
    private int materialKey = 5; // 재료의 숫자 카운터

    public ToyFactory() { // 주어진 재료들 입력
        materials.put(1, "면직물"); // 면직물
        materials.put(2, "플라스틱"); // 플라스틱
        materials.put(3, "유리"); // 유리
        materials.put(4, "고무"); // 고무

        Set<String> materials1 = new HashSet<>(); // 재료 세트 입력
        materials1.add("면직물"); // 재료 를 set에 입력
        materials1.add("고무"); // 재료를 set 에 입력
        toys.add(new Toy("마미롱레그", 8, 36000, "분홍색", "19950805", materials1)); // 장난감 이름 입력

        Set<String> materials2 = new HashSet<>(); // 재료 세트 입력 ...
        materials2.add("면직물");
        materials2.add("플라스틱");
        toys.add(new Toy("허기워기", 5, 12000, "파란색", "19940312", materials2));

        Set<String> materials3 = new HashSet<>();
        materials3.add("면직물");
        materials3.add("플라스틱");
        toys.add(new Toy("키시미시", 5, 15000, "분홍색", "19940505", materials3));

        Set<String> materials4 = new HashSet<>();
        materials4.add("면직물");
        materials4.add("플라스틱");
        toys.add(new Toy("캣냅", 8, 27000, "보라색", "19960128", materials4));

        Set<String> materials5 = new HashSet<>();
        materials5.add("면직물");
        materials5.add("플라스틱");
        materials5.add("고무");
        toys.add(new Toy("파피", 12, 57000, "빨간색", "19931225", materials5));
    }

    public void addMaterials() { // 재료 추가
        System.out.println("<재료 추가>"); // 재료 추가 출력
        System.out.println("현재 등록된 재료:"); // 현재 등록된 재료 출력
        for (Map.Entry<Integer, String> entry : materials.entrySet()) { // 향상된 for 문 출력, entry 초기화
            System.out.println(entry.getKey() + ". " + entry.getValue()); // 재료에 숫자를 넣고, 재료 값 출력
        }

        System.out.print("재료 고유번호를 입력하세요: "); // 재료 고유번호 입력 출력
        int key = sc.nextInt(); // 재료 고유 번호 입력 받기
        sc.nextLine(); // 개행 문자 제거
        System.out.print("새로운 재료 이름을 입력하세요: "); // 재료 이름 입력 출력
        String material = sc.nextLine(); // 재료 이름 입력 받기

        if (materials.containsKey(key)) { // if 문으로, 재료 고유번호가 마테리얼스에 있을때
            System.out.print("이미 해당 키에 재료가 등록되어 있습니다. 덮어쓰시겠습니까?(Y/N): "); // 덮어쓸지 확인
            String choice = sc.nextLine(); // 입력 받기
            if (choice.equalsIgnoreCase("Y")) { // 대소문자 구분 없이 Y 입력시
                materials.put(key, material); // materials 에 재료 입력
                System.out.println("재료가 성공적으로 덮어쓰기 되었습니다."); // 출력
            }
        } else { // N 입력시
        	System.out.println("덮어쓰기를 취소했습니다."); // 출력
        }
    }

    public void displayToys() { // 목록 출력
        System.out.println("<전체 장난감 목록>"); // 출력
        if (toys.isEmpty()) { // 장난감 목록이 없을 때
            System.out.println("등록된 장난감이 없습니다."); // 출력
        } else { // 혹은
            int index = 1; // 장난감 번호 입력
            for (Toy toy : toys) { // 향상된 for 문 사용
                System.out.println(index + ". " + toy); // 번호 + 장난감 이름
                index++; // 번호를 추가하며 계속
            }
        }
    }

    
    public void makeNewToy() { // 새로운 장난감 추가
        System.out.println("<새로운 장난감 추가>");

        System.out.print("장난감 이름 : ");
        String name = sc.next();

        System.out.print("사용 가능 연령 : ");
        int age = sc.nextInt();

        System.out.print("가격 : ");
        int price = sc.nextInt();

        System.out.print("색상 : ");
        String color = sc.next();

        System.out.print("제조일 : ");
        String madeDate = sc.next();

        Set<String> materialsSet = new HashSet<>(); // 제료 세트 초기화
        while (true) { // whlie 문 입력
            System.out.print("재료를 입력하세요(종료하려면 'q' 를 입력하세요) : ");
            String material = sc.next();
            if (material.equals("q")) { // 재료가 q 일 경우 종료
                break;
            }
            materialsSet.add(material); // 재료 세트 입력
        }

        toys.add(new Toy(name, age, price, color, madeDate, materialsSet)); // 장난감 추가
    }
    public void deleteToy() { // 장난감 삭제
        System.out.print("삭제할 장난감의 이름을 입력하세요 : "); // 출력
        String delete = sc.next(); // 삭제할 이름 입력 받기
        Iterator<Toy> iterator = toys.iterator(); // Iterator 호출
        while (iterator.hasNext()) {  // 순차적으로 호출
            Toy toy = iterator.next(); // Iterator 에서 Toy 변수를 가져와 toy 에 저장
            if (toy.getName().equals(delete)) { // delete 와 이름이 같을 경우
                iterator.remove(); // 삭제
                System.out.println(delete + " 장난감이 삭제되었습니다."); // 삭제한 장난감 출력
                return;
            }
        }
        System.out.println(delete + " 장난감을 찾을 수 없습니다."); // 입력한 이름의 장난감이 없을때
    }
    
    public void sortByMadedate() { // 장난감 제조일 순으로 조회
        System.out.println("<장난감 제조일 순으로 조회>"); // 장난감 제조일 순으로 조회 프린트
        List<Toy> toyList = new ArrayList<>(toys); // Set을 List로 변환
        Collections.sort(toyList, new Comparator<Toy>() { //Collections.sort() 메서드를 사용하여 toyList를 정렬
        	//Comparator를 익명 클래스로 구현하여 Toy 객체를 제조일 순으로 비교
            @Override
            public int compare(Toy t1, Toy t2) {// Toy 1과 2를 비교
                return t1.getMadeDate().compareTo(t2.getMadeDate()); // 비교
            }
        });
        for (Toy toy : toyList) { // 향상된 for 문 
            System.out.println(toy);
        }
    }

    public void canPlayAge() { // 사용 가능 연령 조회 메서드
        System.out.print("조회할 연령을 입력하세요: "); // 출력
        int targetAge = sc.nextInt(); // 사용자로부터 조회할 연령을 입력
        sc.nextLine(); // 개행 문자 제거

        Map<Integer, List<Toy>> ageGroup = new HashMap<>(); // 연령별 장난감 목록을 저장할 Map 생성
        for (Toy toy : toys) { // 향상된 for 루프 시작
            if (toy.getAge() <= targetAge) { // 장난감 이용나이와 입력 나이 비교
                List<Toy> toyList = ageGroup.get(toy.getAge()); // 현재 장난감의 연령에 해당하는 장난감 목록을 Map에서 가져옴
                if (toyList == null) { // 만약 해당 연령의 장난감 목록이 Map에 존재하지 않으면
                    toyList = new ArrayList<>(); // 새로운 ArrayList 생성
                    ageGroup.put(toy.getAge(), toyList); // 생성된 ArrayList를 Map에 추가
                }
                toyList.add(toy); // 현재 장난감을 해당 연령의 장난감 목록에 추가
            }
        } // 전체 장난감 목록 순회 종료

        List<Integer> sortedAges = new ArrayList<>(ageGroup.keySet()); // Map의 키(연령)들을 ArrayList로 변환하여 sortedAges에 저장
        Collections.sort(sortedAges); // sortedAges 리스트를 오름차순으로 정렬

        for (int age : sortedAges) { // 정렬된 연령 목록을 순회하는 향상된 for 루프 시작
            System.out.println("<" + age + "세 이용 가능>"); // 현재 연령을 출력
            List<Toy> toyList = ageGroup.get(age); // 현재 연령에 해당하는 장난감 목록을 Map에서 가져옴
            for (int i = 0; i < toyList.size(); i++) { // 현재 연령의 장난감 목록을 순회하는 일반적인 for 루프 시작
                System.out.println((i + 1) + ". " + toyList.get(i)); // 장난감 목록의 순번과 장난감 정보 출력
            } // 현재 연령의 장난감 목록 순회 종료
        } // 정렬된 연령 목록 순회 종료
    } // 사용 가능 연령 조회 메서드 종료
    
    
    public void deleteMaMaterials() {
        System.out.print("삭제할 재료 이름을 입력하세요: ");//출력
        String materialName = sc.next();//삭제할 재료 이름 입력
        sc.nextLine(); // 개행 문자 제거

        for (Map.Entry<Integer, String> entry : materials.entrySet()) { // 향상된 for 문
            if (entry.getValue().equals(materialName)) { // 입력한 값과 재료 이름이 같을때
                materials.remove(entry.getKey()); // 재료 삭제
                System.out.println(materialName + " 재료가 삭제되었습니다."); // 출력
                return;
            }
        }
        System.out.println(materialName + " 재료를 찾을 수 없습니다."); // 출력
    }

    public void displayMenu() {
        int input;
        while (true) { // 메뉴 반복
            System.out.println("<<플레이 타임 공장>>");
            System.out.println("1. 전체 장난감 조회하기");
            System.out.println("2. 새로운 장난감 만들기");
            System.out.println("3. 장난감 삭제하기");
            System.out.println("4. 장난감 제조일 순으로 조회하기");
            System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
            System.out.println("6. 재료 추가");
            System.out.println("7. 재료 제거");
            System.out.print("선택 : ");
            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    displayToys(); // displayToys() 메서드 호출
                    break;
                case 2:
                	makeNewToy(); // makeNewToy() 메서드 호출
                    break;
                case 3:
                	deleteToy(); // deleteToy() 메서드 호출
                    break;
                case 4:
                	sortByMadedate(); // sortByMadedate() 메서드 호출
                    break;
                case 5:
                	canPlayAge(); // canPlayAge(); 메서드 호출
                    break;
                case 6: 
                	addMaterials(); // addMaterials() 메서드 호출 
                    break;
                case 7:
                	deleteMaMaterials(); // deleteMaMaterials() 메서드 호출
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다."); // 디폴트값
                    break;
            }
        }
    }
} // 솔직히 중간중간 하나도 몰라서 제미나이 썼어요 ㅠㅠ 향상된 for 문이랑 리스트랑 콜렉션 어려워요.