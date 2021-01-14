package com.app2_람다;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest6_정렬 {

	public static void main(String[] args) {
		
		// 1. 기존 방식
		String [] names = {"Ee", "Bb", "Cc", "Aa", "Dd"};
		
		Arrays.sort(names);
		System.out.println("1. 오름차순 정렬: "+Arrays.toString(names));

		
		// 내림차순 정렬 ==> java.util.Comparator API 인터페이스 사용
		
//		Comparator<String> comp = new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1); // 내림차순 정렬
//				// return o1.compareTo(o2) // 오름차순 정
//			}
//		};
//		Arrays.sort(names, comp);
//		System.out.println("2. 내림차순 정렬: "+Arrays.toString(names));
		

		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("3. 내림차순 정렬: "+Arrays.toString(names));
		
		// 모든 인터페이스를 할 수 있는 건 아니야. '메소드가 하나만' 있어야지 람다로 표현할 수 있어.
		
		// 2. 람다 표현식
		Arrays.sort(names, (String o1, String o2)->o2.compareTo(o1));
		System.out.println("4. 내림차순 정렬: "+Arrays.toString(names));
				
		// 축약형  ==> 내림차순 하려면 지정해 줘야해.
		Arrays.sort(names, (o1, o2)->o2.compareTo(o1));
		System.out.println("4. 내림차순 정렬: "+Arrays.toString(names));
		
		// 한번 더 축약 (기본적으로 오름차순) 
		Arrays.sort(names, String::compareTo);
		System.out.println("5. 오름차순 정렬: "+Arrays.toString(names));

	}
		
}
