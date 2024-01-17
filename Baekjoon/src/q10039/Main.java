package q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[5];
		int sum = 0;
		
		for (int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] < 40) {
				ar[i] = 40;
			}
			sum += ar[i];
		}

		System.out.println(sum / 5);
		//System.out.println(sum / ar.length);  이 코드가 더 좋은 코드이다.
		sc.close();
		
	}

}
