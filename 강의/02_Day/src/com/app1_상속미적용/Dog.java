package com.app1_상속미적용;

// 다양한 애완동물 생성이 가능하다.

public class Dog {

	String name;
	int age;
	String sex; // 고유한 속성
	
	public Dog() {
	}

	public Dog(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
