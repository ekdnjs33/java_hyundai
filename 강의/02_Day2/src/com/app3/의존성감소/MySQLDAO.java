package com.app3.의존성감소;

import java.util.Arrays;
import java.util.List;

public class MySQLDAO {
	//oracle연동해서 데이터 반환
		public List<String> connectMySQL(){
			List<String> list = Arrays.asList("홍길동1","이순신1","유관순1");
			return list;
		}
}
