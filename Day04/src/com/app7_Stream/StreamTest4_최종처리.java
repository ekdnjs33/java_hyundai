package com.app7_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 *     6. 최종처리
 *     		- 종합
 *     		- 갯수
 *     		- 최대/최소
 *     		-collect()
 * 
 */

public class StreamTest4_최종처리 {

	public static void main(String[] args) {

		int [] nums = {1, 2, 3, 4, 5};
		
//		IntStream stream = Arrays.stream(nums);
		
		System.out.println("count = "+Arrays.stream(nums).count());
		System.out.println("sum = "+Arrays.stream(nums).sum());
		System.out.println("average = "+Arrays.stream(nums).average()); // 객체 타입으로 반환 
		System.out.println("average = "+Arrays.stream(nums).average().getAsDouble());
		System.out.println("max = "+Arrays.stream(nums).max()); // 객체 타입으로 반환 
		System.out.println("max = "+Arrays.stream(nums).max().getAsInt()); 
		System.out.println("min = "+Arrays.stream(nums).min()); // 객체 타입으로 반환 
		System.out.println("min = "+Arrays.stream(nums).min().getAsInt()); 

		
		
		
	}

}
