package com.app2_람다;

public class LambdaTest4 {

	public static void main(String[] args) {
		
		//1. 익명 클래스
		Flyer4 f = new Flyer4() {
			@Override
			public int fly() {
				System.out.println("익명 클래스.fly");
				return 9999;
			}
		};
		int result  = f.fly();
		System.out.println("1.익명 클래스 결과값: " + result);
		
		//2. 람다표현식
		Flyer4 f2 = ()->{
			System.out.println("람다표현식.fly");
			return 8888;
		};
		int result2  = f2.fly();
		System.out.println("2.람다표현식결과값: " + result2);		
				
		//3. 람다표현식=> 실행문장이  return문만 있는 경우에는  {}와  return 키워드 생략
		Flyer4 f3 = ()->{
			return 8888;
		};
		int result3  = f3.fly();
		System.out.println("3.람다표현식결과값: " + result3);
		
		Flyer4 f4 = ()->7777;
		int result4  = f4.fly();
		System.out.println("4.람다표현식결과값: " + result4);
		
	}//end main
}//end class





