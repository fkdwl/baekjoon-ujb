package q10430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
		while (true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a >= 2 && b >= 2 && c >= 2 && a <= 10000 && b <= 10000 && c <= 10000) {
				
				System.out.println((a+b)%c);
				System.out.println(((a%c) + (b%c))%c);
				System.out.println((a*b)%c);
				System.out.println(((a%c) * (b%c))%c);
				break;
				
			} else {
				
			}
			
		}
		

	}

}
