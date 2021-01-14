package com.app1_익명;

/*
 *   1) 중첩 클래스(nested class)
 *     class Outer{
 *         ..
 *         ..
 *         ..
 *         class Inner{
 *         
 *         
 *         }//end Inner
 *        
 *     }//end class
 *     
 *       - member inner class
 *       - local inner class
 *       - static inner class
 *       - 익명 클래스
 * 
 *   2) 익명 클래스(anonymous class)
 *     ==> 이름이 없는 클래스
 *     ==> 인터페이스 사용시 주로 익명 클래스 사용됨.(가독성 높다)   
 *     ==> 안드로이드 개발 시 주로 사용.
 * 
 * 
 */

interface Xyz{
	public abstract void a();
	public abstract void b();
	public abstract void c();
}
class XyzImple implements Xyz{

	@Override
	public void a() {}
	@Override
	public void b() {}
	@Override
	public void c() {}
}

@FunctionalInterface  // 반드시 하나의 추상메서드 설정할 수 있도록 강제한다.==> 람다는 추상메서드 반드시 하나여야 된다.
interface Flyer{
	public abstract void fly();
}
//1. Bird 이름있는 클래스
class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("Bird.fly");
	}
}

public class 익명클래스 {
	public static void main(String[] args) {

		
			Xyz kkk = new Xyz() {
				
				@Override
				public void c() {
				}
				
				@Override
				public void b() {
				}
				
				@Override
				public void a() {
				}
			};
		
		   //1. Bird 생성 사용
		   Flyer f = new Bird();
		   f.fly();
		
		   //2. 익명 클래스
		   /*
		    *   인터페이스명  변수명 = new 인터페이스명(){
		    *         //메서드 재정의
		    *   };
		    * 
		    */
		    
		    Flyer f2 = new Flyer(){
				@Override
				public void fly() {
					System.out.println("익명클래스.fly");
				}
		    };
		   f2.fly();
		   
		   //이클립스 자동완성 기능
		   Flyer f3 = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명클래스2222.fly");
			}
		   };
		   f3.fly();
		  
	}//end main
}//end class






