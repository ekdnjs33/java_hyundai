package com.app5_리스트;

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
		// TODO Auto-generated method stub
		return "이름 "+name+"/나이 "+age;
	}
	
	
}

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

public class ListTest_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = Arrays.asList(
				new Person("hong1", 37),
				new Person("hong2", 14),
				new Person("hong3", 2));
		
		Collections.sort(list, new MyComparator());
		System.out.println("1 정렬: "+list);

		// 2. 최대/최소
		Person max = Collections.max(list, new MyComparator());
		Person min = Collections.min(list, new MyComparator());
		System.out.println("2 최대: "+max);
		System.out.println("3 최소: "+min);

	}

}
