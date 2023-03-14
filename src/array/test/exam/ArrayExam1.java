package array.test.exam;

public class ArrayExam1 {
	public static void main(String[] args) {
		//배열선언
		int[] scores=new int[5];
		scores[0]=10;
		scores[1]=20;
		scores[2]=30;
		scores[3]=40;
		scores[4]=50;

		//반복문을 사용해서 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}
}
