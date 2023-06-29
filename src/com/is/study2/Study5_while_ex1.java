package com.is.study2;

import java.util.Scanner;

public class Study5_while_ex1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		//while
		//1.로그인 시도 2.프로그램 종료
		int i=sc.nextInt();
		while(i==1) {
			System.out.println("로그인시도");
			int yid=sc.nextInt();
			int ypw=sc.nextInt();
			if(id==yid && pw==ypw) {
				System.out.println("로그인 성공");
				break;
			}
		} { 
			if(i==2) {
				System.out.println("프로그램 종료");
			}
		}
		//while끝
		
		//로그인 성공 했을때만진행
		//MMOPRG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//gold:0
		//5레벨 달성시 :1000gold지급
		//10레벨 달성시:2000gold지급
		//15레벨 달성시:3000gold지급
		//1->2:3 (사냥성공)
		//2->3:6
		//3->4:9
		//4->5:12
		//...
		//14->15:42
		//랩업시 게임을 계속할지 종료할지 선택
		int level=1;
		int gold=0;
		
		for(level=1;level<15;level++) {
			
			if(level==5) {
				System.out.println("5랩 달성 축하 합니다");
				gold = gold+1000;
			}
			if(level==10) {
				System.out.println("10랩 달성 축하 합니다");
				gold=gold+2000;
			}
			//랩업시 게임을 계속할지 종료할지 선택
			System.out.println("1.사냥시작 2.게입종료");
			int select=sc.nextInt();
			if(select !=1) {
				break;
			}
			
			for(int monster=0;monster<level*3;monster++) {
				System.out.println(monster+1+"마리 사냥 성공");
			}
			System.out.println(level+1+"로 랩업했습니다.");
		}
		
		if(level==15) {
			gold=gold+3000;
		}System.out.println("현재 레벨:"+level);
		System.out.println("현재 골드:"+gold);
	}   
		}

		//현재레벨,소유 gold가출력
		
	
	
	
	
	

