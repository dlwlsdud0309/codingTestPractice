package practice.test.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone15 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone15 jb=new JavaBoard_clone15();
		jb.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		
		while(true) {
			System.out.println("===============================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("===============================");
		
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("조회할 게시글 번호 : ");
				break;
			case 2:
				
				break;
			case 0:
				System.out.println("JavaBoard exit");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
