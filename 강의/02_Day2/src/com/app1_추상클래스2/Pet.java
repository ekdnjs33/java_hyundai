package com.app1_추상클래스2;



public abstract class Pet {  
	String name;
	int age;
	
	// 애완동물의 공통적인 기능
	/*
	 *   추상메서드(abstract method)
	 *  
	 *  1. public abstract void 메서드명();  signature만 표현
	 *  2. 클래스는 반드시 abstract 로 지정
	 *  3. 추상클래스 요소
	 *     - 인스턴스 변수
	 *     - 생성자
	 *     - 일반 메서드(인스턴스 메서드)
	 *     - 추상 메서드(abstract )
	 *     
	 *  4. 추상 클래스를 상속받은 자식에서는 반드시 추상메서들 재정의해야 된다.
	 *    ==> 목적:자식클래스에서 특정 메서드 강제( 통일성, 일관성 )
	 *  
	 *  5. 추상 클래스는 new 불가
	 *  6. 다형성 적용 가능
	 *  
	 *  ==> 여러 클래스에서 공통적인 메서드 사용하게 하자.(강제성 필요==>추상클래스)
	 */

	public abstract void eat(); 
	public abstract void sleep(); 
	
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
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	

	
}




