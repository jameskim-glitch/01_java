package edu.kh.collection.pack1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.collection.pack1.model.service.StudentService;

public class StudentRun {

	public static void main(String[] args) {
		StudentService service = new StudentService();
		service.displayMenu();
		
		/*List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5); // 0 
		numberList.add(3); // 1
		numberList.add(2); // 2
		numberList.add(7); // 3
		numberList.add(0); // 4
		
		// 숫자 리스트를 정렬
		// Integer 는 이미 Comparable 을 상속받아 compareTo() 정의함
		Collections.sort(numberList);
		
		System.out.println(numberList);*/
	}
}
