package com.app4_Function;

import java.util.function.BiFunction;
import java.util.function.IntFunction;

public class TestFunction2 {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> f = new BiFunction<String, String, Integer>() {
			@Override
			public Integer apply(String t, String u) {
				return t.length()+u.length();
			}
		};
		int num = f.apply("hello", "world");
		System.out.println(num);
		
		BiFunction<String, String, Integer> f2 = 
				(t, u)->t.length()+u.length();
		int num2 = f2.apply("dawon", "kim");
		System.out.println(num2);
		
		
		IntFunction<String> x = new IntFunction<String>() {

			@Override
			public String apply(int value) {
				return String.valueOf(value);
			}
		};
		String s = x.apply(100);
		System.out.println(s);
		
		IntFunction<String> x2 = value->String.valueOf(value);
		String s2 = x2.apply(1004);
		System.out.println(s2);
	}

}
