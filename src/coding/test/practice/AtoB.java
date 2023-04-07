package coding.test.practice;

public class AtoB {
    public int solution(String before, String after) {
        int answer = 0;
        String str="";
        
        for (int i = before.length()-1; i >=0; i--) {
        	str=str+before.charAt(i);
//        	if (str.equals(after)) {
//				answer=1;
//			}else if(!str.equals(after)) {
//				answer=0;
//			}
		}
        if (str.equals(after)) {
			answer=1;
		}else {
			answer=0;
		}
        System.out.println(str);
        System.out.println(after);
        
        return answer;
    }
	public static void main(String[] args) {
		AtoB atb=new AtoB();
		int answer=atb.solution("allpe", "apple");
		System.out.println(answer);
	}
}
