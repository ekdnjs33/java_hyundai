package com.app7_클래스2;

// Student 클래스 핸들링(객체 생성, 값 저장, 값 수정, 조회...) 
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Student 클래스 메모리 로딩 ==> 객체 생성
		Student s = new Student();
		
		// 인스턴스는 자동으로 초기화 된다.
		System.out.println(s.name);    // null
		System.out.println(s.age);     // 0
		System.out.println(s.address); // null
		
		// 값을 넣어주는 시점이 나중이다. 
		s.name = "dawon-kim";
		s.age = 27;
		s.address = "Anyang-si";
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);

	}

}
