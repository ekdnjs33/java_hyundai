package com.app3_제네릭스5;

import java.util.List;
import java.util.Arrays;
import java.util.Date;

/*
 *   제네릭스(generics)
 *   
 *    다. <? extends 클래스명>
 *   
 */

class Person{}
class Man extends Person{}
class Woman extends Person{}

public class GenericTest2 {

	public static void main(String[] args) {
		
		List<Man> listMan = Arrays.asList(new Man(), new Man());
		List<Person> listPerson = Arrays.asList(new Person(), new Person());
		List<Woman> listWoman = Arrays.asList(new Woman(), new Woman());
		List<String> listString = Arrays.asList("AAA", "BBB");

		printData(listMan);
		printData(listWoman);
		printData(listString);
		printData(listPerson);
		
		printData2(listMan);
		printData2(listWoman);
		printData2(listPerson);
//		printData2(listString); // 상속받지 않은 애만 에러 
		
		printData3(listMan);
//		printData3(listWoman); // Man 이나 Man 부모 아니어서 에러 
		printData3(listPerson);
//		printData3(listString); // Man 이나 Man 부모 아니어서 에러 

	}
	// 모든 제네릭스 저장된 List 전달 가능 
	public static void printData(List<?> list) {
			System.out.println(list);
	}
	// Person 클래스를 상속받은 클래스 및 자신으로 지정된 제네릭스만 전달 가능 
	public static void printData2(List<? extends Person> list) {
		System.out.println(list);
	}
	// Man 클래스 및 Man 부모로 지정된 제네릭스만 전달 가능 
	public static void printData3(List<? super Man> list) {
		System.out.println(list);		
	}
}
