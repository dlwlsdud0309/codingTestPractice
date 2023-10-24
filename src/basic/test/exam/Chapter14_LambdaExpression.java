package basic.test.exam;

public class Chapter14_LambdaExpression {
//	int max(int a, int b) {
//		return a>b ? a:b;
//	}
//	
//	(int a, int b) -> {
//		return a>b ? a:b; };
	
//	(String name, int i) -> 
//		System.out.println(name+"="+i)
	
	
	
	interface MyFunction{
		int calc(int x, int y);
	}
	
	public static void main(String[] args) {
		MyFunction add=(x,y)->{
			return x+y;
		};
		MyFunction minus=(x,y)->x-y;
		
		System.out.println("add : "+add.calc(1, 2));
		System.out.println("minus : "+minus.calc(1, 2));
	}
	
}
