package com.app5_제어문;

import java.util.Scanner;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 제어문 
		 * 		단일 if
		 * 		if ~else 
		 * 		다중 if
		 * 		switch
		 * 
		 * 반복문
		 * 		for
		 * 		while
		 * 		do ~while
		 */
		
	
		// 키보드 입력 받기 
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		/* switch 문 */
		switch(num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("default");
			break;
		}// break는 옵션이다. break 안쓰면 밑에도 다 실행! 
		
		
		/* for 문 */
		// 반복 횟수 예측 가능시 
		for(int i=0, j=5; i<5 && j<10; i+=2, j++) {
			System.out.println("Java"+i+"\t"+j);
		}
		
		
		/* while 문 */
		// 반복 횟수 예측 불가능시, 무한루프 
		int k = 0;
		while(k < 5) {
			System.out.print("* ");
			k++;
		}
		
		// 무한루프 키보드 입력 받기
		while(true) {
			Scanner scan2 = new Scanner(System.in);
			String name = scan2.nextLine();
			System.out.println(name);
			if(name.equalsIgnoreCase("exit"))
				break;
		}
		System.out.println("------");
	}

}
