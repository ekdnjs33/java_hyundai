package com.app3_제네릭스5;

import java.util.List;
import java.util.Arrays;
import java.util.Date;

/*
 *   제네릭스(generics)
 *   
 *   나. <?>
 *   
 */

public class GenericTest {

	public static void main(String[] args) {
		
		// 1. 문자열 저장 리스트
		List<String> list = Arrays.asList("hong", "gil", "dong");
		
		// 2. 정수 저장 리스트 
		List<Integer> list2 = Arrays.asList(10, 20, 30);
		
		printData(list);
		printData(list2);
		
	}

	// String, Integer 둘 다 받아야하기 때문에 <> 안에 ?를 쓴다.
	public static void printData(List<?> obj) {
		System.out.println(obj);
	}
}
