package q2480;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//int inp1 = (int) (Math.random() * 6) + 1;
		//int inp2 = (int) (Math.random() * 6) + 1;
		//int inp3 = (int) (Math.random() * 6) + 1;
		//int[] ar = {inp1, inp2, inp3};
		int[] ar = new int[3];
		
		for(int h=0; h<ar.length; h++) {
			ar[h] = sc.nextInt();
		}
		
		//System.out.print(ar[0] + " ");
		//System.out.print(ar[1] + " ");
		//System.out.print(ar[2] + " ");
		//System.out.println();
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int n = 0;
		
		int max = - 100;

		if (ar[0] >= 1 & ar[0] <= 6 & ar[1] >= 1 & ar[1] <= 6 & ar[2] >= 1 & ar[2] <= 6 ) {
			
			for (int i=0; i<ar.length; i++) {
				for (int k=0; k<ar.length; k++) {
					
					//System.out.println(ar[i] + " " + ar[k]);
				
					if (ar[i] == ar[k]) {
						sum++;
						sum3++;
		
						if(sum3 == 2) {
							n = ar[i];
						}
						
					} else {
						max = Math.max(max, ar[i]);
						sum2 ++;
					}
					
				}
			}
			
			//System.out.println(sum);
			//System.out.println(sum2);
			//System.out.println(max);
			//System.out.println(n);

			if (sum == 9) {  // 같은게 3개 일 때
				int x = 10000 + n * 1000;
				System.out.println(x);
			} else if (sum == 5) {  // 같은게 2개 일 때
				int x = 1000 + n * 100;
				System.out.println(x);
			} else if (sum2 == 6) {
				int x =  max * 100;
				System.out.println(x);
			}
			
		}

	}

}