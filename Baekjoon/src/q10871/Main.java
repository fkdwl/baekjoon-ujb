package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int c = sc.nextInt();
		
		//System.out.println(a);
		//System.out.println(b);
		
		int[] ar = new int[a];
		
		if (a >= 1 && b <= 10000) {
			
			for(int i = 0; i < ar.length; i++) {
				
				ar[i] = sc.nextInt();
				
				if (ar[i] >= 1 && ar[i] <= 10000) {
					if (b > ar[i]) {
						System.out.print(ar[i] + " ");
					}
				}
			
				
			}
			
		} 
		
	
	}

}
