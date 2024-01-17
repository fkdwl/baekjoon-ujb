package q1152;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer stChange = new StringTokenizer(str, " ");
		
		int tokensCount  = stChange.countTokens();
		
		System.out.println(tokensCount);
		
		/*
		System.out.println(str);
		System.out.println(stChange);
		while(stChange.hasMoreElements())
			System.out.println(stChange.nextToken() + " ");
		*/	
		
		/*
		String tokens[] = str.trim().split(" ");
		
		if(tokens[0] == " " ) {
			System.out.println(tokens.length - 1);
		} else {
			System.out.println(tokens.length);
		}
		*/	

	}

}
