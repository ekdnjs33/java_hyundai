package com.app2_람다;

public class LambdaTest {

	public static void main(String[] args) {
		
		// 1. 익명 클래스
		Flyer f = new Flyer () {
			@Override
			public void fly() {
				System.out.println("익명클래스.fly");
			}
		};
		f.fly();
		
		// 2. 람다 표현식 : 익명 클래스 없애고, 그 안의 메서드만 신경쓰는 거야!
		Flyer f2 = ()->{ System.out.println("람다표현식.fly"); };
		f2.fly();
		// Flyer 인터페이스 안에 추상메서드 fly() 단 한개만 있으므로 f2.fly()로 가능  
		
		// 3. 람다 표현식 ==> 단일 문장인 경우에는 {} 생략 가능 
		Flyer f3 = ()->System.out.println("생략_람다표현식.fly");
		f3.fly();

		
	}

}
