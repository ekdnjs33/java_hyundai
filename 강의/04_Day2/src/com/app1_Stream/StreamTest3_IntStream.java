package com.app1_Stream;

import java.util.stream.IntStream;

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
 */


public class StreamTest3_IntStream {

	public static void main(String[] args) {

		
		IntStream stream = IntStream.range(1, 11); // 1  ~10 까지 반환
		stream.forEach(n->System.out.println("1. IntStream: " + n));
		
		
	}

}




