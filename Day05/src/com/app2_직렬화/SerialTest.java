package com.app2_직렬화;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 *    객체 직렬화
 *  
 *  1. 개념?
 *  
 *    - 임의의 객체 생성했을 때  heap메모리에 생성된 인스턴스 정보중에서
 *      데이터(인스턴스 변수)를 
 *      파일이나 또는 네트워크 전송시 
 *      연속적인 byte데이터로 변환해야 되는데
 *      이 과정을 의미한다.
 * 
 *  2. 모든 클래스가 객체 직렬화가 가능한 것은 아니고
 *   반드시  implements Serializable 받은 클래스만 가능하다.
 *   대표> String  
 * 
 * 
 *  3. FileOutputStream
 *     FileInputStream
 *     ObjectInputStream
 *     ObjectOutputStream
 *     
 */

//  설정된 클래스가 직렬화될 수 있는 객체라고 알려주는 용도. ( marker interface )
class Person implements Serializable{
	
	String name;
	int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}