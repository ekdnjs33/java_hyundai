package com.app1_제네릭스4;

import java.util.Date;

/*
 *   제네릭스(generics)
 *   ==> <T>
 * 
 */

interface Product<T>{
	public abstract void setValue(T obj);
}

class Car<T> implements Product<T>{
	@Override
	public void setValue(T obj) {
		System.out.println("Car.serValue: "+ obj);
	}
}

public class GenericTest {

	public static void main(String[] args) {

		//1. 정수
		Car<Integer> c = new Car<Integer>();
		c.setValue(100);
		
		Car<String> c2 = new Car<String>();
		c2.setValue("hello");
		//c2.setValue(100);
		
	}//end main
}//end class










