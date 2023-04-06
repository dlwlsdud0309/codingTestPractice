package practice.test.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone8 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone8 jc8=new JavaBoard_clone8();
		jc8.seeBoard();
	}
	
	public void seeBoard() {
		int input=sc.nextInt();
		while(true) {
			System.out.println("==================================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("==================================");
		
			
		}
	}
}
