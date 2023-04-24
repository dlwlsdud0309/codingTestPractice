package practice.test.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone6 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone6 jc=new JavaBoard_clone6();
		jc.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		while(true) {
			System.out.println("=========================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("=========================");
			
			for (int i = list.size()-1; i >=0 ; i--) {
				System.out.println(list.get(i).get("번호"));
				System.out.println("\t"+list.get(i).get("제목"));
				System.out.println("\t"+list.get(i).get("작성자"));
				System.out.println("\t"+list.get(i).get("작성일"));
			}
			System.out.println("1.조회\t2.등록\t0.종료");
			
			int input=sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("조회할 게시물 번호");
				break;
			case 2: //이해가 잘 안되고 있다...
//				listData(input);
				putData(number);
				number++;
				list.add(data);
				System.out.println("게시물이 등록되었습니다.");
				return;
			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	
	public void putData(int number) {
		
	}
}
