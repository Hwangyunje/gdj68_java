package com.is.study2;

import java.util.Scanner;

public class Study4_for_ex2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		boolean loginResult=false;
		//로그인 시도 최대5번까지
		for(int count=0;count<5;count++) {

			System.out.println("id를 입력하세요");
			int yid=sc.nextInt();
			System.out.println("pw를 입력하세요");
			int ypw=sc.nextInt();
			if(yid==id && ypw==pw) {
				System.out.println("로그인 성공");
				count=5;
				loginResult=!loginResult;
			} 
				else{
			System.out.println("id 또는 pw가 틀렸습니다");
			}
		}
		
		
		//로그인 성공시 급여계산 출력
		if(loginResult) {
			System.out.println("급여계산");
		}
		
		System.out.println("프로그램 종료");
	}
}
