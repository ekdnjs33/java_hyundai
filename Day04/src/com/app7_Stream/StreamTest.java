package com.app7_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 *    스트림?
 *    
 *    1. 자바 I/O
 *    		- InputStream
 *    		- OutputsStream
 *    
 *    2. Stream API
 *    		- JDK 1.8 지원
 *    		- 컬렉션에 저장된 데이터를 중간처리(중복제거, 정렬, skip, ...) ==> 맵(map)
 *    		  및 최종처리(총합, 최대값, 최소값, 갯수...) 가 가능하다 ==> 리듀스(reduce)
 *    		==> 맵(중간처리)/리듀스(최종처리) 
 *    
 *    3. Stream 타입 얻기
 *    		가. 컬렉션
 *    		나. 배열
 *    		다. IntStream, LongStream... 
 *    		라. 파일
 *    
 *    4. Stream 종류
 *    		Stream
 *    		IntStream
 *    		LongStream
 *    		DoubleStream
 *    		...
 *    
 *    5. 중간처리
 *    		가. 중복제거 
 *    			- distinct()
 *    
 */

public class StreamTest {

	public static void main(String[] args) {

		String [] names = {"hong", "lee", "you"};
		
		// 가. 외부반복자  
		for(String s : names) {
			System.out.println("1."+s);
		}
		
		// 나. 내부반복자 (성능이 좋다) 
		Stream<String> stream = Arrays.stream(names);
		stream.forEach(s->System.out.println("2 배열."+s));
//		stream.forEach(Consumer<? super String> action); // Consumer 잘 기억해둬
		
		
		// 2. 컬렉션
		List<String> list = Arrays.asList("HONG", "LEE", "YOU");
		
		// 나. 내부반복자  
		Stream<String> stream2 = list.stream();
		stream2.forEach(s->System.out.println("3 리스트."+s));
		
//		Stream<String> st2 = list.stream().forEach(s1 -> System.out.println("3. 람다 list : "+s1));
		// 이렇게 안돼. forEach 리턴 타입이 void라서 저장할 수 없어.
		
		
		
		
		
	}

}
