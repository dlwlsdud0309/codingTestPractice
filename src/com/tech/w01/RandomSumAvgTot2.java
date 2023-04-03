package com.tech.w01;

public class RandomSumAvgTot2 {
	public static void main(String[] args) {
		int[] nums=new int[3]; //0,1,2
		nums[0]=(int)(Math.random()*900)+100;
		nums[1]=(int)(Math.random()*900)+100;
		nums[2]=(int)(Math.random()*900)+100;
	
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
