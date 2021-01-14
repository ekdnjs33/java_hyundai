package com.app2.인터페이스2;


interface X{
	public void a();
}
interface Y{
	public void b();
}

// 인터페이스끼리는 다중상속 가능
interface Z extends X,Y{
	public void c();
}


interface A{
	//인터페이스 구성요소 4가지
	/*
	 *  1. 상수
	 *   ==> public static final 자동 지정된다.
	 *  
	 *  2. 추상 메서드 (*****)
	 *  ==>public abstract 자동 지정
	 *  
	 *  3. default 메서드
	 *  ==> 일반클래스의 인스턴스 메서드 기능과 동일
	 *  
	 *  4. static 메서드
	 */
	public static final int NUM = 20;
	int SIZE = 20;  // public static final 자동 지정
	
	public abstract void a();
	public void a2();
	
	public default void b() {
		System.out.println("default 메서드 b()");
	}
	
	public static void c() {
		System.out.println("static 메서드 c()");
	}
}
// 인터페이스 사용하기 위한 임의의 클래스 도움을 받는다.
class AImpl implements A{
	@Override
	public void a() {}
	@Override
	public void a2() {}
}

public class TestMain {
	public static void main(String[] args) {
		// A a = new A();  객체생성 불가
		// 하위클래스 이용하여 인터페이스 구성요소 사용된다.
		A xxx = new AImpl();  //다형성
		System.out.println(xxx.NUM);
		System.out.println(xxx.SIZE);
		xxx.a();
		xxx.a2();
		xxx.b();
		A.c();  // 인터페이스명.static메서드
		
	}

}
