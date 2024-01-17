package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.println("*".repeat(i));
		}
		
		//.repeat(); > 메소드는 문자열을 곱할 때 사용한다.

	}

}
