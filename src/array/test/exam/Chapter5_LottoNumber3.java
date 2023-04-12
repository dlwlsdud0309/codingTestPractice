package array.test.exam;

public class Chapter5_LottoNumber3 {
	public static void main(String[] args) {
		int[] ball=new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i]=i+1;
		}
		
		int tmp=0;
		int j=0;
		
		//0부터 5번째 요소까지 모두 6개만 바꾼다
		for (int i = 0; i < 6; i++) {
			j=(int)(Math.random()*45); //0~44범위의 임의의 값을 얻는다
			tmp=ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
		
	}
}
