package com.is.study1;

public class Study2_ex1 {
	
	public static void main(String [] args) {
		System.out.println("start");
		//int n=1623;
		//int result= n%100;
		
		//System.out.println("Result:"+result);
		
		//물건의 합계값
		int value=35740;
		
		//손님이 낸돈
		int don=50000;
		
		//잔돈 계산
		int jandon=don-value;//14760
		
		//
		
		int man=0;
		int chon=0;
		int back=0;
		int sib=0;
		
		man=jandon/10000;
		chon=jandon/1000-man*10;
		back=jandon/100-man*100-chon*10;
		sib=jandon/10-man*1000-chon*100-back*10;
		
		System.out.println("만원: "+man+"장");
		System.out.println("천원: "+chon+"장");
		System.out.println("백원: "+back+"개");
		System.out.println("십원: "+sib+"개");
		
		System.out.println("Finish");
	}
	

}
