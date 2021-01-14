package com.app3.의존성감소2_인터페이스;

import java.util.List;

public interface DBDAO {

	
	//DB 연동시 필요한 메서드를 추상 메서드
	public abstract List<String> connect();
}
