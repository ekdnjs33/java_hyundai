package com.app7_Stream;

import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;

/*
 *     8. method 사용시 간략한 표현 방법
 *     		- static 메서드
 *     		- 인스턴스 메서드
 */

class Calculator{
	public int methodA(int x, int y) { //==> Operator
		return x+y;
	}
	public void methodB(int x) { //==> Consumer
		System.out.println(x);
	}
}
public class StreamTest6_method {

	public static void main(String[] args) {

		// 1. 인스턴스 메서드 --( 축약 )--> 참조변수::메서드
		Calculator c = new Calculator();
//		BinaryOperator<Integer> op = (a, b)->c.methodA(a, b);
		BinaryOperator<Integer> op = c::methodA;
		int result = op.apply(100, 200);
		System.out.println(result);
		
		
		Calculator c2 = new Calculator();
//		IntConsumer ic = n->c2.methodB(n);
		IntConsumer ic = c2::methodB;
		ic.accept(100);
		
		
//		IntConsumer ic2 = n->System.out.println(n);
		IntConsumer ic2 = System.out::println;
		// System.out = 참조변수 / println = 메소드 (*** 굉장히 간략하게 가능!!!)
		
	}

}
