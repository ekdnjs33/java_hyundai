package com.app1_예외;

/*
 * 		나. 예외 클래스 활용한 예외처리 2가지 방법
 * 
 * 			2. 예외가 발생된 곳에서 예외처리하지 않고 위임하는 방법
 * 				throws 예외클래스 (*****)
 * 
 */


class Test{ // throws 작성으로 위 클래스로 넘겨
	public void a() throws ArithmeticException, NullPointerException {
		b();								// main()가 처리하도록 넘겨 ==> main()에서 예외처리
	}
	public void b() throws ArithmeticException, NullPointerException { // 호출한 곳으로 위임하는 방법 
											// a()가 처리하도록 넘겨 ==> a()에서 예외처리 
		int num = 0;
		int result = 10/num; // 예외발생 
		System.out.println(result);  
		// 실행문장 ==> NullPointerException
	}
}

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Test t = new Test();
		
		try { // main에서 try -catch -finally 작성 
			t.a();
		} catch(ArithmeticException e) {
			System.out.println("예외발생: "+e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("예외발생: "+e.getMessage());
		} catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}
		
		System.out.println("end. 정상종료");
		
	}

}
