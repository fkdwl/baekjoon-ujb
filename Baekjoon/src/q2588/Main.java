package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num1, num2;
		String num3;

		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = String.valueOf(num2);

		int[] Arrays = new int[num3.length()];
		sc.close();

		for (int i = 0; i < num3.length(); i++) {
			Arrays[i] = num3.charAt(i) - '0';
		}

		System.out.println(num1 * Arrays[2]);
		System.out.println(num1 * Arrays[1]);
		System.out.println(num1 * Arrays[0]);
		System.out.println(num1 * num2);

		
		
		// 다른 풀이1 - 숫자로 처리
		// Scanner sc = new Scanner(System.in);

		// int num1 = sc.nextInt();
		// int num2 = sc.nextInt();
		// sc.close();

		// int h = num2 / 100;
		// int t = num2 % 100 / 10;
		// int o = num2 % 10;

		// System.out.println(num2 * o);
		// System.out.println(num2 * t);
		// System.out.println(num2 * h);
		// System.out.println(num1 * num2);

		
		// 다른 풀이2
		// Scanner sc = new Scanner(System.in);
		// int num1 = sc.nextInt();
		// String num2 = sc.next();
		// sc.close();

		
		// char c = num2.charAt(2);
		// int ic = Character.getNumericValue(c);
		// System.out.println(num1 * ic);

		// c = num2.charAt(1);
		// int ic = Character.getNumericValue(c);
		// System.out.println(num1 * ic);

		// c = num2.charAt(0);
		// int ic = Character.getNumericValue(c);
		// System.out.println(num1 * ic);

		
		//이렇게도 가능 - for문 이용
		// for(int i=2; i>=0; i--) {
		// char c = num2.charAt(i);
		// int ic = Character.getNumericValue(c);
		// System.out.println(num1 * ic);
		// }

		// int ic2 = Integer.parseInt(num2);
		// System.out.println(num1 * ic2);

		
	}

}
