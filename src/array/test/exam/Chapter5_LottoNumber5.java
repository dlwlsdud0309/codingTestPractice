package array.test.exam;

public class Chapter5_LottoNumber5 {
	public static void main(String[] args) {
		int[] ball=new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i]=i+1;
		}
		
		int tmp=0; //두 값을 교환할 때 사용할 변수
//		int j=0; //임의의 값을 지정할 변수
		
		for (int i = 0; i < 6; i++) {
			int j=(int)(Math.random()*45);
			tmp=ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
		
	}
}
