package com.is.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {
 public static void main(String[] args) {
	Random random= new Random();
	 //TRPG
	 int hp=40;//유저의 hp
	 int mosterHp=60;//몬스터의 HP
	 int monsterPower=40;//몬스터의공격력
	 //유저정보:hp,몬스터정보:hp
	 //1.평타 2.스킬 3.HP회복 4.도망
	 //평타:0~10미만의 공격이 Monster에게 적용
	 //스칼:0~30미만의 공격이 Monster에게 적용(최대3번까지만)
	 //회복:0~40까지 40X
	 //도망:50%의 확률로 성공,실패
	 
	 //Monster
	 //1:유저 공격 0~40의 공격을 유저에게
	 Scanner sc= new Scanner(System.in);
	 int monsterHp=60;
	while(!(hp==0)&&!(monsterHp==0)) {
		 int select=sc.nextInt();
		 if(select==1) {
			 int hit=random.nextInt(11);
			 System.out.println("몬스터에게"+hit+"의 데미지를 주었다.");
			 monsterHp-hit;
		 }else 
		if(select==2) {
			int skill=random.nextInt(31);
			System.out.println("몬스터에게"+skill+"의 데미지를 주었다.");
		}else
		 if(select==3) {
			int heal=random.nextInt(41);
			System.out.println("체력을"+heal+"회복하였다.");
		}else
		 if(select==4) {
			int run=random.nextInt(2);
			if(run==0) {
				System.out.println("무사히 도망쳤습니다");
			}else
				if(run==1) {
					System.out.println("도망칠 수 없습니다");
				}
		}
		}
		 
	 }
	 
	 
}

