package coding.test.practice;

import java.util.Scanner;

public class PrintTheAddition {
	//코딩 기초 트레이닝
	//덧셈식 출력하기
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
