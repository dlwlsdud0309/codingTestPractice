package practice.test.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone21 {
	HashMap<String, Object> data = new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone21 jc = new JavaBoard_clone21();
		jc.seeboard();
	}
	
	public void seeboard() {
		int number = 1;
		while(true) {
			System.out.println("===========================================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("===========================================");
		}
	}
}
