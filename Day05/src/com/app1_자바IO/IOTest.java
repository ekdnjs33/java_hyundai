package com.app1_자바IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {

	public static void main(String[] args) {

		InputStream is = System.in; // byte처리, 한 글자 밖에 못 읽어
		InputStreamReader reader = null; //byte --> char로 읽도록 변환
		BufferedReader buffer = null; // char --> 한 라인씩 문자열로 읽도록 변환
		System.out.println("이름입력");
		
		reader = new InputStreamReader(is);
		buffer = new BufferedReader(reader);
		
		try {
			String str = buffer.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(buffer!=null)
					buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
