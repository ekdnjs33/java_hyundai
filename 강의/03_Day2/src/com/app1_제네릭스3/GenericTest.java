package com.app1_제네릭스3;

import java.util.Date;

/*
 *   제네릭스(generics)
 *   ==> <T>
 * 
 */

// Box안에 여러가지 물건을 담을 수 있다. ==> Box안에 여러 데이터(문자열,정수,날짜...)를 담을 수 있다.

// Object --> T 로변경. T는 Box 클래스를 생성할 때 구체적인 타입으로 변경된다.
class Box<T>{
	T obj;
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}
public class GenericTest {

	public static void main(String[] args) {

		//1. 문자열 저장
		Box<String> b = new Box<String>();
		b.setValue("홍길동");
		//b.setValue(100); // 가. 컴파일 시점에 잘못된 데이터가 저장된 사실을 확인할 수 있다.
		String str = b.getValue();  //나.  형변환 불필요
		System.out.println("1. " + str);
		
		//2. 날짜 저장
		Box<Date> b2 = new Box<Date>();
		b2.setValue(new Date());
		//b2.setValue(100); // 가. 컴파일 시점에 잘못된 데이터가 저장된 사실을 확인할 수 있다.
		Date d = b2.getValue();   //나.  형변환 불필요
		System.out.println("2. " + d);
		
		
	}//end main
}//end class
