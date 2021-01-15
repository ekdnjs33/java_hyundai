package com.app1_예외;

/*
*			** Runtime 계열은 예외처리 하지 않는다.
* 			   예외가 발생되면 안되는 코드. 반드시 개발자가 if문으로 확인했어야 되는 코드들이다!
* 
* 			** 비 Runtime 계열은 반드시 예외처리 해야 한다.
* 			   안하면 컴파일 에러 발생되고 언떤 예외처리 클래스인지 알려준다!
* 			   ==> 이후에 어떤 예외처리 클래스를 써야될지 알 수 있다.
* 
* 		시험	* 사용자가 필요시 ( 강제적 )으로 예외발생 =====> 비정상 종료 ==> 예외처리 필요
* 			--> 사용자가 만든 어플리케이션에서 사용자가 의도한 결과가 나오지 않았을 때 시스템은 예외로 처리하지 않기 때문에
* 			명시적으로 예외를 발생시킬 수 있다.
* 			
* 			예) DB 조회시 데이터 없을 때...
* 
* 				throws 예외클래스 => 메서드 이용해서 예외처리 위임
* 
* 			 -> throw new 예외클래스(mesg);
* 			
* 
* */

class Account{ // throws 작성으로 위 클래스로 넘겨
	int balance = 100;
	
	public void withdraw(int amt) throws Exception {
		if(balance >= amt) {
			balance -= amt;
		}else {
			// 문제발생 ==> 시스템은 모른다 (예외발생 안됨)
			throw new Exception("잔액 부족");
			
		}
		
	}
	public void deposit(int amt) {
		balance += amt;
	}
}

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Account acct = new Account();
		try {
			acct.withdraw(200);
			System.out.println(acct.balance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end. 정상종료");
		
	}

}
