package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard {
	HashMap<String, Object> data=new HashMap<String, Object>();
	Scanner sc=new Scanner(System.in);
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();

	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard jb=new JavaBoard();
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
	private void listData(int input1) { //조회할 게시물의 번호 입력하여 상세정보(제목, 내용, 작성자, 작성일) 확인
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) { //int로 형변환 필요
				System.out.println("제목 : "+list.get(i).get("제목"));
				System.out.println("내용 : "+list.get(i).get("내용"));
				System.out.println("작성자 : "+list.get(i).get("작성자"));
				System.out.println("작성일 : "+list.get(i).get("작성일"));
				
				return;
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
