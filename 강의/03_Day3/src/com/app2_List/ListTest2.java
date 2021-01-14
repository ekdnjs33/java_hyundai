package com.app2_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		list.remove(1); // 값보다 index가 우선 적용
		System.out.println(list);
		
		///////////////////////////////////////////////
		List<String> list2 = new ArrayList<String>();  // 다형성
		
		//2. 데이터 저장(추가)
		list2.add("홍길동");
		list2.add("이순신");
		list2.add("유관순");
		list2.add("홍길동");
		list2.add("정조");
		
		Object [] obj=list2.toArray();
		
//		String [] str = (String [])obj;
//		System.out.println(str);
		
	}//end main
}






