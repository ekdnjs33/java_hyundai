package com.app1_문자열;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
	
		 // 문자열 메서드 정리
		
		  String s = "heLlO";
		  
		  System.out.println("1. 문자열 길이: " + s.length());
		  System.out.println("2. 특정문자 얻기: " + s.charAt(0));
		  System.out.println("3. 부분열: " + s.substring(1));
		  System.out.println("3. 부분열: " + s.substring(1,4)); // 1 ~ 3
		  System.out.println("4. 특정문자위치: " + s.indexOf('e')); // 
		  System.out.println("4. 특정문자위치: " + s.indexOf('X')); // 일치하는 문자 없으면  -1 반환
		  System.out.println("5. 문자열 연결: " + s.concat(" ~~~")); // 
		  System.out.println("6. 대문자: " + s.toUpperCase()); // 
		  System.out.println("7. 소문자: " + s.toLowerCase()); // 
		  System.out.println("8. 문자열 비교: " + s.equals("hello")); // 대소문자 구분 비교 
		  System.out.println("8. 문자열 비교: " + s.equalsIgnoreCase("hello")); // 대소문자 무시하고 비교 
		  System.out.println("9. 특정문자 포함여부: " + s.contains("he")); // 
		  System.out.println("9. 특정문자 포함여부: " + s.contains("Xe")); // 
		  System.out.println("10. 문자열 변경: " + s.replace('h', 'X')); // XeLlO
		  
	      String s2 = "     World     ";
	      System.out.println("11. 공백제거: " + s2.trim()); // 양쪽 공백제거
	      System.out.println("11. 공백제거: " + s2.trim().length()); // 5
	      
	      char [] chs = s.toCharArray();
	      System.out.println("12. 문자 배열:" + Arrays.toString(chs));
	      
	      //구분자로 분리
	      String s3 = "aaa/bbb/ccc";
	      String [] strArr = s3.split("/");
	      System.out.println("13. 구분자로 분리:" + Arrays.toString(strArr));
	      
	      
	      String xyz = s.replace('h', 'X');
	      //원본 
	      System.out.println(s); // heLlO
	      System.out.println(xyz); // XeLlO
	      
	    
	      
	      /* 
	       *   String 가장 큰 특징은  변경불가
	       *   따라서 다양한 메서드로 처리하면 새로운 문자열이 매번 생성된다. ==> 메모리 관리 비효율적
	       *   
	       *   StringBuffer/StringBuilder ==> 자신이 변경된다. => 메모리 관리 효율적
	       *   
	       */
	}// end main
}// end class






