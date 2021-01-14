package com.app7.다형성;

import java.util.Date;

public class TestMain3 {

	public static void main(String[] args) {
		
		//1. 다형성 미적용
		//가. 변수관리
		Cat c1 = new Cat("나비1", 2, "블랙");
		Cat c2 = new Cat("나비2", 6, "블랙");
		Cat c3 = new Cat("나비3", 2, "블랙");
		Dog d1 = new Dog("망치1", 2, "수컷");
		Dog d2 = new Dog("망치2", 1, "암컷");
		
		//나. 배열관리
		Cat [] cats = {new Cat("나비1", 2, "블랙"),
				       new Cat("나비2", 6, "블랙"),
				       new Cat("나비3", 2, "블랙")};
		
		Dog [] dogs = {new Dog("망치1", 2, "수컷"),
				       new Dog("망치2", 1, "암컷")};
		
		//2. 다형성 적용 ==> 하나의 변수로 모든 애완동물 참조 가능
		// 가. 배열사용- 다형성의 대표적인 샘플
		Pet [] pets = {
				   new Cat("나비1", 2, "블랙"),
			       new Cat("나비2", 6, "블랙"),
			       new Cat("나비3", 2, "블랙"),
			       new Dog("망치1", 2, "수컷"),
			       new Dog("망치2", 1, "암컷")};
		
		for (Pet pet : pets) {
			System.out.println(pet);
		}
		
       //  다형성 확장
		Object [] obj = { "홍길동", 
				           20, 
				           new Date(),
				           new Cat("나비1", 2, "블랙"),
				           new Dog("망치1", 2, "수컷")};
		
		
		//나. 메서드 파라미터- 다형성의 대표적인 샘플
		setData(10);
		setData(3.14);
		setData("홍길동");
	
	}//end main
	// 다형성을 적용하지 않으면 오버로딩 메서드 적용해야 된다.
//	public static void setData(String obj) {  // 
//		
//	}
//	public static void setData(int obj) {  // 
//		
//	}
//	public static void setData(double obj) {  // 
//		
//	}
	
	// 다형성을 적용하면 하나의 메서드로 가능하다.
	public static void setData(Object obj) {
		
	}
	
	
}//end class





