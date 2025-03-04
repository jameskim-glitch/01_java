package edu.kh.collection.pack3.model.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {

	// Map : Key 와 Value 한쌍이 데이터가 되어 이를 모아둔 객체
	// Key 와 Value -> Entry 라고 부름
	
	// - Key 를 모아두면 Set 의 특징(중복 X)
	// - Value 를 모아두면 List 의 특징(중복 O)
	
	public void ex1() {
		
		// HashMap< k , v > : Map 의 자식 클래스중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//Map.put(Integer Key, String Value) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		
		
		// key 중복 테스트
		
		map.put(1, "김동준"); // 중복 허용 X , 대신 Value 덮어쓰기
		
		// Value 중복 테스트
		
		map.put(7, "최길동"); // 중복 허용 O
		
		
		System.out.println( map ); // map.toString() 오버라이딩 되어있음.
	}
	
	public void ex2() {
		
		// Map 사용 예제
		
		// VO/DTO (값 저장용 객체) 는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용함.
		// -> 재사용이 적은 VO 는 오히려 코드 낭비
		// -> Map 을 이용해서 VO 와 비슷한 코드를 작성할 수 있음
		
		// 1) VO 버전
		Member member = new Member();
		
		// 값 세팅
		
		member.setId("userId");
		member.setPw("UserPw");
		member.setAge(30);
		
		// 값 출력
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		// 2) Map 버전
		
		Map<String, Object> map = new HashMap<String, Object>();
		// value가 object 타입 == 어떤 객체든 Value 에 들어올 수 있다!
		
		// 값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 25);
		
		// 값 출력
		// Object(Value) Map.get(String Key) : 매개변수로 전달받은 Value 반환
		System.out.println( map.get("id"));
		System.out.println( map.get("pw"));
		System.out.println( map.get("age"));
		
		System.out.println("------------------------------------------");
		
		// ** Map 에 저장된 데이터 순차적으로 접근하기 **
		// {"id" = "user02", "pw" = "pass02", "age" = 25}
		
		/*for(String key : map) {
			System.out.println(map.get(key));
		}사용 불가*/
		
		// Map 에서 Key 만 모아두면 Set 의특징을 가진다(중복 저장 X)
		// -> 이를 활용해서 Map 에서 KeySet() 메서드 제공
		// -> Key 만 모아서 Set 으로 반환
		
		Set<String> set = map.keySet(); // id,pw,age 가 저장된 Set 반환
		
		System.out.println("keySet() : " + set);
		
		// 향상된 for 문
		for(String key : set) {
			System.out.println( map.get(key));
			
		// map에 저장된 데이터가 많거나(반복 필요)
		// 어떤 key 가 있는지 불분명 할때 (향상된 for 문)
		// 또는 map 에 저장된 모든 데이터에 접근해야 할 때
		// keySet() + 향상된 for 문 코드 사용
		}
	}
	
	public void ex3() {
		// List 에 Map 여러개 추가하여 다루기
		
		List< Map<String, Object> > list = new ArrayList<Map<String,Object>>();
		// List 객체만 생성되었고, 해당 list 에는 Map 만 들어올 수 있음을 제한함!
		// -> Map 객체는 아직 생성 X
		
		for(int i = 0; i < 10 ; i++) {
			// Map 객체 생성
			
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			
			// Map 에 데이터 추가
			map.put("id", "user0" + i);
			map.put("pw", "pw0"+i);
			
			// Map을 List 에 추가
			list.add(map);
			// HashMap 은 순서를 보장하지 않는 자료 구조!
			// 순서를 유지하고 싶으면 LinkedHashMap 이용하면 된다!
			// -> LinkedHashMap은 Put 한 순서를 유지시켜줌
		}
		// for 문 종료시 list 에 10개의 Map 객체가 추가되어 있다
		System.out.println( list );
		
		// 향상된 for 문 이용하여 key 가 "id" 에 대응하는 value 값 전부 출력하기
		for (Map<String, Object> temp : list) {
			System.out.println(temp.get("id") );
		}
	}
}
