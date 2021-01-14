package com.app8_문자열;

public class StringBufferTest {

	public static void main(String[] args) {

		//버퍼로 하면 스트링이 계속 변경 저장된다. 새로 생성되지 않고 하나를 변경.
		StringBuffer buffer = new StringBuffer();
		
		// 1, 추가 
		buffer.append("Hello");
		buffer.append(30);
		buffer.append(true);
		buffer.append(new char[] {'A', 'B'});
		
		System.out.println(buffer);
		// 시험문제!! ( 참조변수를 프린트하면 관련된 메소드가 뭔지 )
		
		// 2, 삽입 
		buffer.insert(0, "홍길동");
		System.out.println(buffer);
		
		// 3, 삭제  
		buffer.delete(0, 3); // 0 ~ 2까지 삭제 
		System.out.println(buffer);
		
		System.out.println(buffer.charAt(0));
		System.out.println(buffer.indexOf("B"));
		System.out.println(buffer.substring(5)); // 5 ~ 끝까지 
		System.out.println(buffer.reverse()); // 거꾸로 

		
		// String 저장 : 마지막까지 변경된 것 적용되어 있어.
		String mesg = buffer.toString();
		System.out.println(mesg);

		
	}

}
