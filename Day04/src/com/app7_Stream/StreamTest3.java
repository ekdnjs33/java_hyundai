package com.app7_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 5. 중간처리
 *    	가. 중복제거 
 *    		- distinct()
 *     
 *    	나. 필터링 
 *    		- filter()
 *    	
 *    	다. 정렬
 *    		- sorted()
 *    
 *    	라. 갯수 제한
 *    		- limit(n) : n개까지 제한 
 *    
 *    	마. skip
 *    		- skip(n) : n까지 스킵 
 *    
 *    	바. map()
 *    		- 사용자 정의 중간처리
 *    
 *    
 */

public class StreamTest3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("h1", "h2", "h3", "l1", "l2", "h3", "l1");
		
		Stream<String> stream = list.stream();
		stream.forEach(n->System.out.print(n+" "));
		System.out.println();

		
		// 중복 제거  
		stream = list.stream(); // 다시하는 이유는 전체 출력에서 다 소비했기 때문에, 그래서 다시 가져
		stream.distinct().forEach(n->System.out.print(n+" "));
		System.out.println();
		
		// 중복 제거후 List 반환 ==> [최종처리] collect(Collectors.toList()) 굉장히 많이 쓴다!!
		stream = list.stream();
		List<String> distinctList = stream.distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		
		/////////////////////////////////////////////////////////////////////////////////
		
		List<String> list2 = Arrays.asList("h1", "h2", "h3", "l1", "l2", "h3", "l1");
		Stream<String> stream2 = list2.stream();
		
		// 'h'로 시작하는 값 변환  
		stream2.filter(n->n.startsWith("h")).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		stream2 = list2.stream();
		List<String> newList = stream2.filter(n->n.startsWith("h")).collect(Collectors.toList());
		System.out.println(newList);
		
		// 필터링 + 중복제거
		stream2 = list2.stream();
		List<String> newList2 = stream2.distinct().filter(n->n.startsWith("h")).collect(Collectors.toList());
		System.out.println(newList2);
		
		
		/////////////////////////////////////////////////////////////////////////////////

		List<Integer> list3 = Arrays.asList(5, 2, 6, 8, 32);
		
		Stream<Integer> stream3 = list3.stream();
		//오름차순 
//		List<Integer> sortedList = stream3.sorted().collect(Collectors.toList()); 
		//내림차순 ==> Comparator.reverseOrder() 이용 
		List<Integer> sortedList = stream3.sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
		System.out.println(sortedList);
		
		
		/////////////////////////////////////////////////////////////////////////////////

		List<String> list4 = Arrays.asList("h1", "hy2", "hyj3", "lee1", "lj2", "h3", "l1");
		
		Stream<String> stream4 = list4.stream();
		List<Integer> lengthList = stream4.map(n->n.length()).collect(Collectors.toList());
		System.out.println(lengthList);
		
		
	}

}
