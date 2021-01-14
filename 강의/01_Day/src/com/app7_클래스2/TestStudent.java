package com.app7_클래스2;

// Student 클래스 핸들링 ( 객체생성, 값 저장, 값 수정, 조회...)
public class TestStudent {

	public static void main(String[] args) {

		//Student 클래스 메모리 로딩 ==> 객체생성
		/*
		 *   클래스명  변수 = new  클래스명();
		 * 
		 */
		Student s = new Student();
		System.out.println(s.name); // null
		System.out.println(s.age);   // 0
		System.out.println(s.address); // null
		
		//인스턴스 변수 설정
		s.name = "홍길동";
		s.age = 20;
		s.address = "서울";
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);
		
	}

}
