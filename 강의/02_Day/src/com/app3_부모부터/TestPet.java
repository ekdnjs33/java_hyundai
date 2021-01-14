package com.app3_부모부터;

public class TestPet {

	public static void main(String[] args) {
		Cat c = new Cat();

		/*
		 *    생성자 호출 형태
		 *    
		 *    1. 다른 클래스에서 객체생성시 
		 *       new 클래스명();
		 * 
		 *    2. 자식클래스에서 부모 생성자 호출
		 *      ( 자식클래스의 생성자 첫라인에 자동 삽입)
		 *        super();
		 *       명시적으로 지정할 시 반드시 첫라인에 사용해야됨. 
		 *    3. 같은 클래스의 특정생성자에서 다른생성자 호출
		 *       this();    
		 */
		
	}

}
