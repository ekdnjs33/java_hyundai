package com.app1_예외;

/*
 *    1. 예외(Exception)
 *    		-> ㅍ로그램 실해중에 발생되는 의도하지 않은 문제.
 *    		-> 예외가 발생되면 가장 큰 문제는 프로그램이 '비정상종료' 된다.
 *    		결국 예외발생코드 이후의 실행문은 전혀 실행되지 못한다.
 *    
 *    2. 예외 처리(exception handling)
 *    		-> 예외 발생코드 이후의 실행문을 계속 실행하도록 처리 ('정상종료'의미)
 *    		-> 예외가 발생된 코드를 수정해서 다시 실행하는 것 아니다.(불가능)
 * 
 */

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		int num = 0;
		int result = 10/num;
		System.out.println(result);
		
		System.out.println("end. 정상종료");

	}

}
