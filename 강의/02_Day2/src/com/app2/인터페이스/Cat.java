package com.app2.인터페이스;


public class Cat extends Pet {

	 String color; 

	public Cat() {
	}
	public Cat(String name, int age) {
		super(name, age);
	}
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}
	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}

	
	
	
}





