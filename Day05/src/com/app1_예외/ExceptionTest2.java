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
 * 	  3. 예외처리 방법
 * 		가. 예외처리 담당하는 클래스 제공하고 계층구조
 * 		
 * 					   Throwable
 * 						   |
 * 				Error			   *Exception
 * 								   	   |
 * 					  RuntimeException	  IOException(비런타임 계열)
 * 							 |					 |
 * 					NullPointerException	    ...
 * 					ArithmeticException
 * 					ClassCastException
 * 						   ...
 * 
 * 			** Runtime 계열은 예외처리 하지 않는다.
 * 			   예외가 발생되면 안되는 코드. 반드시 개발자가 if문으로 확인했어야 되는 코드들이다!
 * 
 * 			** 비 Runtime 계열은 반드시 예외처리 해야 한다.
 * 			   안하면 컴파일 에러 발생되고 언떤 예외처리 클래스인지 알려준다!
 * 			   ==> 이후에 어떤 예외처리 클래스를 써야될지 알 수 있다.
 * 
 * 
 * 
 * 	
 * 		나. 예외 클래스 활용한 예외처리 2가지 방법
 * 			1. 예외가 발생된 곳에서 예외처리 : try -catch -finally
 * 				try{
 * 					예외발생 코드1 ==> ArithmeticException
 * 					예외발생 코드2
 * 					예외발생 코드3 ==> ClassCastException
 * 					...
 * 				}catch(ArithmeticException  e){
 * 					예외처리 코드 ===> 예외발생된 이유를 이해할 수 있게 사용자에게 메세지 출력
 * 				}catch(ClassCastException  e){
 * 					예외처리 코드
 * 				}catch(Exception  e){ ==> 마지막은 Exception
 * 					예외처리 코드
 * 				}finally{
 * 					반드시 수행되는 문장; // 파일이나 DB 연결을 종료(자원반납)
 * 				}
 * 
 * 			2. 예외가 발생된 곳에서 예외처리하지 않고 위임하는 방법
 * 				throws 예외클래스 (*****)
 * 
 */

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		try { 
			// 예외처리 코드 
			int num = 0;
			int result = 10/num; // 예외발생 --> 바로 캐치문으로 
			System.out.println(result);  // (skip)
//		} catch (Exception e) { // 다형성 적용 가능(권장 X) ==> 가독성 떨어진다.
		} catch (ArithmeticException e) { // 적절한 예외클래스를 적어야한다(*디테일 권장)
			System.out.println("예외발생: "+e.getMessage()); // 예외발생 이유 출력
//			e.printStackTrace(); // 개발자 디버깅용 
		} finally {
			System.out.println("반드시 수행문");
		}
		
		System.out.println("end. 정상종료");

		
	}

}
