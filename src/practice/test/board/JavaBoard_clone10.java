package practice.test.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone10 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone10 jb=new JavaBoard_clone10();
		jb.seeboard();
	}
	
	public void seeboard() {
		int number=1;
		while(true) {
			System.out.println("===============================================");
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.println("===============================================");
		
			int input=sc.nextInt();
			switch (input) {
			case 1: //조회
				System.out.println("조회할 글 번호 : ");
				break;
			case 2: //등록
				
				break;
			case 3:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
