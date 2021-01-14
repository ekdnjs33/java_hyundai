package com.app8_문자열;

public class StringTest {

	public static void main(String[] args) {
		
		// 문자열 생성 방법
		
		// 1. 값만 이용 ==> 동일한 문자열은 재사용 
		String s = "hello";
		String s2 = "hello";
		System.out.println("주소값 비교: "+(s==s2)); //주소값 같아 
		System.out.println("실제값 비교: "+s.equals(s2)); //실제값 비교시 equals() 쓰기!!
	
		
		// 2. new 이용 ==> 동일한 문자열이라도 매번 생성 
		String x = new String("hello");
		String x2 = new String("hello");
		System.out.println("주소값 비교: "+(x==x2)); //주소값 달라 
		System.out.println("실제값 비교: "+x.equals(x2)); //실제값 비교시 equals() 쓰기!!
		
		System.out.println(s+"\t"+x);
		
		

	}

}
