package com.tech.w01;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if ((j*i)<10) {
					System.out.print(j+" * "+i+" = "+"  "+(j*i));
				} else {
					System.out.print(j+" * "+i+" = "+" "+(j*i));
				}
				System.out.print("  |  ");
			}
			System.out.println();
		}
		
		
		System.out.println("======");
		for (int i = 2; i <= 9; i++) {
//			System.out.print("i = "+i+" ");
//			System.out.print("2 * "+i+" = "+(2*i)+" ");
			for (int j = 2; j <= 9; j++) {
//				System.out.print(i+","+j+"\t");
//				System.out.print("j = "+j+" ");
				if((i*j)<10) {
					System.out.print(i+" * "+j+" =  "+(i*j)+"\t");
				}else {
				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
				}
			}
			System.out.println();
		}
		System.out.println("======");
		
	}
	
}
