package com.app2_Consumer;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;


public class TestConsumer2 {

	public static void main(String[] args) {
		
		BiConsumer<String, Integer> b = new BiConsumer<String, Integer>(){
			
			@Override
			public void accept(String t, Integer u) {

				System.out.println(t+"\t"+u);
			}
		};
		b.accept("hello", 200);
		
		// 람다 표현식을 써야돼!  
		BiConsumer<String, Integer> b2 = (t, u)->System.out.println(t+"\t"+u);
		b2.accept("world", 400);
		
		///////////////////////////////////////////
		
		DoubleConsumer d = new DoubleConsumer() {
			
			@Override
			public void accept(double value) {
				System.out.println(value);
			}
		};
		d.accept(3.14);
		
		DoubleConsumer d2 = value->System.out.println(value);
		d2.accept(3.14);
		
		///////////////////////////////////////////

		// Obj의 타입만 정해주면 돼!  ==> String
		ObjDoubleConsumer<String> xx = new ObjDoubleConsumer<String>(){
			
			@Override
			public void accept(String t, double value) {
				System.out.println(t+"\t"+value);
			}
		};
		xx.accept("hello", 3.14);
		
		ObjDoubleConsumer<String> x = (t, value)->System.out.println(t+"\t"+value);
		x.accept("world", 2.14);
		
		///////////////////////////////////////////
		
		// Obj의 타입만 정해주면 돼!  ==> Date
		ObjDoubleConsumer<Date> xx2 = new ObjDoubleConsumer<Date>() {
			
			@Override
			public void accept(Date t, double value) {
				System.out.println(t+"\t"+value);
			}
		};
		xx2.accept(new Date(), 5.14);
		
		ObjDoubleConsumer<Date> x2 = (t, value)->System.out.println(t+"\t"+value);
		x2.accept(new Date(), 4.14);
	}

}
