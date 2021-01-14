package com.app93_의존성감소;

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
 *  TestMain  ---> DBService ------> OracleDAO ----> 오라클
 * 
 * 
 */


public class TestMain {

	public static void main(String[] args) {
		
		DBService service = 
				new DBService();
		// Main입장에서 Oracle 연동하겠다 의미
		
//		service.setDAO(new OracleDAO());
		service.setDAO(new MySQLDAO());
		
//		List<String> list = 
//				service.connectOracle();
		
		// *** 의존성감소2에서 줄줄이 안바꿔도 된다. Main에서 수정 필요 없음. 
		// 의존성감소와 꼭 비교해서 어떤 차이가 있는지 숙지!
		
		List<String> list = service.connectMySQL();
		
		System.out.println(list);
	}

}
