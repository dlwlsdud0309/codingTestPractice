package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone10 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone10 jb=new JavaBoard_clone10();
		jb.seeboard();
	}
	
	public void seeboard() {
		int number=1;
		while(true) {
			System.out.println("===============================================");
			System.out.println("NO\t제목\t작성자\t작성일");
			System.out.println("===============================================");
		
			//출력
			for (int i = list.size()-1; i >=0; i--) {
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("-----------------------");
			}
			
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();

			switch (input) {
			case 1: //조회
				System.out.println("조회할 글 번호 : ");
				int input1=sc.nextInt();
				listData(input1);
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data);
				System.out.println("작성하신 글이 등록되었습니다.");
				break;
			case 3:
				System.out.println("javaBoard exit");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	public void listData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				System.out.println("제목 : "+list.get(i).get("제목"));
				System.out.println("내용 : "+list.get(i).get("내용"));
				System.out.println("작성자 : "+list.get(i).get("작성자"));
				System.out.println("작성일 : "+list.get(i).get("작성일"));
			
				modifyDeleteList(input1);
				return;
			}
		}
	}
	
	public void modifyDeleteList(int input1) {
		while(true) {
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
	
	public void deleteData(int input1) {
		System.out.println("글을 삭제합니다.");
		
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				list.remove(i);
			}
		}
	}
	
	public void modifyData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if((int)list.get(i).get("번호")==input1) {
				System.out.println("글을 수정합니다.");
				
				System.out.println("제목 : ");
				data.put("제목", sc.next());

				System.out.println("내용 : ");
				data.put("내용", sc.next());
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
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", sdf.format(date));
	}
}
