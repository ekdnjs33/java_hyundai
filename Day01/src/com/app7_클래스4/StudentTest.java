package com.app7_클래스4;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		//Setter 메서드  
		s.setName("dawon-kim");
		s.setAge(1000);
		s.setAddress("Anyang-si");
		
		//Getter 메서드 
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddress());


	}

}
