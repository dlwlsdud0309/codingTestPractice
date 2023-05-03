package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_clone12 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_clone12 jb=new JavaBoard_clone12();
		jb.seeBoard();
	}
	
	public void seeBoard() {
		int number=1;
		
		while(true) {
			System.out.println("====================================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("====================================");
			
			for (int i = list.size()-1; i >= 0; i--) {
				//list.size()에서 -1하지 않을 경우 에러
				//i>0일 경우 게시글 번호 1이 나오지 않음
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("------------------------------------");
			}
		
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1: //조회
				System.out.println("조회할 글 번호 : ");
				int input1=sc.nextInt();
				seeDetail(input1);
				break;
			case 2: //등록
				putData(number);
				number++;
				list.add(data);
				break;
			case 0:
				System.out.println("JavaBoard exit");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	
	public void seeDetail(int input1) {
		System.out.println(input1+"번 게시글을 조회합니다.");
//		while(true) { //while(true)를 사용하면 콘솔창이 무한대로 돌아가는 것을 확인..
			for (int i = 0; i < list.size(); i++) {
				if((int)list.get(i).get("번호")==input1) {
					System.out.println("제목 : "+list.get(i).get("제목"));
					System.out.println("내용 : "+list.get(i).get("내용"));
					System.out.println("작성자 : "+list.get(i).get("작성자"));
					System.out.println("작성일 : "+list.get(i).get("작성일"));
				
					System.out.println("1.수정\t2.삭제\t3.목록");
					modifyDeleteList(input1);
				}
			}
//		}
	}
	
	public void modifyDeleteList(int input1) {
		int input=sc.nextInt();
		switch (input) {
		case 1:
			System.out.println("글을 수정합니다.");
			for (int i = 0; i < list.size(); i++) {
				if((int)list.get(i).get("번호")==input1) {
					System.out.println("제목 : ");
//					data.put("제목", sc.next());
					list.get(i).put("제목", sc.next());
					System.out.println("내용 : ");
//					data.put("내용", sc.next());
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
			break;
		case 3:
			
			return;

		default:
			break;
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
