package com.app5_Operator;

import java.util.function.BinaryOperator;

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
		return name+"\t"+age;
	}
	
}
public class TestOperator2 {

	public static void main(String[] args) {

		// 강사님 참고
		//BinaryOperator 조금 어려워..
		
		Person p1 = new Person("홍길동1", 34);
		Person p2 = new Person("홍길동2", 14);
		
		
		
	}

}
