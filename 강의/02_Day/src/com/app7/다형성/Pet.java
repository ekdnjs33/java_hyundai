package com.app7.다형성;


//Dog,Cat의 공통적인 속성및동작 정의

public class Pet {  // extends Object 자동으로 삽입
	//공통적인 속성
	String name;
	int age;
	public Pet() {
		super();
	}
	public Pet(String name, int age) {
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
	//name과 age 동시에 반환
	public String getPet() {
		return name+"\t"+age;
	}
}
