package com.app7_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 *     7. Optional 클래스 
 *     		- 집계값이 존재하지 않을 경우 예외가 발생.
 *     		따라서 예외방지용으로 Optional 클래스를 사용할 수 있다.
 */

public class StreamTest5_Optional클래스 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		
		//IntStream 이나 Stream<Integer> 똑같은 건가요? ==> 다르다!!!
		Stream<Integer> stream = list.stream();
		IntStream xxx = stream.mapToInt(Integer::intValue);
		OptionalDouble optional = xxx.average();
//		System.out.println(optional.getAsDouble()); // 값이 없는 경우(empty) 에러가 발생할 수 있다.

		// 에러 발생하지 않게 하고 싶다.
		// 방법 1. 조건 체크로 에러 방지 
		OptionalDouble optional2 = list.stream().mapToInt(Integer::intValue).average();
		if(optional2.isPresent()) {
			System.out.println(optional.getAsDouble());
		}else {
			System.out.println("empty");
		}
		// 방법 2. orElse(double) 사용 (*****) 많이 쓴다!
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
		
	}

}

/*
 *     정리순서 (시험엔 안나와요!)
 *     
 *     1. 인터페이스
 *     		가. 인터페이스 구성요소 및 특징
 *    		나. 사용방법(***)
 *    			- 이름있는 클래스
 *    			- 익명 클래스
 *    			- 람다 표현식(*****)
 *    
 *     2. 함수형 인터페이스 API
 *     		- Consumer  : 파라미터 O 리턴값 X
 *      	- Supplier  : 파라미터 X 리턴값 O
 *      	- Function  : 파라미터 O 리턴값 O 데이터타입 맵핑 용도 ==> (int 전달하고 String 반환)
 *      	- Operator  : 파라미터 O 리턴값 O 연산 용도 ==> (임의의 타입 전달하고 임의의 타입 반환)
 *      	- Predicate : 파라미터 O 리턴값 O 리턴값은 boolean으로 정해져있다. ==> 임의의 타입전달하고 boolean 반환 
 * 
 * 	   3. 컬렉션 API
 * 			- Set 계열
 * 			- List 계열
 *  		- Map 계열
 *  
 *     4. 컬렉션 사용시 중간처리/최종처리 작업 처리 가능 ==> Stream API
 *     		- Stream 얻는 방법
 *     		- 중간처리 메서드
 *     		- 최종처리 메서드
 *    
 * 
 */
