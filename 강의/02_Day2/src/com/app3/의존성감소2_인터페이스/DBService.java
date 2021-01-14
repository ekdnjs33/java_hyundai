package com.app3.의존성감소2_인터페이스;

import java.util.List;

public class DBService {

//	OracleDAO dao;
//	MySQLDAO dao;
	DBDAO dao;  //다형성
	
	public void setDAO(DBDAO dao) {
		this.dao = dao;
	}
	
	public List<String> connectOracle(){
		return dao.connect();
	}
	
}
