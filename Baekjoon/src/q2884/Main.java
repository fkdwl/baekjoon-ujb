package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int a = 45;
		int b;
		
		if (h >= 0 & h <= 23 & m >= 0 & m <= 59) {
			
			if ((m - a) < 0) {
				if (h - 1 < 0) {
					
					h = 23;
					b = 60 - (a - m);
					System.out.printf("%d %d", h, b);
					
				} else {
					h -= 1;
					b = 60 - (a - m);
					System.out.printf("%d %d", h, b);
				}
			
			}
			
			
		}
		

	}

}
