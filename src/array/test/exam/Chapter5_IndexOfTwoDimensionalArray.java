package array.test.exam;

public class Chapter5_IndexOfTwoDimensionalArray {
	public static void main(String[] args) {
		//2차원 배열의 인덱스
		//p.148
		
		//배열이름[행index][열index] 예)score[3][2]
		
		//행index의 범위는 '0~행의 길이 -1'
		//열index의 범위는 '0~열의 길이 -1'
		
		int[][] score=new int[4][3]; //4행3열의 2차원 배열 score를 생성
		
		//배열 score의 1행 1열에 100을 저장
		score[0][0]=100;
		System.out.println(score[0][0]); //배열 score의 1행 1열의 값을 출력
	}
}
