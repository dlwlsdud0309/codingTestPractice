package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone13 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone13 jb=new JavaBoard_clone13();
		jb.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		
		while(true) {
			System.out.println("==============================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("==============================");
		
			for (int i = list.size()-1; i >= 0; i--) {
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("----------------------------");
			}
			
			
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1: //조회
				System.out.println("조회할 게시글 번호 : ");
				int input1=sc.nextInt();
				seeDetail(input1);
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data);
				System.out.println("게시글을 등록합니다.");
				break;
			case 0: //종료
				System.out.println("JavaBoard exit");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	
	private void seeDetail(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if((int)list.get(i).get("번호")==input1) {
				System.out.println("제목 : "+list.get(i).get("제목"));
				System.out.println("내용 : "+list.get(i).get("내용"));
				System.out.println("작성자 : "+list.get(i).get("작성자"));
				System.out.println("작성일 : "+list.get(i).get("작성일"));
				
				modifyDeleteList(input1);
			}
		}
	}
	
	private void modifyDeleteList(int input1) {
		System.out.println("1.수정\t2.삭제\t3.목록");
		int input=sc.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("글을 수정합니다");
			
			for (int i = 0; i < list.size(); i++) {
				if((int)list.get(i).get("번호")==input1) {
					System.out.println("제목 : ");
					list.get(i).put("제목", sc.next());
					System.out.println("내용 : ");
					list.get(i).put("내용", sc.next());
				}
			}
			break;
		case 2:
			for (int i = 0; i < list.size(); i++) {
				if((int)list.get(i).get("번호")==input1) {
					list.remove(i);
				}
			}
			System.out.println("글을 삭제합니다.");
			break;
		case 3:
			
			return;

		default:
			break;
		}
	}
	
	private void putData(int number) {
		data=new HashMap<String, Object>();
		
		data.put("번호", number);
		
		System.out.println("제목 : ");
		data.put("제목", sc.next());
		
		System.out.println("내용 : ");
		data.put("내용", sc.next());

		System.out.println("작성자 : ");
		data.put("작성자", sc.next());
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", sdf.format(date));
	}
}
