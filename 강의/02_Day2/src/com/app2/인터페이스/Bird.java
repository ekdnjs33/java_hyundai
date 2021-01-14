package com.app2.인터페이스;
/*
 *   날아 다니는 기능 메서드 fly() 어디에 추가?
 *   
 *   1. Pet 클래스 추가
 *     ==> fly 기능이 없는 Cat과 Dog이 문제가 된다.
 *     
 *   2. Bird 클래스 추가
 *     ==> fly()
 *     
 *      Bird2 클래스 추가
 *    ==> fly2()
 *    
 *    Bird와 Bird2 클래스의 메서드가 서로 다르게 구현될 수 있다.
 *    관리가 어려워진다.
 *    
 *    3. 인터페이스  
 *    
 *    
 */
public class Bird extends Pet implements Flyer{
	
	double weight; // 고유속성
	
	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Bird() {
	}
	public Bird(String name, int age) {
		super(name, age);
	}
	public Bird(String name, int age, double weight) {
		super(name, age);
		this.weight = weight;
	}

	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}
	@Override
	public String toString() {
		return "Bird [weight=" + weight + ", name=" + name + ", age=" + age + "]";
	}

}
