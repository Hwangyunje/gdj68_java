package com.is.study2;

public class condition2 {
	public static void main(String[] args) {
		
		//if - else
		//if(조건식){true일때실행
		//}else{false일떄실행}
		double avg=72.3;
		
    //		if(avg>=60) {
	//		System.out.println("합격");
	//	}else {
	//	System.out.println("불합격");
	//	}
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
}
