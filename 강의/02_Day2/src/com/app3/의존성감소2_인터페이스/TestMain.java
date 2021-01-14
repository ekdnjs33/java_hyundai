package com.app3.의존성감소2_인터페이스;

import java.util.List;

/*
 *   DB 연동 아키텍쳐
 *   
 *   
 *   Main <------> Service <--------> DAO <------> DB(오라클)
 *   
 *  Main: 화면처리 + 사용자이벤트 발생 + 데이터출력 기능
 *  Service: 중간자 역할 + 트랜잭션 처리
 *  DAO: Database Access Object 패턴이고 
 *      실제 DB,file 접근하는 용도
 *      
 *   
 *   
 *  TestMain  ---> DBService ------> OracleDAO ----> 오라클
 *                                   MySQLDAO ----> MySQL    
 * 
 *  ==>  DB 변경시 DBSevice 변경 여파가 미친다. 
 *  
 *  * 인터페이스 이용한 의존성 감소
 *  
 * 
 */




public class TestMain {

	public static void main(String[] args) {
		
		DBService service = 
				new DBService();
		// Main입장에서 Oracle 연동하겠다 의미
//		service.setDAO(new OracleDAO());
		
		// Main입장에서 MySQ 연동하겠다 의미
		service.setDAO(new MySQLDAO());
		
		List<String> list = 
				service.connectOracle();
		System.out.println(list);
	}

}
