package com.is.study2;

public class Study4_for_ex1 {
	public static void main(String[] args) {
		//0부터10미만의 숫자 중 짝수만 출력
		
		for(int num=0;num<10;num++) {
			if(num%2==0) {
		System.out.println(num);
		}
	}
		//0-10미만의 숫자중 짝수만 출력
		//단, if문 사용 X
		for(int i=0;i<10;i=i+2) {
			System.out.println(i);
			//i++;
		}
		
		//a-z 출력
	
		for(int i=97;i<123;i++) {
			System.out.println((char)i);
		}
		
}
	}
