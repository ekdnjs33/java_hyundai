package com.app2_람다;

public class LambdaTest {

	public static void main(String[] args) {

		//1. 익명 클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명 클래스1.fly");
			}
		};
		f.fly();
		
		//2. 람다 표현식
		Flyer f2 = ()->{System.out.println("람다 표현식1.fly");};
		f2.fly();
		
		//2. 람다 표현식==> 단일 문장인 경우에는  {}  생략가능
		Flyer f3 = ()->System.out.println("람다 표현식2.fly");
		f3.fly();
		
	}//end main
}//end class




