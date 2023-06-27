package com.is.study1;

import java.util.Scanner;

public class Study2_ex2 {
	
	public static void main (String [] args) {
		System.out.println("Start");
		int num=10;
		Scanner sc = new Scanner(System.in);
		String name;
		
		//입력  출력
		// 1   1
		// 2   2
		// 3   3
		// 4   10
		// 5   11
		// 6   12
		// 7   13
		// 8   20
		// 9   21
		// 10  22
		// 16  40
		// 19  43
		// 20  50
		//400  1000
		System.out.println("입력하세요 ");
		int input=sc.nextInt();
		
		int output=input/4*10+input%4;
		
		
		System.out.println("input"+input+",output"+output);
		System.out.println("Finish");
	}

}
