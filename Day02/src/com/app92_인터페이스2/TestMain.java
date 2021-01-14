package com.app92_인터페이스2;

interface X{
	public void a();
	
}
interface Y{
	public void b();
	
}
// 인터페이스끼리는 다중상속 가능 
interface Z extends X, Y{
	public void c();
	
}

interface A{ // 인터페이스 구성요소 4가지 *** 그 중에 추상메서드 ***
	
	public static final int NUM = 20; // 명시적으로 지정하는 것을 추천
	int SIZE = 20;
	
	public abstract void a();
	
	public void a2(); // 자동으로 abstract가 지정되긴 하지만, 그래도  abstract 명시하는 것 추천! 
	
	public default void b() {
		System.out.println("default 메서드 b()");
	}
	
	public static void c() {
		System.out.println("static 메서드 c()");

	}
}

// 인터페이스 사용하기 위한 임의의 클래스 도움을 받는다. 
class AImpl implements A{

	// 추상클래스 재정의 
	@Override
	public void a() {}

	@Override
	public void a2() {}
	
}

public class TestMain {

	public static void main(String[] args) {
		
		//A a = new A(); // 객체생성 불가, 그래서 임의의 클래스 도움! 
		// 하위클래스 이용하여 인터페이스 구성요소 사용된다. 
		A xy = new AImpl(); // 다형성 
		
		AImpl xxx = new AImpl();
		System.out.println(xxx.NUM);
		System.out.println(xxx.SIZE);
		xxx.a();
		xxx.a2();
		xxx.b();
		A.c(); // static 이므로 인터페이스(클래스)명으로 접근! 
	}

}
