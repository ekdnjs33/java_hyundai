package com.app6_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		// Set 계열 : 순서 없고 중복 불가, HashSet 클래스 사용
		// 주목적: 중복 제거할 
		
		HashSet<String> set = new HashSet<String>();
		
		// 데이터 저장
		set.add("hong");
		set.add("gil");
		set.add("dong");
		set.add("hong");
		
		// 데이터 출력 
		System.out.println("1. toString() 이용: " + set);
		System.out.println();
		
		for (String s:set) {
			System.out.println("2. foreach 이용: " + s);
		}		
		System.out.println();

		// 일반 for문은 못써, 대신 iterator 쓸 수 있어 
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("3. Iterator 이용: " + iter.next());
		}
		System.out.println();

		set.remove("hong");
		System.out.println("6. 값으로 삭제: " + set); //값으로만 삭제 가능하다!

//		set.remove(1);
//		System.out.println("6. 값으로 삭제: " + set);
		
		Object [] obj = set.toArray();
		System.out.println("7. 배열로 출력: " + Arrays.toString(obj));
		
		set.clear();
		System.out.println("8. 전체삭제:" + set);

	}

}
