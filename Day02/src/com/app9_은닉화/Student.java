package com.app9_은닉화;

public class Student {
	
	private String name;
	private int age;
	private String address;
	
	
	//검증 메서드
	private boolean ageCheck(int age) {
		boolean result = false;
		if(age > 100) {
			result = true;
		}
		return result;
	}
	
	public void setAge(int age) {
		if(ageCheck(age)) {
			System.out.println("age 잘못설정");
		}else {
			this.age = age;
		}
	}
	
	public Student() {}
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
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


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
