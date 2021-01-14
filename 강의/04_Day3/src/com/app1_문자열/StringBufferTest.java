package com.app1_문자열;

import java.util.Arrays;

public class StringBufferTest {

	public static void main(String[] args) {
	
		 
		StringBuffer buffer = new StringBuffer();
		
		//1. 추가
		buffer.append("Hello");
		buffer.append(30);
		buffer.append(true);
		buffer.append(new char[] {'A','B'});
		
		//2. 삽입
		buffer.insert(0, "홍길동");
		
		//3. 삭제
		buffer.delete(0, 4); // 0 ~ 3
		
		System.out.println(buffer.charAt(0));  //e
		System.out.println(buffer.indexOf("B"));  // 11
		System.out.println(buffer.substring(4));  // 4 ~ 끝까지
		System.out.println(buffer.reverse());  // 거꾸로
		
		System.out.println(buffer);
		
		//String 저장
		String mesg = buffer.toString();
		System.out.println(mesg);
		
	}// end main
}// end class






