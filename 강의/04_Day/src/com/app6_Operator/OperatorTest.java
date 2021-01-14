package com.app6_Operator;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

/*
   라. Operator
	 파라미터 있고 리턴값 있는 경우
     ==>  전달하는 파라미터를 연산(*)해서  임의의 값으로 리턴하는 용도
     ==> 내부적으로  Function 상속받음
	
   * 종류
    BinaryOperator<T> : BiFunction<T,U,R>  상속
                      : 두개의 파라미터 전달하고 반환 ( 모두 데이터타입 동일 )		
	UnaryOperator<T> : Function<T,R> 상속
	                  : 하나의 파라미터 전달하고 반환 ( 모두 데이터타입 동일 )	
	                  
    DoubleBinaryOperator : 두개의 파라미터 double 전달하고  double 반환 ( 모두 데이터타입 동일 )
    DoubleUnaryOperator	  :	: 하나의 파라미터 double 전달하고 double반환  
    IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환 ( 모두 데이터타입 동일 )
    IntUnaryOperator	  :	: 하나의 파라미터 int 전달하고 int반환  
    LongBinaryOperator : 두개의 파라미터 long 전달하고  long 반환 ( 모두 데이터타입 동일 )
    LongUnaryOperator	  :	: 하나의 파라미터 long 전달하고 long반환                 
 * 
 */
public class OperatorTest {
	public static void main(String[] args) {
		
		BinaryOperator<String> pp = new BinaryOperator<String>() {
			
			@Override
			public String apply(String t, String u) {
				return t.charAt(0)+ " \t " + u.charAt(0);
			}
		};
		String str = pp.apply("Hello", "World");
		System.out.println("1. BinaryOperator 익명클래스: "  + str);
		
		BinaryOperator<String> pp2 = (t, u)->t.charAt(0)+ " \t " + u.charAt(0);
		String str2 = pp2.apply("Hello", "World");
		System.out.println("1. BinaryOperator 람다표현식: "  + str2);
		///////////////////////////////////////////////////////////////
		
		UnaryOperator<Integer> kk = new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		int kk2 = kk.apply(100);
		System.out.println("2. UnaryOperator 익명클래스: "  + kk2);
		
		UnaryOperator<Integer> kkk = t->t*2;
		int kkk2 = kkk.apply(100);
		System.out.println("2. UnaryOperator 람다표현식: "  + kkk2);
		//////////////////////////////////////////////////////////
		IntBinaryOperator xyz  = new IntBinaryOperator() {
			
			@Override
			public int applyAsInt(int left, int right) {
				return left * right;
			}
		};
		int xyz2 = xyz.applyAsInt(100, 5);
		System.out.println("3. IntBinaryOperator 익명클래스: "  + xyz2);
		
		IntBinaryOperator xyz3 = (left, right)->left * right;
		int xyz4 = xyz3.applyAsInt(100, 5);
		System.out.println("3. IntBinaryOperator 람다표현식: "  + xyz4);
		
	}//end main
}//end class







