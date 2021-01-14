package com.app2_람다;

public class LambdaTest5 {

	public static void main(String[] args) {

		// 1. 익명 클래스
		Flyer5 f = new Flyer5() {
			@Override
			public int fly(int n, int n2) {
				return n + n2;
			}
		};
		int result = f.fly(10, 20);
		System.out.println("1.익명 클래스 결과값: " + result);
		//////////////////////////////////////////////////////////

		// 2. 람다표현식
		Flyer5 f2 = (int n, int n2) -> {
			return n + n2;
		};

		// 3. 람다표현식
		Flyer5 f3 = (n, n2) -> {
			return n + n2;
		};

		// 4. 람다표현식
		Flyer5 f4 = (n, n2) -> n + n2;
		int result4 = f4.fly(300, 400);
		System.out.println("4.람다표현식 결과값: " + result4);
		
		
		
		
	}// end main
}// end class
