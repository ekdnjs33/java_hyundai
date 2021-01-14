package com.app7_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		// Map 계열: Key/value 쌍으로 저장, key 이용해서 value를 얻는다. 순서가 없다.  
		// HashMap, Properties 사용  
		
		// 1. HashMap ==> key/value가 임의의 데이터인 경우에 사용  
		HashMap<String, String> map = new HashMap<String, String>();
//		Map<String, String> map = new HashMap<String, String>(); // 다형성 적용(변수 하나로 하위 것 모두 관리 가능! 편리) 
		map.put("p1", "hong1");
		map.put("p2", "hong2");
		map.put("p3", "hong3");
		
		System.out.println("1. toString(): " + map);
		
		System.out.println("2. key 이용: " + map.get("p1"));
		System.out.println("2. key 이용: " + map.get("p5")); // key가 존재하지 않는 경우 null 반
		
		// key만 반환해주는 메서드 ***
		// key를 알아야지 뭘 할 수 있기 때문에 굉장히 많이 쓰는 메서드야.
		Set<String> keys = map.keySet();
		System.out.println("3. key만 출력: " + keys);

		// 값 수정
		map.replace("p1", "SSS");
		System.out.println("4. key 이용한 값 변경: " + map);
		
		// 값 삭제  
		map.remove("p2");
		System.out.println("5. key 이용한 값 삭제: " + map);

		
		System.out.println();
		
		// 2. Properties ==> key/value 모두 String인 경우에 최적화
		// 문자열에 최적화된 map 계열이다!
		Properties props = new Properties();
		props.setProperty("p1", "hong1");
		props.setProperty("p2", "hong2");
		props.setProperty("p3", "hong3");
		
		System.out.println("1. Properties 출력: " + props.getProperty("p1"));
		String str = props.getProperty("p2");
		System.out.println(str);
		System.out.println();

		// 운영체제의 시스템 환경 변수  ==> key/value 쌍으로 되어있고, 문자열로 설정되어 있다.  
		Properties systemProperties = System.getProperties();
		Set<String> keys2 = systemProperties.stringPropertyNames();
		for(String key : keys2) {
			System.out.println(key + " = " + systemProperties.getProperty(key));
		}
		
	}

}
