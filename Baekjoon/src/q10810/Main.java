package q10810;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		int num1, num3;
		String num2;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = String.valueOf(num1);
		num3 = sc.nextInt();
		
		int[] Arrays = new int[num2.length()];
		
		sc.close();
		
		//System.out.println(num1);
		//System.out.println(num2);
		*/
		
		
		//다른 풀이1
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();  //5
		int M = sc.nextInt();  //4
		
		int[] b = new int[N];
		
		//System.out.println(N + " " + M);
		
		for(int t=0; t<M; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			//System.out.println(i + " " + j + " " + k);
			
			for(int x=i-1; x<=j-1; x++) {
				b[x] = k;
			}
			
			/*
			for(int y=0; y<b.length; y++) {
				System.out.println(b[y] + " ");
			}
			System.out.println();
			*/
		}
		sc.close();
		
		for(int y=0; y<b.length; y++) {
			System.out.print(b[y] + " ");
		}
		System.out.println();
		
		
	}
		
}


