package com.app1_자바IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		File f = new File("c:\\temp\\IOTest.java"); // File 생성 능력은 없고, 단지 메타정보만 제공
		
		BufferedReader buffer = null;
		try {
			FileReader reader = new FileReader(f);
			buffer = new BufferedReader(reader);
			String line = buffer.readLine();
			while(line!=null) {
				System.out.println(line);
				line = buffer.readLine();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}
