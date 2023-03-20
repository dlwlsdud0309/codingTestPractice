package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone1 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		
		JavaBoard_clone1 jc=new JavaBoard_clone1();
		jc.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		while (true) {
			System.out.println("============================");
//			System.out.println("1.조회\t2.등록\t3.종료"); //오답
			System.out.println("NO\t제목\t작성자\t작성일"); //미작성
			System.out.println("============================");
			
			for (int i = list.size()-1; i >= 0; i--) {
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목")); //println을 쓰면
				System.out.print("\t"+list.get(i).get("작성자")); //개행되므로
				System.out.print("\t"+list.get(i).get("작성일"));
				//번호,제목,작성자,작성일을 한줄로 표현하기 위해 print를 사용
				System.out.println();
				System.out.println("---------------------------");
			}
		
			System.out.println("1.조회\t2.등록\t0.종료"); //미작성
			int input=sc.nextInt();
			
			switch (input) {
			case 1: //조회
				System.out.println("조회할 게시글 번호 : ");
				int input1=sc.nextInt();
				listData(input1);
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data); //미작성
				System.out.println("작성하신 글이 등록되었습니다."); //미작성
				break;
			case 0: //미작성
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
				
				return;
			}
		}
	}
	
	private void seeDetail(int input1) { //상세정보 창에서 수정하기
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

	private void deleteData(int input1) {
		System.out.println("글을 삭제합니다.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				list.remove(i);
			}
		}
	}

	private void modifyData(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				System.out.println("글을 수정합니다.");
				
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
		data=new HashMap<String, Object>(); //미작성
		
		data.put("번호", number);
		
		System.out.println("제목 : ");
		data.put("제목", sc.next());
		System.out.println("내용 : ");
		data.put("내용", sc.next());
		System.out.println("작성자 : ");
		data.put("작성자", sc.next());
		
//		System.out.println("작성일 : "); //이건 쓸 필요없습니다
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", format.format(date));
		
	}
}
