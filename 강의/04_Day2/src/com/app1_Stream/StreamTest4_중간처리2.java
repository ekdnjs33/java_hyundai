package com.app1_Stream;

import java.util.Arrays;
import java.util.Comparator;
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
 *      라. 갯수제한
 *        - limit(n)
 *      마. skip
 *        - skip(n)  
 *      
 *      바. map()
 *        - 사용자 정의 중간처리
 */


public class StreamTest4_중간처리2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,2,6,8,32);
		
		Stream<Integer> stream = list.stream();
//		List<Integer> sortedList1 = stream.sorted().collect(Collectors.toList()); // 오름차순
		List<Integer> sortedList2 = stream.sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //내림차순
		System.out.println("1. sorted:" + sortedList2);
		////////////////////////////////////////////////////////////////////
		List<String> list2 = Arrays.asList("홍","이순신","세종","을지문덕");
		Stream<String> stream2 = list2.stream();
		List<Integer> lengthList = stream2.map(n->n.length()).collect(Collectors.toList());
		System.out.println("2. 이름 길이:" + lengthList);
		
		
	}//end main
}//end class









