package com.tech.w01;

public class MultiplicationTable {
	public static void main(String[] args) {

		int n = 5; // 피라미드의 높이
		for (int i = 1; i <= n; i++) {
            // 왼쪽에 공백을 출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 가운데에 별을 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 다음 행으로 이동
            System.out.println();
		}
		
//		이 코드는 피라미드의 높이를 n 변수로 조절할 수 있습니다. n 값을 변경하여 원하는 피라미드 높이를 설정할 수 있습니다. 코드는 두 개의 중첩된 루프를 사용하여 각 행에 공백과 별표를 출력합니다.
//
//		첫 번째 루프(for (int j = 1; j <= n - i; j++))는 왼쪽에 필요한 공백을 출력합니다. n - i 만큼의 공백을 출력하므로 맨 위 행에서는 거의 공백이 없고 아래로 갈수록 공백이 늘어납니다.
//
//		두 번째 루프(for (int k = 1; k <= 2 * i - 1; k++))는 가운데에 별표를 출력합니다. 2 * i - 1 개의 별표를 출력하여 각 행마다 별표 개수를 조절합니다.
//
//		이 코드를 실행하면 입력한 높이에 맞는 피라미드가 출력됩니다.
            
		System.out.println("====");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for (int i = 0; i < 5; i++) {
////			System.out.print("@");
//			for (int j = 0; j <i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("============");
//		
//		for (int i = 5; i >0 ; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i <= 3; i++) {
//			System.out.print("@");
//			for (int j = 0; j < i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i < 5; i++) {
//			for (int j = i; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("======");
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("i="+i+" "+"j="+j+"\t"); //가로 정렬, i가 0일 때 j가 4까지 출력되며 종료
//			}
//			System.out.println(); //이후 enter되어 반복, i가 1일 때 j는 4까지 반복
//		}
//		
//		System.out.println("======");
//		
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				if ((j*i)<10) {
//					System.out.print(j+" * "+i+" = "+"  "+(j*i));
//				} else {
//					System.out.print(j+" * "+i+" = "+" "+(j*i));
//				}
//				System.out.print("  |  ");
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.println("======");
//		for (int i = 2; i <= 9; i++) {
////			System.out.print("i = "+i+" ");
////			System.out.print("2 * "+i+" = "+(2*i)+" ");
//			for (int j = 2; j <= 9; j++) {
////				System.out.print(i+","+j+"\t");
////				System.out.print("j = "+j+" ");
//				if((i*j)<10) {
//					System.out.print(i+" * "+j+" =  "+(i*j)+"\t");
//				}else {
//				System.out.print(i+" * "+j+" = "+(i*j)+"\t");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("======");
		
	}
	
}
