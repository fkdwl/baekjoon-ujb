package q18870;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();		
		
		int[] ar = new int[x];
		
		for (int i=0; i<x; i++) {
			ar[i] = sc.nextInt();
			//System.out.println(ar[i]);
		}
		sc.close();
		 
		int[] rank = new int[x];
		
		for(int i = 0; i < x; i++) {
			for(int j = x-1; j >= 0; j--) {
				if( i != j) {
					if(ar[i] < ar[j]) {
						rank[j]++;
						
					}
				}
			}
		}
		
		for(int i = 0; i < x; i++) {
			System.out.print(rank[i] + " ");
		}
		System.out.println();
		
		
		

	}

}
