package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
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
		
		//사용자가 종료시까지 loading되어야 하므로 while문이 필수임
		while(true) {
			System.out.println("===============================================");
			System.out.println("No\t제목\t작성자\t작성일");
			System.out.println("===============================================");
		
			
			//출력
			for (int i = list.size()-1; i >= 0; i--) {
				System.out.println(list.get(i).get("번호"));
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("조회할 게시물 번호 : ");
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data);
				System.out.println("작성하신 글이 등록되었습니다.");
				break;
			case 0:
				System.out.println("JavaBoard exit");
				System.exit(0);
				break;
			default :
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
		System.out.println("작성일 : ");
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", sdf.format(date));
	}
}
