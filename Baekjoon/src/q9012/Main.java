package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		//Stack<String> stk = new Stack<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			String inp = sc.next();
			
			int cnt = 0;
			for (int j = 0; j < inp.length(); j++) {
				if(inp.charAt(j) == '(') {
					cnt--;
				} else {
					cnt++;
					if (cnt > 0) {
						break;
					}
				}
			}	
			
			if (cnt == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
				
		}
		sc.close();
		
		
		
		
	}

}
