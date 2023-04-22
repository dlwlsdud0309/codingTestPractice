package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		int number=1;
		while(true) {
			System.out.println("==================================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("==================================");
		
			for (int i = list.size()-1; i >=0; i--) {
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("------------------------------");
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("조회할 게시물 번호 : ");
			case 2:
				System.out.println("글을 등록합니다.");
				number++;
				putData(number);
				break;
			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	public void putData(int number) {
		data=new HashMap<String, Object>();
		
		data.put("번호", number);
		
		System.out.println("제목 : ");
		data.put("제목", sc.next());
		System.out.println("내용 : ");
		data.put("내용", sc.next());
		System.out.println("작성자 : ");
		data.put("작성자", sc.next());
		
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", format.format(date));
	}
}
