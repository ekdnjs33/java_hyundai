package com.app1_문자열;

public class StringTest {

	public static void main(String[] args) {
	
		 // 문자열 생성 방법
	
	     //1. 값만 이용 ==> 동일한 문자열은 재사용
			String s = "hello";
			String s2 = "hello";
	
		  System.out.println("주소값 비교:"+ (s==s2));
		  System.out.println("실제값 비교:"+ s.equals(s2));
		  
	     //2. new 이용 ==> 매번 생성
		  	String x = new String("hello");
		    String x2 = new String("hello");
		    System.out.println("주소값 비교:"+ (x == x2));
		    System.out.println("실제값 비교:"+ x.equals(x2));
	
	}// end main
}// end class
