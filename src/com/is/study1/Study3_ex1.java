package com.is.study1;

public class Study3_ex1 {
	public static void main(String[] args) {
		//국어,영어,수학 입력
		//총점 평균계산(평균은 int)
		//90:A,80:B,70:C,6:D그외:F
		// switch사용
		int avg=100;
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
		
		
		}
	}
}
