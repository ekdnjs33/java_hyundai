package com.app2_람다;

public class LambdaTest2 {

	public static void main(String[] args) {
		
		// 1. 익명 클래스
		Flyer2 f = new Flyer2 () {
			@Override
			public void fly(int n) {
				System.out.println("익명클래스.fly "+n);
			}
		};
		f.fly(100);
		
		// 2. 람다 표현식 
		Flyer2 f2 = (int n)->{ System.out.println("람다표현식.fly "+n); };
		f2.fly(200);
		
		// 3. 람다 표현식 ==> 데이터타입 생략 
		Flyer2 f3 = (n)->{ System.out.println("생략_람다표현식.fly "+n); };
		f3.fly(300);
		
		// 4. 람다 표현식 ==> 파라미터변수가 하나인 경우에는 () 생략 
		Flyer2 f4 = n->{ System.out.println("생략_람다표현식.fly "+n); };
		f4.fly(400);
		
		// 5. 람다 표현식 ==> 실행문이 단일문장인 경우 {} 생략  
		Flyer2 f5 = n->System.out.println("생략_람다표현식.fly "+n);
		f5.fly(500);

		// 훨씬 간결하게 익명 클래스보다 람다 표현식으로 표현할 수 있다!!!
	}

}
