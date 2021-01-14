package com.app2_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
}//end class

// 이름있는 클래스
class MyComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {	
//		return p1.age - p2.age; //오름차순
//		return p2.age - p1.age; //내림차순
		return Integer.compare(p1.age, p2.age); //오름차순
//		return Integer.compare(p2.age, p1.age); //내림차순
	}	
}


public class ListTest4_Collections {

	public static void main(String[] args) {
		
		
		List<Person> list  = Arrays.asList( 
				new Person("홍길동1", 34),
				new Person("홍길동2", 13),
				new Person("홍길동3", 5),
				new Person("홍길동4", 10),
				new Person("홍길동4", 67)); 
		
		//1. 정렬
		Collections.sort(list, new MyComparator());
		System.out.println("1. 정렬:" + list);
		
		//2. 최대/최소
		Person max = Collections.max(list, new MyComparator());
		Person min = Collections.min(list, new MyComparator());
		
		System.out.println("2. age 최대값: " + max);
		System.out.println("3. age 최소값: " + min);
		
	}//end main
}






