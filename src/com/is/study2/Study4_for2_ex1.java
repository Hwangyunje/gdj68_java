package com.is.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//FPS
		//30발, 3탄창
		//M16,2가지: 단발, 3점사
		
		//1.단발, 2.점사
		//탕, 타타탕
		for(int mag=0;mag<3;mag++) {
			System.out.println("1.단발 2.점사");
			int select=sc.nextInt();
			int count=10;
			String sound="타타탕";
			if(select==1) {
				count=30;
				sound="탕";
			}
//			}	else  {
//				count=10;}
//				sound="타타탕";
//		}
					for(int 탕=0;탕<count;탕++) {
						System.out.println(sound);
					}
		}
	}
}
		
		
		
		
		
	

