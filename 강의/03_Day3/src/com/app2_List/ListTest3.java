package com.app2_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		// Arrays.asList() 메서드 ===> 기존 리스트와 다르게 배열속성을 갖는다. 그래서 수정이 안된다.
		List<String> list = Arrays.asList("홍길동","이순신");
		
		list.add("유관순");
		
	}//end main
}






