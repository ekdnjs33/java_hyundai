package com.app2_람다;

@FunctionalInterface // 인터페이스가 반드시 단 하나의 추상메서드만 가지도록 강제하는 어노테이션이다.
public interface Flyer5 {

	//라. 파라미터 변수 (여러개)있고 리턴값 있는 경우
	public abstract int fly(int n, int m); 
	
}
