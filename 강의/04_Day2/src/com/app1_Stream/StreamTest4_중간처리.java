package com.app1_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 *    스트림 ?
 *    
 *    1. 자바 I/O
 *     - InputStream
 *     - OutputStream
 * 
 *    
 *    2.  Stream API
 *      - JDK 1.8 지원
 *      - 컬렉션에 저장된 데이터를 
 *       중간처리( 중복제거, 정렬,  skip,... )==> 맵(map)
 *        및
 *       최종처리 ( 총합, 최대값, 최소값,갯수 ,...) ==> 리듀스(reduce)
 *       가 가능하다.
 *        ==> 맵/리듀스 
 *      - 함수형 인터페이스 API가 사용된다.
 *      
 *    3.  Stream 타입 얻기
 *      가. 컬렉션
 *      나. 배열
 *      다. IntStream, LongStream, DoubleStream
 *      다. 파일
 *      
 *    4. 종류
 *          
 *       Stream
 *       IntStream
 *       LongStream
 *       DoubleStream
 *       
 *    5. 중간처리
 *      가.중복제거
 *        - distinct()
 *      나.필터링
 *        - filter()
 *      다. 정렬
 *        - sorted()
 */


public class StreamTest4_중간처리 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동1","이순신1","유관순1","홍길동1","홍길동1","유관순1");

		//1. 전체 출력
		Stream<String> stream = list.stream();
		stream.forEach(n->System.out.println("1. 전체출력:"+ n));
		System.out.println("/////////////////////////////////////");
		
		//2. 중복 제거
		stream = list.stream();
		stream.distinct().forEach(n->System.out.println("2. 중복 제거:"+ n));
		System.out.println("/////////////////////////////////////");
		
		//3. 중복제거후 List 반환
		stream = list.stream();
		List<String> distinctList =  stream.distinct().collect(Collectors.toList());
		System.out.println("3. 중복제거후 List 반환:"+ distinctList);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		List<String> list2 = Arrays.asList("홍길동1","이순신1","유관순1");
		
		Stream<String> stream2 = list2.stream();
		
		// '이' 로 시작하는 값 반환?
		List<String> filterList = stream2.filter(n-> n.startsWith("이")).collect(Collectors.toList());
		System.out.println("4. '이' 로 시작하는 값 반환:"+ filterList);
		
		// 중복제거 + 필터링
		List<String> list3 = Arrays.asList("홍길동1","이순신1","유관순1","홍길동1","홍길동1","유관순1","이광수","이문희","이광수");
		Stream<String> stream3 = list3.stream();
		List<String> filterList2 = stream3.distinct().filter(n-> n.startsWith("이")).collect(Collectors.toList());
		System.out.println("4. 중복제거하고 '이' 로 시작하는 값 반환:"+ filterList2);
		
		
	}//end main
}//end class




