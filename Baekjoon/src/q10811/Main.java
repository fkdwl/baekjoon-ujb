package q10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] ar = new int[n];
		int[] ar2 = new int[m];
		int[] ar3 = new int[m];
		int sum = 1;
		int sum2 = 0;
		
		for (int i=0; i<n; i++) {
			ar[i] = sum;
			sum++;
			System.out.print(ar[i] + " ");
		}
		
		System.out.println();
		
		for (int i=0; i<m; i++) {
			ar2[i] = sc.nextInt();
			ar3[i] = sc.nextInt();
			
			if (ar3[i] - ar2[i] == 1) {
				sum = ar[ar3[i]-1];
				ar[ar3[i]-1] = ar[ar2[i]-1];
				ar[ar2[i]-1] = sum;
				System.out.print(ar[ar3[i]] + " " + ar[ar2[i]] + " " );
			} else {
				for (int k=ar2[i]-1; k<ar3[i]; k++) {
					ar[k] = ar3[i] - k;
					System.out.print(ar[k] + " " );
				}
			}
			
		}
		
		System.out.println();
		
		// 최종 출력 
		for (int i=0; i<n; i++) {
			System.out.print(ar[i] + " ");
		

		sc.close();
	}

}
}
