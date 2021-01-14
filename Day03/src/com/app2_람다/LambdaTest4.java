package com.app2_람다;

public class LambdaTest4 {

	public static void main(String[] args) {
		
		// 1. 익명 클래스
		Flyer4 f = new Flyer4 () {
			@Override
			public int fly() { // void => int 로 변경 
				System.out.println("익명클래스.fly");
				return 999;
			}
		};
		int result = f.fly();
		System.out.println("result = "+result);
		
		
		// 2. 람다 표현식 
		Flyer4 f2 = ()->{ // 실행 문장 여러 개라서 {} 생략 불가  
			System.out.println("익명클래스.fly");
			return 888;
		};
		int result2 = f2.fly();
		System.out.println("result2 = "+result2);
		
		
		// 3. 람다 표현식 ==> 실행 문장이 return문(1개)만 있는 경우
		Flyer4 f3 = ()->{  
			return 777;
		};
		int result3 = f3.fly();
		System.out.println("result3 = "+result3);
		
		// {}와 return 키워드 생략  
		Flyer4 f4 = ()->777;
		int result4 = f4.fly();
		System.out.println("result4 = "+result4);
		

	}

}
