package com.is.study2;

import java.util.Scanner;

public class condition1 {
	
	public static void main(String[] args) {
		//if(조건식){조건식이 true일떄만 실행}
		
		//국어  영어,수학 입력
		//총점과 평균을 계산
		//평균이 90점이상이면 A를출력
		//평균이 80점이상이면 B를출력
		//평균이70점이상이면 C를출력
		//평균이60점이상이면 D를출력
		//그외는 F를출력

		int kor=90;
		int eng=95;
		int math=97;
		int total=kor+eng+math;
		int avr=total/3;
		String grade="F";
		if(avr>=90) {
			grade="A";//System.out.println('A');
		}
		if(avr>=80 && avr<90) {
			grade="B";//System.out.println('B');
		}
		if(avr>=70 && avr<80) {
			grade="C";//System.out.println('C');
		}
		if(avr>=60 && avr<70) {
			grade="D";//System.out.println('D');
		}
		
		
		System.out.println(grade);
		
	}

}
