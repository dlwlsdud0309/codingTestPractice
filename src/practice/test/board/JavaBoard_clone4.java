package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class JavaBoard_clone4 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("javaBoard load");
		JavaBoard_clone4 jc=new JavaBoard_clone4();
		jc.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		
		while(true) {
			System.out.println("=====================================");
			System.out.println("NO\t제목\t작성자\t작성일");
			System.out.println("=====================================");
			
			for (int i = list.size()-1; i >= 0; i--) {
				
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("----------------------------------");
			}
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1:
				System.out.println("조회할 글 번호");
				int input1=sc.nextInt();
				listData(input1);
				break;
			case 2:
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
		//조회할 게시물의 번호 입력하여
		//해당 게시물의 제목, 내용, 작성자, 작성일 확인
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) { //미작성
			System.out.println("제목 : "+list.get(i).get("제목"));
			System.out.println("내용 : "+list.get(i).get("내용"));
			System.out.println("작성자 : "+list.get(i).get("작성자"));
			System.out.println("작성일 : "+list.get(i).get("작성일"));
			
//			상세정보 창에서 수정, 삭제, 목록 보기
			seeDetail(input1);
			
			return; //미작성

			}
		}
	}
	private void seeDetail(int input1) {
		while(true) {
			System.out.println("1.수정\t2.삭제\t3.목록");
			int input=sc.nextInt();
			switch (input) {
			case 1:
				for (int i = 0; i < list.size(); i++) {
					if ((int)list.get(i).get("번호")==input1) {
						System.out.println("글을 수정합니다.");
						System.out.println("제목 : ");
						list.get(i).put("제목", sc.next());
						System.out.println("내용 : ");
						list.get(i).put("내용", sc.next());
					}
				}
				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					if ((int)list.get(i).get("번호")==input1) {
						list.remove(i);
					}
				}
				return;
			case 3:
				return;
			}
		}
	}
	private void putData(int number) {
		
		data=new HashMap<String, Object>(); //미작성
		
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
