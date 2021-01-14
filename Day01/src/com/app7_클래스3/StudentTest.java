package com.app7_클래스3;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student x = new Student(); // 명시적으로 생성자를 만들면 기본생성자는 자동으로 생성 X ==> 생성자에 만들어줘야해 
		
		// 생성자를 이용해 값을 할당
		// 훨씬 빠른 시점에 값을 넣어줄 수 있다. 될 수 있으면 생성자를 통해 값을 할당하기!
		Student s = new Student("dawon-kim", 27, "Anyang-si"); 
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address);

	}

}
