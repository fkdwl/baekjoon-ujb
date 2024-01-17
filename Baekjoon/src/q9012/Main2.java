package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			String inp = sc.next();
			
			boolean str = true;
			stk.clear();
			for (int j =0; j < inp.length(); j++) {
				if(inp.charAt(j) == '(') {
					stk.push('(');
				} else {
					if(stk.isEmpty()) {
						str = false;
						break;
					} else {
						stk.pop();
					}
				}
			}
			
			if (stk.isEmpty() && str == true) {
				System.out.println("Yes");
			} else {
				System.out.println("NO");
			}
			
			
				
		}
		sc.close();
	
		

	}

}
