package com.app5_리스트;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("원본: "+list);
		list.remove(1); // remove는 index를 기준으로 지운다.
		System.out.println(list);
		list.remove((Integer)1);
		System.out.println(list);
		list.remove((Integer)3); // value를 기준으로 지우려면 '(Integer)값'로 해야된다.
		System.out.println(list);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hong");
		list2.add("gil");
		list2.add("dong");
		
		Object [] obj = list2.toArray();
//		String [] str = (String [])obj; // 바로 형변환은 안된다!
//		System.out.println(str);
		
	}
}
