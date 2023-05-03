package practice.test.cal;

public class CalculatorExam {
	public static void main(String[] args) {
		CalculatorExam cal=new CalculatorExam();
		double returnVal=cal.add(7,5);
		System.out.println("add결과 : "+returnVal);

		double returnVal2=cal.sub(7, 5);
		System.out.println("sub결과 : "+returnVal2);
		
		double returnVal3=cal.multi(7, 5);
		System.out.println("multi결과 : "+returnVal3);

		double returnVal4=cal.div(7, 5);
		System.out.println("div결과 : "+returnVal4);

//		static
		double returnStaticVal=staticAdd(10,5);
		System.out.println("staticAdd결과 : "+returnStaticVal);
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public double sub(double x, double y) {
		return x-y;
	}

	public double multi(double x, double y) {
		return x*y;
	}

	public double div(double x, double y) {
		return x/y;
	}
	
	public static double staticAdd(double x, double y) {
		return x+y;
	}
}
