package practice.test.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class JavaBoard_Practice3 {
	HashMap<String, Object> data=new HashMap<String, Object>();
	ArrayList<HashMap<String, Object>> list=new ArrayList<HashMap<String,Object>>();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("JavaBoard load");
		JavaBoard_Practice3 jp=new JavaBoard_Practice3();
		jp.seeBoard();
	}
	
	private void seeBoard() {
		int number=1;
		while(true) {
			System.out.println("==============================");
			System.out.println("NO\tTITLE\tWRITER\tDATE");
			System.out.println("==============================");
		
			//data 출력 위해 for문 사용
			for (int i = list.size()-1; i >=0; i--) {
				System.out.print(list.get(i).get("번호"));
				System.out.print("\t"+list.get(i).get("제목"));
				System.out.print("\t"+list.get(i).get("작성자"));
				System.out.print("\t"+list.get(i).get("작성일"));
				System.out.println();
				System.out.println("---------------------------");
			}
			
			
			System.out.println("1.조회\t2.등록\t0.종료");
			int input=sc.nextInt();
			
			switch (input) {
			case 1: //조회
				System.out.println("조회할 게시물 번호를 입력하세요.");
				int input1=sc.nextInt();
				readData(input1);
				break;
			case 2: //등록
				putData(number);
				System.out.println("작성하신 글이 등록되었습니다.");
				number++;
				list.add(data);
				break;
			case 0: //종료
				System.out.println("JavaBoard가 종료되었습니다.");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
	private void readData(int input1) {
		//조회할 게시물 번호 입력하여 해당 게시글의 상세정보 확인
		System.out.println(input1+"번 게시글을 확인합니다.");
		for (int i = 0; i < list.size(); i++) {
			if ((int)list.get(i).get("번호")==input1) {
				System.out.println("제목 : "+list.get(i).get("제목"));
				System.out.println("내용 : "+list.get(i).get("내용"));
				System.out.println("작성자 : "+list.get(i).get("작성자"));
				System.out.println("작성일 : "+list.get(i).get("작성일"));
			
			}
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
		SimpleDateFormat format=new SimpleDateFormat("yy-MM-dd");
		data.put("작성일", format.format(date));
	}
}
