package com.app4_연산자;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 산술 연산자 */
		System.out.println(30/4); // /: 몫만
		System.out.println(30%4); // %: 나머지만
		
		
		/* 비교 연산자 */
		// 실행 결과는 논리값 = true/false
		 
		
		/* 대입 연산자 */
		int num = 10;
		int result = 90;
		result += num; // result = result + num;
		System.out.println(result);

		
		/* 논리 연산자
		 *		&&: and
		 *		||: or
		 *		! : not
		 */
		
		
		/* 문제1 */
		int num1 = 10;
		int num2 = 10;
		System.out.println((num1 > 15) && (num2 < 30));
		/* 문제2 */
		System.out.println((num1 > 15) || (num2 < 30));
		
		
		/* 실행 결과가 논리값으로 반환되는 것은?
		 * 1. 비교
		 * 2. 논리
		 * 3. Instanceof ?
		 */
		
		
		/* 증감 연산자 
		 * ++num, num++ (num = num+1, num += 1)
		 * --num, num--
		 * 
		 * <주의> 다른 연산자와 같이 사용시 실행 결과가 달라질 수 있다.
		 * 전치 ++num: 먼저 증가하고 나중에 할당
		 * 후치 --num: 먼저 할당하고 나중에 증가
		 */
		
		
		/* 3항 연산자 */
		// 변수명 = (조건식)?참:거짓;
		
		int result2 = (300>200)?100:200;
		System.out.println(result2);
		
		
	}

}
