package com.app2_람다;

public class LambdaTest3 {

	public static void main(String[] args) {
		
		//1.  익명 클래스
		Flyer3 f = new Flyer3() {
			@Override
			public void fly(int n, int n2) {
				System.out.println("익명 클래스.fly"+ n + "\t" + n2);
			}
		};
		f.fly(10, 20);
		////////////////////////////////////////////////////////////////
		
		//2. 람다 표현식
		Flyer3 f2 =(int n, int n2)->System.out.println("람다 표현식1.fly"+ n + "\t" + n2);
		f2.fly(1, 2);
		
		//3. 람다 표현식 ==> 데이터 타입 생략 가능
		Flyer3 f3 =(n,n2)->System.out.println("람다 표현식2.fly"+ n + "\t" + n2);
		f3.fly(1, 2);
		
		
	}//end main
}//end class





