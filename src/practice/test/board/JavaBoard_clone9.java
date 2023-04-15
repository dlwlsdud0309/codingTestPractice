package practice.test.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone9 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone9 jc=new JavaBoard_clone9();
		jc.seeBoard();
	}
	
	public void seeBoard() {
		int number=1;
		System.out.println("===============================================");
		System.out.println("");
		System.out.println("===============================================");
	}
}
