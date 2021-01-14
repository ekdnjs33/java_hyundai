package com.app7_Stream;

/* 
 * 4. Stream 종류
 *    	Stream
 *    	IntStream
 *  	LongStream
 *   	DoubleStream
 */

import java.util.stream.IntStream;

public class StreamTest2 {

	public static void main(String[] args) {

		IntStream stream = IntStream.range(1, 11); // 범위만 지정하면 알아서 반환
		stream.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		
	}

}
