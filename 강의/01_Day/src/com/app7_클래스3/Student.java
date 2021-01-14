package com.app7_클래스3;

public class Student {


	//1. 인스턴스 변수
	/* 
	 *  목적: 데이터 저장
	 */
	String name;
	int age;
	String address;
	
	//2. 메서드
	/*
	 *  목적: 인스턴스 변수 관리 ( 수정, 조회)
	 * 
	 */
	//3. 생성자
	/*
	 *  목적: 인스턴스 변수 초기화
	 * 
	 *  문법:
	 *    public 클래스명([변수,변수2,..]){}
	 * 
	 *  특징: -명시적으로 생성자를 만들면 기본생성자는 자동생성 안됨.
	 *       -오버로딩 생성자(동일이름의 생성자 여러개 사용 가능)
	 *         변수의 갯수 또는
	 *         변수의 타입 또는
	 *         변수의 순서가 반드시 달라야 된다.
	 */
	public Student() {}
//	public Student(int n) {}
//	public Student(String n) {}
	public Student(String s, int s2, String s3) {
		name = s;
		age = s2;
		address = s3;
	}
}
