package com.app3_제네릭스4;

import java.util.Date;

/*
 *   제네릭스(generics)
 *   
 *   가. <T>
 *   
 */

interface Product<T>{ // 클래스 뿐아니라 인터페이스도 가능하다!!
	public abstract void setValue(T obj);
	
}

class Car<T> implements Product<T>{
	@Override
	public void setValue(T obj) {
		System.out.println("Car : "+obj);
	};
}

public class GenericTest {

	public static void main(String[] args) {
		
		Car<Integer> c = new Car<Integer>();
		c.setValue(100);
		
		Car<String> c2 = new Car<String>();
		c2.setValue("hello");
//		c2.setValue(100);


	}

}
