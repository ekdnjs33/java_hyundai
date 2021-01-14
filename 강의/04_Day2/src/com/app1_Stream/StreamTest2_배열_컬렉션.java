package com.app1_Stream;

import java.util.Arrays;
import java.util.List;
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
 *      다. 파일
 */


public class StreamTest2_배열_컬렉션 {

	public static void main(String[] args) {
		
		//1. 배열
		String [] names = { "홍길동","이순신","유관순"};
		
		//가. for문 - 외부반복자
		for (String s : names) {
			System.out.println("1. 외부반복자:" + s);
		}
		
		//나. 내부반복자 ( 성능이 좋다. )
	   Stream<String> stream = Arrays.stream(names);
		stream.forEach(s->System.out.println("2. 내부반복자:"+ s));
		
		////////////////////////////////////////////////////////////////
		//2. 컬렉션
		List<String> list = Arrays.asList("홍길동1","이순신1","유관순1");
		
		//나. 내부반복자
		Stream<String> stream2 = list.stream();
		stream2.forEach(s->System.out.println("3. List 내부반복자:"+ s));
		
		

	}//end main
}//end class





