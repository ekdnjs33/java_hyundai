package com.app6_배열;

import java.util.Arrays;
import java.util.List;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 배열 
		 * 		가. 배열 선언
		 * 		예 > int n; // n은 기본형 변수, 변수에 가면 실제값 존재
		 * 			int [] num; // num은 참조형 변수, 변수에 가면 주소값 존재 
		 * 
		 * 		나. 배열 사용
		 * 
		 * 		다. 초기화 
		 * 
		 * 5. 배열 사용 방법 3가지 
		 * 		가. new 이용
		 * 		나. 초기값 이용 (new 없이)
		 * 		다. 가 + 나 방법 혼합 
		 * */
		

		// 가. new 이용
		int [] num; // 배열 선언, 참조형 변수, 주소값 존재, 로컬 변수(stack)
		num = new int[3]; // new 이용, 인스턴스 관련(heap)
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		// 나. 초기값 이용 (new 없이)
		int [] num2 = {100, 200, 300}; // 분리하는 것 X
		
		// 다. 가 + 나 방법 혼합
		int [] num3;
		num3 = new int[] {1000, 2000, 3000}; // 크기 지정 X, 비워놔야 해, 분리 가능 
		
		
		/* foreach 문 */
		// 조건식이 없다. 따라서 예외 발생 가능성 없다.
		for(int i : num) {
			System.out.println("###"+i);
		}
	
		
		/* 
		 * java.util.Array 유틸리티 클래스 
		 * 
		 */
		
		String [] names = {"Java", "SQL", "Oracle", "Angular"};
		
		// 1. 정렬 
		Arrays.sort(names);
		for(String s : names) {
			System.out.println(s);
		}
		
		// 2. 배열값을 문자열로 출력 
		System.out.println("한꺼번에 출력: " + Arrays.toString(names));
		
		// 3. java.util.List 쉽게 생성하기  
		List<String> list = Arrays.asList("dawon", "minjun", "dongwoo"); //... 가변인자 
		System.out.println(list);
		
	}

}
