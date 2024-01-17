package q2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* 오답
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=a; i++) {
			for(int j=a-1, k=0; j>=0 && k<=j; j--, k++) {
				System.out.println(" ".repeat(j-k) + "*".repeat(i));
				//for(int k=0; k<=j; k++) {
					//System.out.println(" ".repeat(j-k) + "*".repeat(i));
				//}	
			}
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for(int i=0; i<N; i++) {
			//공백 출력
			for(int j=0; j<N-i-1; j++) {
				System.out.print(" ");
			}
			//* 출력
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
