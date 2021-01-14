package com.app3_변수;

public class VariableTest {

	public static void main(String[] args) { //자바는 반드시 이 구조여야 해!
		// TODO Auto-generated method stub
		
		/* 왜 에러가 나는지 알아야 해 */
		int num = 0;  
		System.out.println(num); 
		// 로컬 변수이기 때문에 초기화 필요 (int num = 0)
		
		/* char 값은 연산 가능 */
		char c = 'A';
		int c2 =  c;
		System.out.println(c2);  // 'A': 65, 'a': 97
		System.out.println(c2+1);
		
		short s = 10;
		short s2 = 20;
		short result2 = (short)(s+s2); // 강제 형변
	}

}
