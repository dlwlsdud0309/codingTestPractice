package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
				System.out.println("조회할 게시물 번호 : ");
				int input1=sc.nextInt();
				seeListDetail(input1);
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
	public void seeListDetail(int input1) {
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) { //입력한 값이 list에 저장된 '번호'와 일치한다면
				//조회할 글의 제목, 내용, 작성자, 작성일 전부 확인하는 페이지
				System.out.println("제목 : "+list.get(i).get("제목"));
				System.out.println("내용 : "+list.get(i).get("내용"));
				System.out.println("작성자 : "+list.get(i).get("작성자"));
				System.out.println("작성일 : "+list.get(i).get("작성일"));
			
				modifyDeleteList(input1); //확인할 게시물의 번호가 입력되면 실행되는 메소드
				//modifyDeleteList에도 seeListDetail에서 받은 매개변수 input1값이
				//들어가야 조회시 "1.수정\t2.삭제\t.3.목록"가 출력된다.
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
				modifyData(input);
				break;
			case 2:
				
				break;
			case 3:
				
				return;
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
