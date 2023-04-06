package coding.test.practice;

public class ToGetDiscountsOnClothes {
	public int solution(int price) {
		int answer = 0;
//		if(price >= 500000) {
//            return (int) (price*0.80);
//        } else if(price >= 300000) {
//        	return (int) (price*0.9);
//        } else if(price >= 100000) {
//        	return (int) (price*0.95);
//        } else {
//        	return price;
//        }
		
		if(price<100000) { //10만원 미만일 경우
			answer=price;
		}else if (100000<=price && price<300000) {
			answer=(int)(price*0.95);
		}else if(300000<=price && price<500000){
			answer=(int)(price*0.9);
		}else {
			answer=(int)(price*0.8);
		}
//		answer=(int)Math.floor(answer);
        
        return answer;
    }
	public static void main(String[] args) {
		ToGetDiscountsOnClothes tgdoc=new ToGetDiscountsOnClothes();
		int answer=tgdoc.solution(580000);
		System.out.println(answer);
	}
}
