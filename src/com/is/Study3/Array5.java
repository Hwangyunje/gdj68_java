package com.is.Study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		int [] nums = new int[6];
		Random random=new Random();
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
				//중복확인코드
				//i:0 이면 x
				//i:1 이면0비교
				//i:2 이면0,1비교
				//i:3 이면0,1,2비교
				//...
				
				for(int i1=0;i1<5;i1++) {
				}	for(int j1=i+1;j1<6;j1++) {
						if(nums[i]>nums[j]) {
							int tmp=nums[i];
							nums[i]=nums[j];
							nums[j]=tmp;
						} 
				}
				}
			}
			
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
