package com.app3.의존성감소2_인터페이스;

import java.util.Arrays;
import java.util.List;

public class OracleDAO implements DBDAO{

	//oracle연동해서 데이터 반환
	@Override
	public List<String> connect(){
		List<String> list = Arrays.asList("홍길동","이순신","유관순");
		return list;
	}
}
