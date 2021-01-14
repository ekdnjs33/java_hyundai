package com.app2_람다;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest6_정렬6_Person {

	public static void main(String[] args) {
		
		// 1. List로 관리
		List<Person> list = 
				Arrays.asList(new Person("hong1", 34), 
						new Person("hong2", 14), 
						new Person("hong3", 7), 
						new Person("hong4", 25), 
						new Person("hong5", 50)); 
		
		// 배열인 경우 --> Arrays.sort()
		// 리스트인 경우 --> Collections.sort()
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age; // 오름차순  
//				return p2.age - p1.age; // 내림차순 
			}
			
		});
		
		System.out.println("1. 리스트정렬: "+list);
		
		// 2. 람다 표현식
		Collections.sort(list, (p1, p2)->p1.age - p2.age);
		System.out.println("1. 람다 표현식 리스트정렬: "+list);
		
		Collections.sort(list, (p1, p2)->p2.age - p1.age); // 내림차순  
		System.out.println("1. 람다 표현식 리스트정렬: "+list);
	}
}

class Person{
	String name;
	int age;
	
	public Person() {
	}
	public Person(String name, int age) {
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
}
