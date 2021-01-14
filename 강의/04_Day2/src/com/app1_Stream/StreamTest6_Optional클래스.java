package com.app1_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
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
 *      s  - sorted()
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
 *     
 *    7. Optional 클래스
 *     - 집계값이 존재하지 않을 경우 예외가 발생된다.
 *       따라서 예외방지용으로 Optional 클래스를 사용할 수 있다.
 */


public class StreamTest6_Optional클래스 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		
//   다음 코드는 데이터가 없는데 		average() 에러발생
//		Stream<Integer> stream = list.stream();
//		IntStream xxx = stream.mapToInt(Integer::intValue);
//		OptionalDouble optional = xxx.average();
//	    System.out.println(optional);
//	    System.out.println(optional.getAsDouble());
		//IntStream 이나 Stream<Integer> 이나 똑같은건가요?? ==>> 다르다.

		// 방법1
//		OptionalDouble optional2 =list.stream().mapToInt(Integer::intValue).average();
//	    if(optional2.isPresent()) {
//	    	System.out.println(" 방법1 : 평균값 존재"+optional2.getAsDouble());
//	    }else {
//	    	System.out.println("방법1 : 0.0");
//	    }
	    
	    //방법2 (**************)
	    double avg =list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	    System.out.println(" 방법2 : 평균값 존재"+ avg );
		
	}//end main
}//end class


/*
 *   정리순서
 *   
 *   1. 인터페이스 
 *     가. 인터페이스 구성요소 및 특징
 *     나. 사용방법(***)
 *        - 이름있는 클래스
 *        - 익명 클래스
 *        - 람다 표현식(*****)
 *        
 *   2. 함수형 인터페이스 API
 *     - Consumer :  파라미터 있고 리턴값 없다.
 *     - Supplier : 파라미터 없고 리턴값 있다.
 *     - Function :  파라미터 있고 리턴값 있다. 데이터타입 맵핑용도 ==> ( int전달하고 String반환)
 *     - Operator :  파라미터 있고 리턴값 있다. 연산용도 ==> 임의의 타입전달하고 임의의 타입 반환
 *     - Predicate :  파라미터 있고 리턴값 있다. 리턴값은 boolean으로 정해져 있다. ==> 임의의 타입전달하고 boolean 반환
 *     
 *   3. 컬렉션 API
 *     - Set 계열
 *     - List 계열
 *     - Map 계열
 *  
 *   
 *   4. 컬렉션 사용시 중간처리/최종처리 작업 처리 가능 ==> Stream API
 *   
 *      - Stream 얻는 방법
 *      - 중간처리 메서드
 *      - 최종처리 메서드
 * 
 * 
 * 
 * 
 * 
 */































