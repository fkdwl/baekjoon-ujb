package q2440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();

		for (int i = a - 1; i >= 0; i--) {

			String result = new String(new char[i]).replace("\0", "*");
			// replace 메소드는 2개의 인수를 받는다. replace(교체 할 문자열 대상, 교체 문자열)
			// '\0'은 문자열의 끝을 찾아 *으로 바꾸는 null 문자이다.
			System.out.println("*" + result);

		}

		
		/* 다른 풀이 1 
		Scanner sc = new Scanner(System.in);
		  
		int a = sc.nextInt();
		  
		for(int i=a; i>=1; i--) { 
			System.out.println("*".repeat(i)); 
		}
		*/

		
		/* 다른 풀이 2
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

	}

}
