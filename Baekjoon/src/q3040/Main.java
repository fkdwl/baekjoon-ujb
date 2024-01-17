package q3040;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int[] nums1 = new int[9];
		int[] nums = new int[7];
		
		
		for(int i=0; i<nums1.length; i++) {
			nums1[i] = sc.nextInt();
		}
		sc.close();
		
		int out = 0;
		for(int i = 0; i<nums.length; i++) {
			nums[i] = rand.nextInt(nums1[i]);
			out += nums[i];
			//System.out.println(nums1[nums[i]]);
			if(out == 100) {
				System.out.println(nums1[nums[i]]);
			}else {
				System.out.println(nums1[nums[i]]);
			}
		}
		
		System.out.println(out);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] inp = new int[9];
		for(int i=0; i<inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<inp.length; i++) {
			System.out.print(inp[i] + " ");
		}
		System.out.println();
		
		
		int sum = 0;
		for(int i=0; i<inp.length; i++) {
			sum += inp[i];
		}
		
		//System.out.println("sum = " + sum);
		
		for(int a=0; a<inp.length; a++) {
			for(int b=0; b<inp.length; b++) {
				if(a != b) {
					int svSum = sum - inp[a] - inp[b];
					if(svSum == 100)
						//System.out.println(inp[a] + " " + inp[b] + " => " + svSum);
					
						for(int i=0; i<inp.length; i++) {
							if(i != a && i != b) {
								System.out.println(inp[i]);
							}
						}
						System.exit(0);
				}
			}	
		}
	
	}

}

//Integer.parseInt = 문자열을 정수로 바꿔준다