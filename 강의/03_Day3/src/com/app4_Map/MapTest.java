package com.app4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// Map계열:  key/value 쌍으로 저장. key이용해서 value 얻는다.  순서가 없다.  HashMap, Properties 사용

		//1. HashMap ==> key/value가 임의의 데이터인 경우에 사용
		Map<String, String> map = new HashMap<String, String>(); //다형성 적용
						 map  = new TreeMap<String, String>();
		//데이터 저장
		map.put("p1", "홍길동1");
		map.put("p2", "홍길동2");
		map.put("p3", "홍길동3");
		
		//데이터 출력
		System.out.println("1. toString() 이용:" + map);
		
		System.out.println("2. key 이용:" + map.get("p1"));
		System.out.println("2. key 이용:" + map.get("p3"));
		System.out.println("2. key 이용:" + map.get("p5"));  // null
		
		//key만 반환
	    Set<String>	 keys =map.keySet();
		System.out.println("3. key만 출력:" + keys);  //[p1, p2, p3]
	    
	    //값 수정
		map.replace("p1", "이순신");
		System.out.println("4. key이용한 값변경:" + map);
		
		//값 삭제
		map.remove("p2");
		System.out.println("5. key이용한 값 삭제:" + map);
		
		System.out.println("6. map 크기: " + map.size());
		
		//전체 삭제
		map.clear();
		System.out.println("7. 전체 삭제:" + map); //{}
		
		//2. Properties==> key/value 모두 String 인  경우에 최적화
		
		Properties props = new Properties();
		
		props.setProperty("p1", "홍길동1");
		props.setProperty("p2", "홍길동2");
		props.setProperty("p3", "홍길동3");
		
		System.out.println("8. Properties 출력:" + props.getProperty("p1"));
		String str = props.getProperty("p2");
		System.out.println(str);
		
		// 운영체제의 시스템 환경 변수==> key/value 쌍으로 되어 있고 문자열로 설정되어 있다.
		
		Properties systemProperties = System.getProperties();
		Set<String> keys2 = systemProperties.stringPropertyNames();
		for (String key : keys2) {
			System.out.println(key + " = " + systemProperties.getProperty(key));
		}
		
	}//end main
}//end clas









