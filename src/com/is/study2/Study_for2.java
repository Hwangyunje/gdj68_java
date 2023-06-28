package com.is.study2;

import java.util.Random;
import java.util.Scanner;

public class Study_for2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc= new Scanner(System.in);
//		for(in darn=2;darn<10;darn++) {
//			for(in i=1;i<10;i++) {
//				System.out.println(Darn+"*"+i"="+3*i);
//			}
//		}
		
		//종료할 분,초를 입력받아서
		//해당 분초가 되면 종료
		int m=sc.nextInt();
		System.out.println("분을 입력하세요");
		int s=sc.nextInt();
		System.out.println("초를 입력하세요");
		
		boolean check=false;
		
		for(int min=0;min<6;min++) {
			System.out.println(min+"분");			
			
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분"+sec+"초");
				if(min==m &&sec==s) {
					check=true;
					break;
				}
			}
			if(check) {
				break;
			}
		}
		//0분0초부터5분59초
		for(int m1=0;m1<6;m1++) {
		
			for(int s1=0;s1<60;s1++) {
				System.out.println(m1+":"+s1);
			}
		}
		
		
//		for(in i=0;i<5;i++) {
//			In numb= random.nextInt(3);//0~3미만의 정수하나를 랜덤으로 뽑음
//			
//			switch (numb) {
//			case 0:
//				System.out.println(Numb);
//				i=5;
//				break;
//			case 1:
//				System.out.println(Numb);
//			default:
//				System.out.println(Numb);
//			}
//		}
		System.out.println("프로그램 종료");
	}
}
