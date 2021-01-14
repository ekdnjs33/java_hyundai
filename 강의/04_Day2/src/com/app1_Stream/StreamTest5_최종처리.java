package com.app1_Stream;

import java.util.Arrays;
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
 *        
 *        
 *   6.최종처리
 *     - 총합
 *     - 갯수
 *     - 최대/최소
 *     - collect()
 */


public class StreamTest5_최종처리 {

	public static void main(String[] args) {

		  int [] nums = { 1,2,3,4,5};
		  
//		  IntStream stream = Arrays.stream(nums);
		  System.out.println("1. 갯수:" + Arrays.stream(nums).count());
		  System.out.println("2. 합계:" + Arrays.stream(nums).sum());
		  System.out.println("3. 평균:" + Arrays.stream(nums).average());
		  System.out.println("3. 평균:" + Arrays.stream(nums).average().getAsDouble());
		  System.out.println("4. 최대값:" + Arrays.stream(nums).max());
		  System.out.println("4. 최대값:" + Arrays.stream(nums).max().getAsInt());
		  System.out.println("5. 최소값:" + Arrays.stream(nums).min());
		  System.out.println("5. 최소값:" + Arrays.stream(nums).min().getAsInt());
	}//end main
}//end class









