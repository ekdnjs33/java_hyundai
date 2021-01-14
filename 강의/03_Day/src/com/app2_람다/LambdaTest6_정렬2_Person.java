package com.app2_람다;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest6_정렬2_Person {

	public static void main(String[] args) {

		 //1. 기존 방식
		//List로 관리
		List<Person> list  = 
				  Arrays.asList(new Person("홍길동1", 34),
						  new Person("홍길동2", 14),
						  new Person("홍길동3", 8),
						  new Person("홍길동4", 24),
						  new Person("홍길동5", 4));
		
		// 배열인 경우 --> Arrays.sort()
		// 리스트 인 경우 --> Collections.sort()
//		Collections.sort(list, new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				return p1.age - p2.age; //오름차순
////				return p2.age - p1.age; //내림차순
//			}
//			
//		});
		
//		System.out.println("1. 리스트정렬: " + list);
		
		//2. 람다 표현식
		Collections.sort(list, (p1, p2)->p1.age - p2.age);
		System.out.println("2. 람다 표현식 오름차순 리스트정렬: " + list);
		
		Collections.sort(list, (p1, p2)->p2.age - p1.age);
		System.out.println("3. 람다 표현식 내림차순 리스트정렬: " + list);
	}// end main
}// end class


class Person{
	String name;
	int age;
	public Person() {
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}//end Person