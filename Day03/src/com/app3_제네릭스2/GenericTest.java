package com.app3_제네릭스2;

import java.util.Date;

/*
 *   제네릭스(generics)
 *   ===> <T>
 */

//Box안에 여러가지 물건을 담을 수 있다. ==> Box안에 여러 데이터를 담을 수 있다. 
class Box{

	Object obj;
	// 다형성을 이용한 Object type 이용 가능하다! 
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		
		// 1. 문자열 저장 
		Box b = new Box();
		b.setValue("홍길동");
		b.setValue(100); // 잘못된 데이터인 경우 컴파일 에러 표시가 안뜬다, 런타임 때 오류가 뜬다!
						 // *** 가. 잘못된 데이터가 저장된 사실을 개발단계인 컴파일시점이 아닌 실제로 실행되는 런타임 시점에 확인할 수 있다는 문제 
		String str = (String)b.getValue(); // *** 나. 반드시 형변환이 필요하다는 문제 
		System.out.println("1. "+str);
		
		// 2. 날짜 저장
		Box b2 = new Box();
		b2.setValue(new Date());
		Date d = (Date)b2.getValue();
		System.out.println("2. "+d);


		
	}

}
