package com.app4_Supplier;

import java.util.Date;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 *   2. Supplier
 *    - 파라미터 없고 리턴값이 있다.
 * 
 *    -  종류
 *        BooleanSupplier :  boolean 타입으로 반환, getAsBoolean()
 *        DoubleSupplier  :  double 타입으로 반환
 *        IntSupplier  :  int 타입으로 반환  , getAsInt()
 *        LongSupplier  :  long 타입으로 반환
 */
public class SupplierTest2 {
	public static void main(String[] args) {
		
		BooleanSupplier s = new BooleanSupplier() {
			@Override
			public boolean getAsBoolean() {
				return true;
			}
		};
		System.out.println(s.getAsBoolean());
		
		BooleanSupplier s2 = ()->true;
		int num = 10;
		BooleanSupplier s3 = ()->num%2==0; // num값이 짝수냐?
		System.out.println(" num값이 짝수냐?"+s3.getAsBoolean());
		//////////////////////////////
		
		IntSupplier x = ()-> 100;
		System.out.println(x.getAsInt());
		
	}//end main
}//end class



