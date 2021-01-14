package com.app8_Static;

class Counter{
	int num; // 0으로 자동초기화 
	static int count; // 한번만 생성 ==> 누적용으로 적합, 클래스명.count, 자동초기화, new 무관(인스턴스) 
	
	public Counter() {  // new 할 때마다 매번 새로운 인스턴스가 만들어져. 그러니까 누적할 수 없어!
		num++;
		count++;
	}
	
	/* static 메서드 ==> new 없이 사용 가능 
	 * 목적: 편리할 목적, 싱글톤 객체: 단 하나의 인스턴스만 생성패턴
	 */
	public static int getCount() {
		return count;
		//return num; ==> [에러] 아직 new X, 인스턴스 변수 접근 못해
		// System.out.println(this); ==> this 또한 인스턴스 관련이라 사용 불가!
	}
	
}

public class StaticTest {

	public static void main(String[] args) { //public 이라는 접근자는 클래스 안에 한개만 가질 수 있어.
		
		System.out.println(Counter.count);
		
		// Counter 클래스 생성 횟수 출력 
		Counter c = new Counter();
		System.out.println(c.num);
		System.out.println(c.count);
		c = new Counter();
		System.out.println(c.num);
		System.out.println(c.count);

	}

}
