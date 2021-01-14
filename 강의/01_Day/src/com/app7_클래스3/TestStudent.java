package com.app7_클래스3;

// Student 클래스 핸들링 ( 객체생성, 값 저장, 값 수정, 조회...)
public class TestStudent {

	public static void main(String[] args) {

	   
	   Student x = new Student();
	   Student s = new Student("홍길동",20,"서울");
		
	   System.out.println(s.name);
	   System.out.println(s.age);
	   System.out.println(s.address);
	}

}
