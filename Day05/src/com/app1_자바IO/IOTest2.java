package com.app1_자바IO;

import java.io.IOException;
import java.io.InputStream;

/*
 * 
 *     자바 I/O (Input/Output)
 *     
 *     1. 용어 정리
 *     
 *     from                        to
 *     키보드(표준입력)    | 자바 |     모니터(표준출력) : System.out.println(값);
 *     파일                         파일
 *     네트워크                      네트워크
 *     
 *     입출력 가능한 기본데이터
 *     - byte
 *     		: InputStream
 *     				- FileInputStream
 *     				  ...
 *     				- ObjectInputStream
 *     
 *     		: OutputStream
 *     				- FileOutputStream
 *     				  ...
 *     				- ObjectInputStream
 *     - char
 *     		: Reader
 *     				- InputStreamReader
 *     				- BufferedReader
 *     				- FileReader
 *     				...
 *     
 *     		: Writer
 *     				- PrintWriter
 *     				- FileWriter
 *     				...
 *     
 */

public class IOTest2 {

	public static void main(String[] args) {

		// 표준출력 ==> 콘솔에 출력
		System.out.println("hello");
		
		InputStream is = System.in;
		try {
			int n = is.read();
			System.out.println((char)n);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) 
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
