package com.app2_람다;

@FunctionalInterface // 인터페이스가 반드시 단 하나의 추상메서드만 가지도록 강제하는 어노테이션이다.
public interface Flyer {

	// 인터페이스 안에 추상메소드가 어떤 형태인지 잘 기억해~
	
	// 가. 파라미터 변수 없고 리턴값 없는 경우 
	public abstract void fly(); 
	
}
