package q10998;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a > 0 && b < 10) {
			System.out.println(a * b);
		}

	}

}
