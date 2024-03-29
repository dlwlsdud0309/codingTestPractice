package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard2 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	Scanner sc=new Scanner(System.in);
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();

	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard2 jb=new JavaBoard2();
		jb.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		while(true) {
			System.out.println("======================================");
			System.out.println("No\t제목\t작성자\t작성일");
			System.out.println("======================================");
			
			//출력
			for (int i = list.size()-1; i >= 0; i--) {
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("--------------------------------------");
			}
			
			System.out.println("1.조회\n2.등록\n0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1: //조회
				System.out.println("조회할 게시물 번호");
				int input1=sc.nextInt();
				listData(input1);
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data);
				System.out.println("작성하신 글이 등록되었습니다.");
				break;
			case 0:
				break;
			default:
				break;
			}
		}
	}
	private void listData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				System.out.println("제목 : "+list.get(i).get("제목"));
				System.out.println("내용 : "+list.get(i).get("내용"));
				System.out.println("작성자 : "+list.get(i).get("작성자"));
				System.out.println("작성일 : "+list.get(i).get("작성일"));
				
				seeDetail(input1);
				
				System.out.println();
				System.out.println("--------------------------------------");
		
				return;
			}
		}
	}
	private void seeDetail(int input1) {
		//수정,삭제,목록 보기
		while (true) {
			System.out.println("1.수정\t2.삭제\t3.목록");
			int input=sc.nextInt();
			switch (input) {
			case 1:
				modifyData(input1);
				break;
			case 2:
				deleteData(input1);
				return;
			case 3:
				return;

			default:
				break;
			}
		}
	}

	private void deleteData(int input1) {
		System.out.println("게시글을 삭제했습니다.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				list.remove(i);
			}
		}
	}

	private void modifyData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				System.out.println("게시글을 수정합니다.");
				
				System.out.println("제목 : ");
				list.get(i).put("제목", sc.next());
				System.out.println("내용 : ");
				list.get(i).put("내용", sc.next());
				System.out.println("작성자 : ");
				list.get(i).put("작성자", sc.next());
			}
		}
	}
	
	private void putData(int number) {
		//글작성
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
