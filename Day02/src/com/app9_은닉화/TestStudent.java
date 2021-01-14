package com.app9_은닉화;

public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student();
		// s.ageCheck(age) 
		// 안보이게 하고 싶어! 그러면 ageCheck를 private으로 변경한다. 안보여서 복잡성 낮아져. = 은닉화!!
		
		s.setName("홍길동");
		s.setAge(200);
		s.setAddress("서울");

		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());
	}
}
