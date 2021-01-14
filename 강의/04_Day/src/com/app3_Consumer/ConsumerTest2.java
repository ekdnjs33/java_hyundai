package com.app3_Consumer;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;

/*
 *   함수적(형) 인터페이스 API ===>  컬렉션의 stream  API에서 활용
 *   
 *   1) Consumer 인터페이스
 *     - 파라미터 있고 리턴값은 없다.
 * 
 *   2) 종류
 *     BiConsumer =>  파라미터를 2개 받아서 처리
 *     DoubleConsumer ==> double타입으로 파라미터를 받아서 처리
 *     IntConsumer ==> int타입으로 파라미터를 받아서 처리
 *     LongConsumer ==> long타입으로 파라미터를 받아서 처리
 *     ObjDoubleConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 double
 *     ObjIntConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 int
 *     ObjLongConsumer ==> 두개의 파라미터중에 하나는 obj 다른하나는 long
 *     
 */

public class ConsumerTest2 {

	public static void main(String[] args) {

		 BiConsumer<String, Integer> b = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println(t+"\t"+u);
			}
		};
		b.accept("hello", 200);
		
		BiConsumer<String, Integer> b2 = (t, u)->System.out.println(t+"\t"+u);
		b2.accept("hello", 200);
		///////
		DoubleConsumer d = new DoubleConsumer() {
			
			@Override
			public void accept(double value) {
				System.out.println(value);
			}
		};
		d.accept(3.14);

		DoubleConsumer d2 = value -> System.out.println(value);
		d2.accept(3.14);
		//////////////////////
		ObjDoubleConsumer<String> xx = new ObjDoubleConsumer<String>() {
			@Override
			public void accept(String t, double value) {
				System.out.println(t+"\t" +value);
			}
		};
		xx.accept("Hello",3.14);
		
		ObjDoubleConsumer<String> xxx = (t, value)->System.out.println(t+"\t" +value);
		xxx.accept("Hello",3.14);
		////////////////////////////////////
		ObjDoubleConsumer<Date> xx2 = new ObjDoubleConsumer<Date>() {
			@Override
			public void accept(Date t, double value) {
				System.out.println(t+"\t" +value);
			}
		};
		xx2.accept(new Date(), 3.14);
		
		ObjDoubleConsumer<Date> xxx2 = (t, value)->System.out.println(t+"\t" +value);
		xxx2.accept(new Date(), 3.14);
		/////////////////////////////
	}//end main
}//end class






