package com.app7_클래스3;
 
public class Student {
	
	// 학생 객체의 속성을 클래스의 인스턴스 변수로 표현 

	/* 1. 인스턴스 변수 */
	String name;
	int age;
	String address;
	
	
	/* 2. 메서드 
	 *  목적: 인스턴스(수정, 조회)
	 */
	
	
	/* 3. 생성자
	 *  목적: 인스턴스 변수 초기화
	 *  	될 수 있으면 생성자를 통해 값을 할당하기~
	 *  
	 *  특징: - 명시적으로 생성자를 만들면 기본생성자는 자동으로 생성 안된다.
	 *  	 - 오버로딩 생성자
	 *  			여러개 만들시 변수의 타입 또는 변수의 순서가 반드시 달라야 한다.
	 */

	public Student() {}
//	public Student(int num) {}
	public Student(String s, int i, String s2) {
		name = s;
		age = i;
		address = s2;
	}
}
