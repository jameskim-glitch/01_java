package com.hw1.run;

import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend arr[] = new Friend[5];
		Friend friend1 = new Friend();
		Friend friend2 = new Friend();
		Friend friend3 = new Friend();
		Friend friend4 = new Friend();
		Friend friend5 = new Friend();
		
		friend1.setName("철수");
		friend2.setName("영희");
		friend3.setName("맹구");
		friend4.setName("훈이");
		friend5.setName("짱구");
		

		arr[0] = friend1;
		arr[1] = friend2;
		arr[2] = friend3;
		arr[3] = friend4;
		arr[4] = friend5;
		
        Random random = new Random();
        int ran = random.nextInt(arr.length); // 0부터 배열 길이-1 사이의 랜덤 숫자 생성

        // 랜덤 친구 선택
        Friend leader = arr[ran];

        // 선택된 친구 출력
        leader.pickleader();
	}

}
