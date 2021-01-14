package com.app93_의존성감소;

import java.util.List;

public class DBService {

//	OracleDAO dao;
	MySQLDAO dao;
	
//	public void setDAO(OracleDAO dao) {
//		this.dao = dao;
//	}
	
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
	}
	
//	public List<String> connectOracle(){
//		return dao.connectOracle();
//	}
	
	public List<String> connectMySQL(){
		return dao.connectMySQL();
	}
	
}
