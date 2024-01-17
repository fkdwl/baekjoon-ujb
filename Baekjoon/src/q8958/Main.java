package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int[] numbers = new int[80];

		String O = "1";
		String X = "0";
		
		int a = Integer.parseInt(O);
		int b = Integer.parseInt(X);
		
		//System.out.println(a);
		//System.out.println(b);
		
		
		int n = sc.nextInt();
	
		for(int i=0; i<n; i++) {
			
			String score = sc.next();
			System.out.println(score);
		}
		sc.close();
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int t=0; t<n; t++) {
			String score = sc.next();
			//System.out.println(score);
			
			int sum = 0, cnt = 1;
			for(int i=0; i<score.length(); i++) {
				if(score.charAt(i) == 'O') {
					sum += cnt++;
				}else {
					cnt = 1;
				}
			}
			System.out.println(sum);
		}
		sc.close();
		
		
		
	}

}
