package com.app4_동기화;

public class BankingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account acc = new Account(5000);
		
		WithDrawThread t = new WithDrawThread("모바일 뱅킹", acc, 1000);
		
		WithDrawTread t2 = new WithDrawThread("ATM", acc, 1000);
		
		t.start();
		t2.start();
	}

}
