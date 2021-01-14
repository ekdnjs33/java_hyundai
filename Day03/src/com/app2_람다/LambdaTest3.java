package com.app2_람다;

public class LambdaTest3 {

	public static void main(String[] args) {
		
		// 1. 익명 클래스
		Flyer3 f = new Flyer3 () {
			@Override
			public void fly(int n, int m) {
				System.out.println("익명클래스.fly "+n+" "+m);
			}
		};
		f.fly(10, 20);
		
		// 2. 람다 표현식 
		Flyer3 f2 = (int n, int m)->System.out.println("익명클래스.fly "+n+" "+m);
		f2.fly(30, 40); 
		
		// 3. 람다 표현식 ==> 데이터타입 생략 (이게 최대 생략)
		Flyer3 f3 = (n, m)->System.out.println("익명클래스.fly "+n+" "+m);
		f3.fly(50, 60); 
		

	}

}
