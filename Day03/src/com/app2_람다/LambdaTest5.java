package com.app2_람다;

public class LambdaTest5 {

	public static void main(String[] args) {
		
		// 1. 익명 클래스
		Flyer5 f = new Flyer5 () {
			@Override
			public int fly(int n, int m) {
				return n+m;
			}
		};
		int result = f.fly(10, 20);
		System.out.println("result = "+result);
		
		
		// 2. 람다 표현식  
		Flyer5 f2 = (int n, int m)->{
			return n+m;
		};
		int result2 = f2.fly(100, 200);
		System.out.println("result2 = "+result2);
		
		
		// 3. 람다 표현식 (축약형)
		Flyer5 f3 = (n, m)->n+m;
		int result3 = f3.fly(1000, 2000);
		System.out.println("result3 = "+result3);

	}

}
