package com.app3_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// Set 계열: 순서 없고 중복 불가, HashSet 클래스 사용.
		// 주목적: 중복 제거
		
		Set<String> set = new HashSet<String>(); //다형성 적용
				  set = new TreeSet<String>();
		//데이터 저장
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		set.add("홍길동");

		
		//데이터 출력
		System.out.println("1. toString() 이용:" + set);
		
		for (String s : set) {
			System.out.println("2. foreach 이용:" + s);
		}
		
		Iterator<String>  ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println("3. Iterator 이용:" + ite.next());
		}
		
		// 추가 메서드
		System.out.println("4. 크기:" + set.size());
		System.out.println("5. 값의 존재 여부:" + set.contains("홍길동"));
		System.out.println("5. 값의 존재 여부:" + set.contains("정조"));
		
		set.remove("유관순");
		System.out.println("6. 값으로 삭제:" + set);
		
		Object [] obj = set.toArray();
		System.out.println("7. 배열로 출력: " + Arrays.toString(obj));
		
		set.clear();
		System.out.println("8. 전체삭제:" + set);
		
		
		
		
		
		
		
		
	}//end main

}//end class
